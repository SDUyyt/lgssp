package com.example.sdu.lgssp.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.sdu.lgssp.R;
import com.example.sdu.lgssp.adapter.SampleViewPagerAdapter;
import com.example.sdu.lgssp.fragment.MakeOrderListFragment;
import com.example.sdu.lgssp.fragment.MenuFragment;
import com.example.sdu.lgssp.fragment.MyFragment;
import com.example.sdu.lgssp.fragment.NewsFragment;
import com.example.sdu.lgssp.fragment.ReceiveOrderListFragment;
import com.example.sdu.lgssp.widget.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

public class MyOrderActivity extends AppCompatActivity {

    private CustomViewPager viewPager;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        viewPager = (CustomViewPager) findViewById(R.id.myOrder_viewpager);
        list = new ArrayList<>();
        list.add(new MakeOrderListFragment());
        list.add(new ReceiveOrderListFragment());

        SampleViewPagerAdapter adapter = new SampleViewPagerAdapter(this.getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setCurrentItem(0);
    }

    public void getMakeOrderList(View view) {
        viewPager.setCurrentItem(0);
    }

    public void getReceiveOrderList(View view) {
        viewPager.setCurrentItem(1);
    }
}
