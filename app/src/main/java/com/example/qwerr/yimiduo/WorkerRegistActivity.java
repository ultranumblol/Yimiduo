package com.example.qwerr.yimiduo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class WorkerRegistActivity extends AppCompatActivity {
    private TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_worker);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("师傅注册");
        init();
    }

    private void init() {
        next = (TextView) findViewById(R.id.id_workerregist1_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WorkerRegistActivity.this,WorkerRegistActivity2.class));
            }
        });
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
