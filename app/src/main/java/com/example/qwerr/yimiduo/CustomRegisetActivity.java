package com.example.qwerr.yimiduo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class CustomRegisetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("注册");
        init();
    }

    private void init() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
            return true;

        }


        return super.onOptionsItemSelected(item);


    }
}
