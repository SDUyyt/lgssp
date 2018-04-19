package com.example.sdu.lgssp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sdu.lgssp.adapter.NewsListAdapter;
import com.example.sdu.lgssp.bean.ChatBean;
import com.example.sdu.lgssp.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/11.
 */
public class NewsFragment extends Fragment {

    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        listView = (ListView) view.findViewById(R.id.news_list);
        ArrayList<ChatBean> list = new ArrayList<>();
        list.add(new ChatBean(0, "系统消息", "关于网页设计.."));
        list.add(new ChatBean(0, "系统管理员", "您好，欢迎咨询问题"));
        NewsListAdapter adapter = new NewsListAdapter(this.getContext(), list);
        listView.setAdapter(adapter);
        return view;
    }
}
