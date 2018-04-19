package com.example.sdu.lgssp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;

/**
 * Created by Administrator on 2018/4/18.
 */
public class RollPagerAdapter extends LoopPagerAdapter {

    private int[] pic;

    public RollPagerAdapter(RollPagerView viewPager, int []pic) {
        super(viewPager);
        this.pic = pic;
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageResource(pic[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getRealCount() {
        return pic.length;
    }
}
