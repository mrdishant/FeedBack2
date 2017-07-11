package com.nearur.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }
    public void cl2(View v){
        Intent i=new Intent(this,A3.class);
        i.putExtra("Name",getIntent().getStringExtra("Name"));
        startActivity(i);
    }
}
