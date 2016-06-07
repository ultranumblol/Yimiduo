package com.example.qwerr.yimiduo.fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.qwerr.yimiduo.R;
import com.example.qwerr.yimiduo.adapter.MyFragmentPagerAdapter;
import com.example.qwerr.yimiduo.view.CustomViewPager;

import java.util.ArrayList;

/**
 * Created by qwerr on 2016/6/7.
 */

public class Fragment2 extends Fragment {
    private CustomViewPager viewPager;
    private OrderFragment1 fragment1;
    private OrderFragment2 fragment2;
    private OrderFragment3 fragment3;
    private OrderFragment4 fragment4;
    private OrderFragment5 fragment5;
    private ArrayList<Fragment> list;
    private ImageView bar1,bar2,bar3,bar4,bar5;
    private View.OnClickListener barOnClickListener;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        viewPager = (CustomViewPager) view.findViewById(R.id.id_order_viewpager);
        fragment1 = new OrderFragment1();
        fragment2 = new OrderFragment2();
        fragment3 = new OrderFragment3();
        fragment4 = new OrderFragment4();
        fragment5 = new OrderFragment5();
        bar1 = (ImageView) view.findViewById(R.id.orderBar1);
        bar2 = (ImageView) view.findViewById(R.id.orderBar2);
        bar3 = (ImageView) view.findViewById(R.id.orderBar3);
        bar4 = (ImageView) view.findViewById(R.id.orderBar4);
        bar5 = (ImageView) view.findViewById(R.id.orderBar5);
        barOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar1.setImageResource(R.drawable.daifukuan_normal);
                bar2.setImageResource(R.drawable.daibaojia_normal);
                bar3.setImageResource(R.drawable.jingxingzhong_normal);
                bar4.setImageResource(R.drawable.daipingjia_normal);
                bar5.setImageResource(R.drawable.allorder_normal);

                int id =  v.getId();
                switch (id){
                    case R.id.orderBar1:
                        viewPager.setCurrentItem(0);
                        bar1.setImageResource(R.drawable.daifukuan_pressed);
                        break;
                    case R.id.orderBar2:
                        viewPager.setCurrentItem(1);
                        bar2.setImageResource(R.drawable.daibaojia_pressed);
                        break;
                    case R.id.orderBar3:
                        viewPager.setCurrentItem(2);
                        bar3.setImageResource(R.drawable.jingxingzhong_pressed);
                        break;
                    case R.id.orderBar4:
                        viewPager.setCurrentItem(3);
                        bar4.setImageResource(R.drawable.daipingjia_pressed);
                        break;
                    case R.id.orderBar5:
                        viewPager.setCurrentItem(4);
                        bar5.setImageResource(R.drawable.allorder_pressed);
                        break;
                    default:
                        break;


                }


            }
        };
        bar1.setOnClickListener(barOnClickListener);
        bar2.setOnClickListener(barOnClickListener);
        bar3.setOnClickListener(barOnClickListener);
        bar4.setOnClickListener(barOnClickListener);
        bar5.setOnClickListener(barOnClickListener);
        viewPager.setCurrentItem(0);
        bar1.setImageResource(R.drawable.jingxingzhong_pressed);
        list = new ArrayList<>();
        list.add(fragment1);
        list.add(fragment2);
        list.add(fragment3);
        list.add(fragment4);
        list.add(fragment5);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getFragmentManager(),list));




    }
}
