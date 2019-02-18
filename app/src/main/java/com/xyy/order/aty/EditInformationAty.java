package com.xyy.order.aty;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;
import com.xyy.order.R;
import com.xyy.order.base.BaseAty;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Layout(R.layout.aty_edit_information)
public class EditInformationAty extends BaseAty {
    @BindView(R.id.activity_edit_information_back)
    ImageView activityEditInformationBack;
    @BindView(R.id.activity_edit_information_iv_right1)
    ImageView activityEditInformationIvRight1;
    @BindView(R.id.activity_edit_information_iv_right_zxing)
    ImageView activityEditInformationIvRightZxing;
    @BindView(R.id.activity_edit_information_iv_right2)
    ImageView activityEditInformationIvRight2;
    @BindView(R.id.activity_edit_information_iv_right3)
    ImageView activityEditInformationIvRight3;
    @BindView(R.id.activity_edit_information_iv_right4)
    ImageView activityEditInformationIvRight4;
    @BindView(R.id.activity_edit_information_iv_right_ming)
    ImageView activityEditInformationIvRightMing;
    @BindView(R.id.activity_edit_information_tv_woman)
    TextView activityEditInformationTvWoman;
    @BindView(R.id.activity_edit_information_rl_sex)
    RelativeLayout activityEditInformationRlSex;
    @BindView(R.id.activity_edit_information_iv_right_wx)
    ImageView activityEditInformationIvRightWx;
    @BindView(R.id.activity_edit_information_rl_wx)
    RelativeLayout activityEditInformationRlWx;
    @BindView(R.id.activity_edit_information_iv_right6)
    ImageView activityEditInformationIvRight6;
    @BindView(R.id.activity_edit_information_rl_cjcity)
    RelativeLayout activityEditInformationRlCjcity;
    @BindView(R.id.activity_edit_information_iv_right_hotel)
    ImageView activityEditInformationIvRightHotel;
    @BindView(R.id.activity_edit_information_rl_hotel)
    RelativeLayout activityEditInformationRlHotel;
    @BindView(R.id.activity_edit_information_iv_right7)
    ImageView activityEditInformationIvRight7;
    @BindView(R.id.activity_edit_information_rl_grjj)
    RelativeLayout activityEditInformationRlGrjj;
    @BindView(R.id.activity_edit_information_iv_rz1)
    ImageView activityEditInformationIvRz1;
    @BindView(R.id.activity_edit_information_tv_rz1)
    TextView activityEditInformationTvRz1;
    @BindView(R.id.activity_edit_information_rl_owners)
    RelativeLayout activityEditInformationRlOwners;
    @BindView(R.id.activity_edit_information_iv_rz5)
    ImageView activityEditInformationIvRz5;
    @BindView(R.id.activity_edit_information_tv_rz5)
    TextView activityEditInformationTvRz5;
    @BindView(R.id.activity_edit_information_rl_hzrz2)
    RelativeLayout activityEditInformationRlHzrz2;
    @BindView(R.id.activity_edit_information_iv_rz4)
    ImageView activityEditInformationIvRz4;
    @BindView(R.id.activity_edit_information_tv_rz4)
    TextView activityEditInformationTvRz4;
    @BindView(R.id.activity_edit_information_iv_rz6)
    ImageView activityEditInformationIvRz6;
    @BindView(R.id.activity_edit_information_tv_rz6)
    TextView activityEditInformationTvRz6;
    @BindView(R.id.activity_edit_information_rl_hzrz3)
    RelativeLayout activityEditInformationRlHzrz3;
    @BindView(R.id.activity_edit_information_iv_rz7)
    ImageView activityEditInformationIvRz7;
    @BindView(R.id.activity_edit_information_tv_rz7)
    TextView activityEditInformationTvRz7;
    @BindView(R.id.activity_edit_information_rl_hzrz4)
    RelativeLayout activityEditInformationRlHzrz4;
    @BindView(R.id.activity_edit_information_iv_rz8)
    ImageView activityEditInformationIvRz8;
    @BindView(R.id.activity_edit_information_tv_rz8)
    TextView activityEditInformationTvRz8;
    @BindView(R.id.activity_edit_information_rl_hzrz6)
    RelativeLayout activityEditInformationRlHzrz6;
    @BindView(R.id.activity_edit_information_iv_rz2)
    ImageView activityEditInformationIvRz2;
    @BindView(R.id.activity_edit_information_tv_rz2)
    TextView activityEditInformationTvRz2;
    @BindView(R.id.activity_edit_information_rl_hzrz)
    RelativeLayout activityEditInformationRlHzrz;

    @Override
    public void initViews() {
        super.initViews();
        ButterKnife.bind(this);

    }

    @Override
    public void initDatas(JumpParameter paramer) {
        super.initDatas(paramer);
    }

    @Override
    public void setEvents() {
        super.setEvents();
    }


    @OnClick(R.id.activity_edit_information_back)
    public void onViewClicked() {
        finish();
    }
}