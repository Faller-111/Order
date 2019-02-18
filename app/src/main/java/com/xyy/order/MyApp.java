package com.xyy.order;

import android.content.Context;
import android.content.res.Configuration;
import android.support.multidex.MultiDexApplication;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.kongzue.dialog.v2.DialogSettings;
import com.xyy.order.utils.LocalManageUtil;

import static com.kongzue.dialog.v2.DialogSettings.THEME_DARK;
import static com.kongzue.dialog.v2.DialogSettings.THEME_LIGHT;
import static com.kongzue.dialog.v2.DialogSettings.TYPE_IOS;

/**
 * 开发者： Hzy
 * 创建时间： 2018/12/3 003 16:22:15.
 * 功能描述：Application
 * 联系方式： win_hzy@163.com
 */
public class MyApp extends MultiDexApplication{
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        LocalManageUtil.setApplicationLanguage(this);

        DialogSettings.use_blur = true;                 //设置是否启用模糊

        DialogSettings.type = TYPE_IOS;
        DialogSettings.tip_theme = THEME_DARK;
        DialogSettings.dialog_theme = THEME_LIGHT;
//        DialogSettings.tip_theme = THEME_LIGHT;

        DialogSettings.dialog_title_text_size = -1;     //设置对话框标题文字大小，<=0不启用
        DialogSettings.dialog_message_text_size = -1;   //设置对话框内容文字大小，<=0不启用
        DialogSettings.dialog_button_text_size = -1;    //设置对话框按钮文字大小，<=0不启用
        DialogSettings.tip_text_size = -1;              //设置提示框文字大小，<=0不启用
        DialogSettings.dialog_menu_text_size = -1;    //设置菜单默认字号，<=0不启
        DialogSettings.ios_normal_button_color = -1;
    }
    @Override
    protected void attachBaseContext(Context base) {
        //保存系统选择语言
        LocalManageUtil.saveSystemCurrentLanguage(base);
        super.attachBaseContext(LocalManageUtil.setLocal(base));
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //保存系统选择语言
        LocalManageUtil.onConfigurationChanged(getApplicationContext());
    }
}
