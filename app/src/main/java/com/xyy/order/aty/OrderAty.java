package com.xyy.order.aty;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;
import com.xyy.order.R;
import com.xyy.order.adapter.OrderAdapter;
import com.xyy.order.base.BaseAty;
import com.xyy.order.fgt.OrderFragment;
import com.xyy.order.fgt.RestaurantFragment;
import com.xyy.order.utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

@Layout(R.layout.aty_order)
public class OrderAty extends BaseAty {
    @BindView(R.id.backdrop)
    ImageView backdrop;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.collapsing)
    CollapsingToolbarLayout collapsing;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    List<Fragment> mFragments;
    String[]  mTitles=new String[]{
            "Restaurant","Order","Reviews(1)"
    };
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> lists = new ArrayList<>();
    @Override
    public void initViews() {
        StatusBarUtil.StatusBarLightMode(this);
        ButterKnife.bind(this);
        super.initViews();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lists.add("Restaurant");
        lists.add("Order");
        lists.add("Reviews(6)");
//        for (int i = 0; i < 3; i++) {

            fragments.add(new RestaurantFragment());
            fragments.add(new OrderFragment());
            fragments.add(new OrderFragment());
//        }
        OrderAdapter orderAdapter = new OrderAdapter(getSupportFragmentManager(), fragments, lists);
        viewpager.setAdapter(orderAdapter);
        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.setupWithViewPager(viewpager);
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        super.initDatas(paramer);
    }

    @Override
    public void setEvents() {
        super.setEvents();

    }

    private void setupViewPager() {
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        mFragments=new ArrayList<>();
        for(int i=0;i<mTitles.length;i++){
//            mFragments.add(mTitles[i].toString());
//            ListFragment listFragment = ListFragment.newInstance(mTitles[i]);
//            mFragments.add(listFragment);
        }
//        BaseFragmentAdapter adapter =
//                new BaseFragmentAdapter(getSupportFragmentManager(),mFragments,mTitles);



//        viewPager.setAdapter(adapter);
    }
}
