package com.xyy.order.fgt;


import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseokhttp.HttpRequest;
import com.kongzue.baseokhttp.listener.ResponseListener;
import com.kongzue.baseokhttp.util.BaseOkHttp;
import com.kongzue.baseokhttp.util.Parameter;
import com.kongzue.dialog.v2.WaitDialog;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xyy.order.R;
import com.xyy.order.adapter.RestaurantsRvAdapter;
import com.xyy.order.aty.OrderAty;
import com.xyy.order.entity.RestaurantsBean;
import com.xyy.order.entity.TestEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
@Layout(R.layout.fragment_restaurants)
public class RestaurantsFragment extends BaseFragment implements View.OnClickListener{
    SmartRefreshLayout smartRefreshLayout;
    List<List<String>> list = new ArrayList<>();
    private List<String> lists = new ArrayList<>();
    RecyclerView fgtRestaurantsRv;
    RestaurantsRvAdapter adapter;
    ImageView iv_qh;
    private boolean is_qh = false;
    private int page = 1;
    @Override
    public void initViews() {
        fgtRestaurantsRv = findViewById(R.id.fgt_restaurants_rv);
        smartRefreshLayout = findViewById(R.id.fgt_home_refreshLayout);
        iv_qh = findViewById(R.id.fgt_restaurants_qh);
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            str.add("");
        }
        for (int i = 0; i < 10; i++) {
            lists.add(i+"");
            list.add(lists);
        }
        adapter = new RestaurantsRvAdapter(R.layout.item_restaurants_layout);
//        adapter.setNewData(list);
        fgtRestaurantsRv.setAdapter(adapter);
        fgtRestaurantsRv.setLayoutManager(new LinearLayoutManager(me));
        loadData();
//        fgtRestaurantsRv.setAdapter(new RestaurantsFragment.statisticsLvAdapter(str,getContext()));
    }

    @Override
    public void initDatas() {
        loadData();
        String str = "{\n" +
                "\t\"nearby\": 5,\n" +
                "\t\"opening\": 1,\n" +
                "\t\"type\": 9,\n" +
                "\t\"more\": [0, 1],\n" +
                "\t\"reorder\": 0,\n" +
                "\t\"page\": {\n" +
                "\t\t\"pageNumber\": 1,\n" +
                "\t\t\"pageSize\": 10\n" +
                "\t},\n" +
                "\t\"position\": {\n" +
                "\t\t\"x\": 116.308734,\n" +
                "\t\t\"y\": 40.060905\n" +
                "\t}\n" +
                "}";
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        TestEntity.PageBean pageBean = new TestEntity.PageBean(1, 10);
        TestEntity.PositionBean positionBean = new TestEntity.PositionBean(104.3432, 45.5456);
        TestEntity testEntity = new TestEntity(1,2,4,5,pageBean,positionBean,list);
        Log.d("jsonstring", "initDatas: ============"+testEntity.toString());
    }

    @Override
    public void setEvents() {

//        fgtRestaurantsRv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                jump(OrderActivity.class);
//            }
//        });
        //刷新
        smartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                page = 1;
                loadData();
            }
        });
        smartRefreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                page++;
                loadData();
            }
        });
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                jump(OrderAty.class);
            }
        });
        iv_qh.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fgt_restaurants_qh:
                if (is_qh == false){
                    is_qh = true;
                    adapter = new RestaurantsRvAdapter(R.layout.item_big_restaurants_layout);
//                    adapter.setNewData(list);
                    fgtRestaurantsRv.setAdapter(adapter);
                    iv_qh.setImageResource(R.mipmap.daliebiao);
                    fgtRestaurantsRv.setLayoutManager(new GridLayoutManager(me, 2, LinearLayoutManager.VERTICAL, false));
                }else {
                    is_qh = false;
                    iv_qh.setImageResource(R.mipmap.liebiao);
                    adapter = new RestaurantsRvAdapter(R.layout.item_restaurants_layout);
//                    adapter.setNewData(list);
                    fgtRestaurantsRv.setAdapter(adapter);
                    fgtRestaurantsRv.setLayoutManager(new LinearLayoutManager(me));
                }
                loadData();
                break;
        }
    }


    private void loadData(){
        WaitDialog.show(me, "数据加载中");
        BaseOkHttp.overallHeader = new Parameter()
                .add("ContentType", "application/json")
        ;
        HttpRequest.JSONPOST(me, "http://paylist.instanceof.cn:8080/restaurant/getListByNearby", "{\n" +
                "\t\"nearby\": 5,\n" +
                "\t\"opening\": 1,\n" +
                "\t\"type\": 9,\n" +
                "\t\"price\": 1,\n" +
                "\t\"more\": [0, 1],\n" +
                "\t\"reorder\": 0,\n" +
                "\t\"page\": {\n" +
                "\t\t\"pageNumber\": 1,\n" +
                "\t\t\"pageSize\": 10\n" +
                "\t},\n" +
                "\t\"position\": {\n" +
                "\t\t\"x\": 116.5454,\n" +
                "\t\t\"y\": 40.15048\n" +
                "\t}\n" +
                "}", new ResponseListener() {
            @Override
            public void onResponse(String response, Exception error) {
                WaitDialog.dismiss();
                smartRefreshLayout.finishRefresh();
                smartRefreshLayout.finishLoadmore();
                Gson gson = new Gson();
                RestaurantsBean orderListBean = gson.fromJson(response, RestaurantsBean.class);
                if (page == 1) {
                    adapter.setNewData(orderListBean.getData().getList());
                } else {
                    if (orderListBean.getData() == null || orderListBean.getData().getList().size() == 0) {
                        toast("没有更多数据了");
                        return;
                    }
                    adapter.addData(orderListBean.getData().getList());
                }
                adapter.notifyDataSetChanged();
            }
        });

    }
}