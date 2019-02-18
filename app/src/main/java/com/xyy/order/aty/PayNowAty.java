package com.xyy.order.aty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;
import com.xyy.order.R;
import com.xyy.order.base.BaseAty;
import com.xyy.order.utils.StatusBarUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Layout(R.layout.aty_pay_now)
public class PayNowAty extends BaseAty {

    @BindView(R.id.activity_edit_information_back)
    ImageView activityEditInformationBack;
    @BindView(R.id.aty_pay_now_lv)
    ListView atyPayNowLv;
    @BindView(R.id.aty_pay_now_price)
    TextView atyPayNowPrice;
    @BindView(R.id.aty_pay_now_post)
    TextView atyPayNowPost;
    private paynowLvAdapter adapter;
    @Override
    public void initViews() {
        ButterKnife.bind(this);
        StatusBarUtil.StatusBarLightMode(this);
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            str.add("");
        }
        adapter = new paynowLvAdapter(str,this);
        atyPayNowLv.setAdapter(adapter);
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {

    }
    public class paynowLvAdapter extends BaseAdapter {
        private ArrayList<String> list;
        Context context;
        private LayoutInflater mLayout;
        public paynowLvAdapter(ArrayList<String> list,Context context) {
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
            view = mLayout.inflate(R.layout.pay_now_item_layout,null);
            return view;
        }
    }
    @OnClick({R.id.activity_edit_information_back, R.id.aty_pay_now_post})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.activity_edit_information_back:
                finish();
                break;
            case R.id.aty_pay_now_post:
                break;
        }
    }
}