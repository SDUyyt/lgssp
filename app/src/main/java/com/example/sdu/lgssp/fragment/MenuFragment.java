package com.example.sdu.lgssp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.sdu.lgssp.R;
import com.example.sdu.lgssp.adapter.RollPagerAdapter;
import com.example.sdu.lgssp.activity.MenuInfoActivity;
import com.jude.rollviewpager.OnItemClickListener;
import com.jude.rollviewpager.RollPagerView;

/**
 * Created by Administrator on 2018/4/11.
 */
public class MenuFragment extends Fragment {

    private RollPagerView rollPagerView;
    private LinearLayout menuLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        rollPagerView = (RollPagerView) view.findViewById(R.id.rollpageview);
        menuLayout = (LinearLayout) view.findViewById(R.id.menu_layout);

        int []pic = new int[]{R.drawable.pic1, R.drawable.pic2, R.mipmap.ic_launcher};
        rollPagerView.setAdapter(new RollPagerAdapter(rollPagerView, pic));

        rollPagerView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MenuFragment.this.getContext(), "点击第" + position + "张图", Toast.LENGTH_SHORT).show();
            }
        });

        View view1 = LayoutInflater.from(MenuFragment.this.getContext()).inflate(R.layout.menu_item, null);
        menuLayout.addView(view1);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), MenuInfoActivity.class));
            }
        });
        return view;
    }
}