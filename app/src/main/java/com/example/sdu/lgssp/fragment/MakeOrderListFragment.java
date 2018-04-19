package com.example.sdu.lgssp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sdu.lgssp.bean.OrderBean;
import com.example.sdu.lgssp.R;
import com.example.sdu.lgssp.adapter.MakeOrderListAdapter;

import java.util.ArrayList;

/**
 *
 */
public class MakeOrderListFragment extends Fragment {

    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_make_order_list, container, false);
        listView = (ListView) view.findViewById(R.id.makeOrder_listview);
        ArrayList list = new ArrayList<OrderBean>();
        list.add(new OrderBean(1, "12", "123", "fgds", "fds", "fsd"));
        listView.setAdapter(new MakeOrderListAdapter(this.getContext(), list));
        return view;
    }
}
