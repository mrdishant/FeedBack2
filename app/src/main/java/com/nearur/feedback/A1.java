package com.nearur.feedback;

import android.app.DatePickerDialog;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class A1 extends AppCompatActivity {
    Calendar c=new GregorianCalendar();
    EditText e,t;
    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            c.set(Calendar.MONTH,month);
            c.set(Calendar.YEAR,year);
            update();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        e=(EditText)findViewById(R.id.datet);
        t=(EditText)findViewById(R.id.editTextName);
    }

    public void cl(View v){
        Intent i=new Intent(this,A2.class);
        String n= t.getText().toString().trim();
        i.putExtra("Name",n);
        startActivity(i);
    }
    public void cl1(View v){
            new DatePickerDialog(A1.this,d,c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
    }
    public void update(){
        String myFormat = "dd/MM/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        e.setText(sdf.format(c.getTime()));
    }
}
