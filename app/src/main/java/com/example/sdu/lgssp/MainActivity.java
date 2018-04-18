package com.example.sdu.lgssp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CustomViewPager viewPager;
    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (CustomViewPager) findViewById(R.id.viewpager);
        list = new ArrayList<>();
        list.add(new MenuFragment());
        list.add(new BuycarFragment());
        list.add(new NewsFragment());
        list.add(new MyFragment());

        SampleViewPagerAdapter adapter = new SampleViewPagerAdapter(this.getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(4);
        viewPager.setCurrentItem(0);
    }

    public void clickMenu(View view) {
        viewPager.setCurrentItem(0);
    }

    public void clickBuyCar(View view) {
        viewPager.setCurrentItem(1);
    }

    public void clickNews(View view) {viewPager.setCurrentItem(2);
    }

    public void clickMy(View view) {viewPager.setCurrentItem(3);
    }
}
