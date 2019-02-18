package com.xyy.order.fgt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;
import com.ramotion.foldingcell.FoldingCell;
import com.xyy.order.R;
import com.xyy.order.adapter.FoldingCellListAdapter;
import com.xyy.order.adapter.Item;

import java.util.ArrayList;

@Layout(R.layout.fragment_deals)
public class DealsFragment extends BaseFragment {

    ListView fragmentDiscountCouponLv;

    @Override
    public void initViews() {
        fragmentDiscountCouponLv = findViewById(R.id.fragment_discount_coupon_lv);
        ArrayList<String> str = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            str.add("");
//        }
        ArrayList<Item> items = Item.getTestingList();
        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(getContext(), items);
        fragmentDiscountCouponLv.setAdapter(adapter);
        fragmentDiscountCouponLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ((FoldingCell) view).toggle(false);
                // register in adapter that state for selected cell is toggled
                adapter.registerToggle(i);
            }
        });
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void setEvents() {

    }
    public class statisticsLvAdapter extends BaseAdapter {
        private ArrayList<String> list;
        Context context;
        private LayoutInflater mLayout;
        public statisticsLvAdapter(ArrayList<String> list,Context context) {
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
            view = mLayout.inflate(R.layout.discount_coupon_layout,null);
            return view;
        }
    }

}
