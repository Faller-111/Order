package com.xyy.order.adapter;

import android.widget.ImageView;
import android.widget.RatingBar;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xyy.order.R;
import com.xyy.order.entity.RestaurantsBean;

import java.math.RoundingMode;

/**
 * 开发者： Hzy
 * 创建时间： 2018/12/24 024 18:13:20.
 * 功能描述：
 * 联系方式： win_hzy@163.com
 */
public class RestaurantsRvAdapter extends BaseQuickAdapter<RestaurantsBean.DataBean.ListBean,BaseViewHolder> {


    public RestaurantsRvAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, RestaurantsBean.DataBean.ListBean item) {
        ImageView img = helper.itemView.findViewById(R.id.item_restaurants_pic);
        RatingBar ratingBar = helper.itemView.findViewById(R.id.item_talk_star);
        ratingBar.setRating(new Float(item.getScore()));
        Glide.with(mContext).load(item.getAvatar()).into(img);
        helper.setText(R.id.item_restaurants_distance,cutDoubleNumber(item.getDistance())+"km")
        .setText(R.id.item_restaurants_name,item.getName());

    }
    public static String cutDoubleNumber(Double number) {
//
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.FLOOR);
        String d=df.format(number);
        //四舍五入保留两位小数,number.toString()是一个Double值
//        double v = new BigDecimal(number.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return d;
    }
}