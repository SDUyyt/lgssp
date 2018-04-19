package com.example.sdu.lgssp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sdu.lgssp.bean.OrderBean;
import com.example.sdu.lgssp.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/19.
 */
public class MakeOrderListAdapter extends BaseAdapter{

    private ArrayList<OrderBean> orderList;
    private Context context;

    public MakeOrderListAdapter(Context context, ArrayList<OrderBean> orderList){
        this.context = context;
        this.orderList = orderList;
    }

    @Override
    public int getCount() {
        return orderList.size();
    }

    @Override
    public Object getItem(int i) {
        return orderList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.menu_item, null);
        TextView name = (TextView) view.findViewById(R.id.order_name);
        TextView price = (TextView) view.findViewById(R.id.order_price);
        TextView type = (TextView) view.findViewById(R.id.order_type);
        TextView status = (TextView) view.findViewById(R.id.order_num);

        name.setText(orderList.get(i).name);
        price.setText(orderList.get(i).price);
        type.setText(orderList.get(i).type);
        status.setText(orderList.get(i).status);
        return view;
    }
}
