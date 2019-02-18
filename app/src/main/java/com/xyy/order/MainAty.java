package com.xyy.order;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;
import com.xyy.order.base.BaseAty;
import com.xyy.order.fgt.DealsFragment;
import com.xyy.order.fgt.HomeFragment;
import com.xyy.order.fgt.ProfileFragment;
import com.xyy.order.fgt.RestaurantsFragment;
import com.xyy.order.utils.StatusBarUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 2018年12月4日09:10:06
 * 主界面
 * Hzy
 * win_hzy@163.com
 */
@Layout(R.layout.aty_main)
public class MainAty extends BaseAty {

    FragmentManager fragmentManager;
    @BindView(R.id.main_vp)
    FrameLayout mainVp;
    @BindView(R.id.main_rg)
    RadioGroup mainRg;
    @BindView(R.id.dd5)
    ImageView dd5;
    RadioButton[] rb;
    FragmentTransaction ft;
    ArrayList<Fragment> list;
    int index;
    @Override
    public void initViews() {
        StatusBarUtil.StatusBarLightMode(this);
        ButterKnife.bind(this);
        list = new ArrayList<>();
        //添加Fragment
        list.add(new HomeFragment());
        list.add(new RestaurantsFragment());
        list.add(new DealsFragment());
        list.add(new ProfileFragment());
        int childCount = mainRg.getChildCount();
        rb = new RadioButton[mainRg.getChildCount()];
        for (int i = 0; i < rb.length; i++) {
            rb[i] = (RadioButton) mainRg.getChildAt(i);
        }
        rb[0].setChecked(true);
        fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();
        ft.add(R.id.main_vp, list.get(0));
        ft.commit();
        //刚进来选中第一个
        for (int i = 0; i < 4; i++) {
            if (i==0) {
                rb[0].setTextColor(Color.parseColor("#333333"));
            }   else {
                rb[i].setTextColor(Color.parseColor("#999999"));
            }
        }
        //RadioGroup点击事件
        mainRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                FragmentTransaction ft = fragmentManager.beginTransaction();
                for (int j = 0; j < rb.length; j++) {
                    if (rb[j].getId() == i) {
                        //选中改变字体颜色
                        rb[j].setTextColor(Color.parseColor("#333333"));
                        if (list.get(j).isAdded()) {
                            ft.show(list.get(j)).hide(list.get(index)).commit();
                        } else {
                            ft.add(R.id.main_vp, list.get(j)).hide(list.get(index)).commit();
                        }
                        index = j;
                    }else {
                        //未选择字体颜色
                        rb[j].setTextColor(Color.parseColor("#999999"));
                    }

                }
            }
        });
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {

    }

    @OnClick(R.id.dd5)
    public void onViewClicked() {
        //TODO:点击二维码图标要做的操作
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }
}