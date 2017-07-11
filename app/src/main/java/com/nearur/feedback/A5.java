package com.nearur.feedback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A5 extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a5);
        t=(TextView)findViewById(R.id.textView11);
        String s=getIntent().getStringExtra("Name");
        t.setText("Thanks "+s+"\nFor Your \nValuable Feedback");
    }
    public void cl5(View v){
        finishAffinity();
    }
}
