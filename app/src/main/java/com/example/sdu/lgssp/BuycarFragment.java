package com.example.sdu.lgssp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BuycarFragment extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buycar, container, false);
        listView = (ListView) view.findViewById(R.id.buycar_list);
        ArrayList<OrderBean> list = new ArrayList<>();
        list.add(new OrderBean(0, "杨莹涛", "shuai", 0));
        list.add(new OrderBean(0, "朱斯亮", "shuai", 0));
        list.add(new OrderBean(0, "王宁", "shuai", 0));
        list.add(new OrderBean(0, "邱天乐", "shuai", 0));
        BuyCarListAdapter adapter = new BuyCarListAdapter(this.getContext(), list);
        listView.setAdapter(adapter);
        return view;
    }
}
