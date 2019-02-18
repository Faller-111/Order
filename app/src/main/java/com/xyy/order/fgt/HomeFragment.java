package com.xyy.order.fgt;


import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.view.Gravity;

import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.superluo.textbannerlibrary.TextBannerView;
import com.xyy.order.R;
import com.xyy.order.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
@Layout(R.layout.fragment_home)
public class HomeFragment extends BaseFragment {
    private SmartRefreshLayout smartRefreshLayout;
    private Banner banner;
    private TextBannerView tv_banner;
//    private RecyclerView recyclerView;
    private List<Integer> path_list = new ArrayList<>();
    private List<String> talk_list = new ArrayList<>();
    @Override
    public void initViews() {
//        smartRefreshLayout = findViewById(R.id.fgt_home_refreshLayout);
        banner = findViewById(R.id.fgt_home_banner);
        tv_banner = findViewById(R.id.tv_banner);
//        recyclerView = findViewById(R.id.fgt_home_rv);
//        path_list.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
//        path_list.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
//        path_list.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
//        path_list.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");
        path_list.add(R.drawable.xq_pic11);
        path_list.add(R.drawable.xq_pic22);
        path_list.add(R.drawable.xq_pic33);
        path_list.add(R.drawable.xq_pic44);
        banner.setImages(path_list);
        //设置轮播间隔时间
        //设置图片加载器，图片加载器在下方
        banner.setImageLoader(new GlideImageLoader());
        banner.setDelayTime(3000);
        banner.start();
        talk_list.add("终于等到你了");
        talk_list.add("掉进相声坑");
        talk_list.add("笑掉大牙了");
        talk_list.add("一言一笑");
//        tv_banner.setDatas(talk_list);
        Drawable drawable = getResources().getDrawable(R.mipmap.sc_star);
        tv_banner.setDatasWithDrawableIcon(talk_list,drawable,14, Gravity.LEFT);
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void setEvents() {

    }

}
