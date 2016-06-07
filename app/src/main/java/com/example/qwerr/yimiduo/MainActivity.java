package com.example.qwerr.yimiduo;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.qwerr.yimiduo.adapter.MyFragmentPagerAdapter;
import com.example.qwerr.yimiduo.fragment.Fragment1;
import com.example.qwerr.yimiduo.fragment.Fragment2;
import com.example.qwerr.yimiduo.fragment.Fragment3;
import com.example.qwerr.yimiduo.view.CustomViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private ArrayList<Fragment> fragments;
    private CustomViewPager viewPager;
    private ImageView bar1,bar2,bar3;
    private MyFragmentPagerAdapter pageAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        viewPager = (CustomViewPager) findViewById(R.id.viewpager);
        bar1 = (ImageView) findViewById(R.id.bar1);
        bar2 = (ImageView) findViewById(R.id.bar2);
        bar3 = (ImageView) findViewById(R.id.bar3);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragments = new ArrayList<>();
        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);
        pageAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(pageAdapter);
        viewPager.setCurrentItem(0);
        bar1.setImageResource(R.drawable.shouyiren_pressed);

    }
    public void BarClick(View view){
        bar1.setImageResource(R.drawable.shouyiren_normal);
        bar2.setImageResource(R.drawable.order_normal);
        bar3.setImageResource(R.drawable.user_normal);


        int id = view.getId();
        switch (id){
            case R.id.bar1:
                viewPager.setCurrentItem(0);
                bar1.setImageResource(R.drawable.shouyiren_pressed);
                setTitle("手艺人家居服务");

                break;
            case R.id.bar2:
                viewPager.setCurrentItem(1);
                bar2.setImageResource(R.drawable.order_pressed);
                setTitle("我的订单");

                break;
            case R.id.bar3:
                viewPager.setCurrentItem(2);
                bar3.setImageResource(R.drawable.user_pressed);
                setTitle("我");

                break;
            default:
                break;

        }


    }
    @Override
    public void onBackPressed() {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).setTitle("确认退出").setNegativeButton("取消", null).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).show();
    }

}
