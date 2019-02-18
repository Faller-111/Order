package com.xyy.order.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 开发者： Hzy
 * 创建时间： 2018/12/17 017 8:39:36.
 * 功能描述：
 * 联系方式： win_hzy@163.com
 */
public class OrderAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragmentList;
    private List<String> titleList;

    public OrderAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
