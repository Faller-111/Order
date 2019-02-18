package com.xyy.order.base;

import android.content.Context;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.util.JumpParameter;
import com.xyy.order.utils.LocalManageUtil;

/**
 * 开发者： Hzy
 * 创建时间： 2018/12/4 004 8:37:08.
 * 功能描述：Activity基类
 * 联系方式： win_hzy@163.com
 */
public abstract class BaseAty extends BaseActivity{
    @Override
    public void initViews() {

    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalManageUtil.setLocal(newBase));
    }
}
