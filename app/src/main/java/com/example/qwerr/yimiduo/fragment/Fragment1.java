package com.example.qwerr.yimiduo.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.qwerr.yimiduo.LoginActivity;
import com.example.qwerr.yimiduo.R;
import com.example.qwerr.yimiduo.WorkerRegistActivity;

/**
 * Created by qwerr on 2016/6/7.
 */

public class Fragment1 extends Fragment {
    private ImageView chuguianzhuang,shafaweixiu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        chuguianzhuang = (ImageView) view.findViewById(R.id.id_frag1_chuguianzhuang);
        shafaweixiu = (ImageView) view.findViewById(R.id.id_frag1_shafaweixiu);
        shafaweixiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), WorkerRegistActivity.class));
            }
        });
        chuguianzhuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });
    }
}
