package com.xyy.order.fgt;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;
import com.xyy.order.R;
import com.xyy.order.aty.EditInformationAty;
import com.xyy.order.aty.NoticeAty;

/**
 * A simple {@link Fragment} subclass.
 */
@Layout(R.layout.fragment_profile)
public class ProfileFragment extends BaseFragment {
    private ImageView iv_edit,iv_notice;
    @Override
    public void initViews() {
        iv_edit = findViewById(R.id.fgt_profile_iv_edit);
        iv_notice = findViewById(R.id.fgt_profile_iv_notice);
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void setEvents() {
        iv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(EditInformationAty.class);
            }
        });
        iv_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(NoticeAty.class);
            }
        });
    }
}
