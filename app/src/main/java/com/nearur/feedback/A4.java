package com.nearur.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
    }
    public void cl4(View v){
        Intent i=new Intent(this,A5.class);
        i.putExtra("Name",getIntent().getStringExtra("Name"));
        startActivity(i);
    }
}
