package com.xyy.order.fgt;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;
import com.xyy.order.R;
import com.xyy.order.aty.PayNowAty;

import java.util.ArrayList;
import java.util.List;

/**
 * 点餐fragment
 */
@Layout(R.layout.fragment_order)
public class OrderFragment extends BaseFragment {
    ListView lv;
    List<String> list = new ArrayList<>();
    public static int INDEX = 0;
    orderLvAdapter adapter;
    TextView tv_pay;
    @Override
    public void initViews() {
        lv = findViewById(R.id.fgt_order_lv);
        tv_pay = findViewById(R.id.fgt_order_pay_now);
    }

    @Override
    public void initDatas() {
        list.add("Starters");
        list.add("Soups");
        list.add("Main Courses");
        list.add("Noodles");
        list.add("Pastries");
        list.add("Drinks");
        list.add("Refreshments");
        list.add("Starters");
        list.add("Dream");

        adapter = new orderLvAdapter(list, getContext());
        lv.setAdapter(adapter);
    }

    @Override
    public void setEvents() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                INDEX = i;
                adapter.notifyDataSetChanged();
            }
        });
        tv_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(PayNowAty.class);
            }
        });
    }
    public class orderLvAdapter extends BaseAdapter {
        private List<String> list;
        Context context;
        private LayoutInflater mLayout;
        public orderLvAdapter(List<String> list,Context context) {
            this.list = list;
            this.context = context;
            mLayout = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder vh = null;
            if (view == null){
                view = mLayout.inflate(R.layout.order_tv_layout,null);
                vh = new ViewHolder();
                vh.tv = view.findViewById(R.id.order_tv);
                view.setTag(vh);
            }else {
                vh = (ViewHolder) view.getTag();
            }
            vh.tv.setText(list.get(i));
            if (INDEX == i){
                vh.tv.setBackgroundColor(Color.parseColor("#ffffff"));
            }else {
                vh.tv.setBackgroundColor(Color.parseColor("#f5f5f5"));
            }
            return view;
        }
        class ViewHolder{
            TextView tv;
        }
    }
}