package com.example.sdu.lgssp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * 消息界面适配器
 */

public class NewsListAdapter extends BaseAdapter{
    private ArrayList<OrderBean> OrderList;
    private Context context;

    public NewsListAdapter(Context context, ArrayList<OrderBean> OrderList){
        this.context = context;
        this.OrderList = OrderList;
    }

    @Override
    public int getCount() {return OrderList.size();
    }

    @Override
    public Object getItem(int position) {
        return OrderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_comment, null);
        TextView nameTv = (TextView) convertView.findViewById(R.id.comment_nickname);
        TextView commentText = (TextView) convertView.findViewById(R.id.comment_text);
        ImageView comment_icon = (ImageView) convertView.findViewById(R.id.comment_icon);

        comment_icon.setImageDrawable(context.getResources().getDrawable(R.mipmap.ic_launcher));
        nameTv.setText(OrderList.get(position).name);
        commentText.setText(OrderList.get(position).description);
        return convertView;
    }
}