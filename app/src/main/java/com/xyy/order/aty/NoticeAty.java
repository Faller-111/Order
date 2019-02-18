package com.xyy.order.aty;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.kongzue.baseframework.interfaces.Layout;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xyy.order.R;
import com.xyy.order.adapter.NoticeRvAdapter;
import com.xyy.order.base.BaseAty;
import com.xyy.order.utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Layout(R.layout.aty_notice)
public class NoticeAty extends BaseAty {
    @BindView(R.id.aty_notice_back)
    ImageView atyNoticeBack;
    @BindView(R.id.fgt_profile_header)
    RelativeLayout fgtProfileHeader;
    @BindView(R.id.aty_notice_rv)
    RecyclerView atyNoticeRv;
    @BindView(R.id.aty_notice_refreshLayout)
    SmartRefreshLayout atyNoticeRefreshLayout;

    @Override
    public void initViews() {
        super.initViews();
        ButterKnife.bind(this);
        StatusBarUtil.StatusBarLightMode(this);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            list.add(i+"");
        }
        NoticeRvAdapter adapter = new NoticeRvAdapter(R.layout.item_notice_layout);
        atyNoticeRv.setLayoutManager(new LinearLayoutManager(me));
        adapter.setNewData(list);
        atyNoticeRv.setAdapter(adapter);
    }


    @OnClick(R.id.aty_notice_back)
    public void onViewClicked() {
        finish();
    }
}
