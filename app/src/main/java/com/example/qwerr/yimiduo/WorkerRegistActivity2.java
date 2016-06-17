package com.example.qwerr.yimiduo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class WorkerRegistActivity2 extends AppCompatActivity {
    private TextView finishRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_worker2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("师傅注册");
        init();
    }

    private void init() {
        finishRegist = (TextView) findViewById(R.id.id_workerregist_finish);
        finishRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(WorkerRegistActivity2.this,MainActivity.class));
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
