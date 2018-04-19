package com.example.sdu.lgssp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sdu.lgssp.R;
import com.example.sdu.lgssp.adapter.MakeOrderListAdapter;
import com.example.sdu.lgssp.bean.OrderBean;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReceiveOrderListFragment extends Fragment {

    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_receive_order_list, container, false);
        listView = (ListView) view.findViewById(R.id.receiveOrder_listview);
        ArrayList<OrderBean> list = new ArrayList<>();
        list.add(new OrderBean(1, "fdsfg", "1fsdag3", "fgdfassds", "ffsdadds", "ffdssd"));
        listView.setAdapter(new MakeOrderListAdapter(this.getContext(), list));
        return view;
    }

}
