package com.example.intentyou3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
protected TextView t1;
    protected TextView t2;
    protected TextView t3;
    protected TextView t4;
    protected TextView t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        Intent intent =getIntent();
        String a = intent.getStringExtra("et1");
        String b = intent.getStringExtra("et2");
        String c = intent.getStringExtra("et3");
        String d = intent.getStringExtra("et4");
        String e = intent.getStringExtra("et5");
        t1.setText(a);
        t2.setText(b);
        t3.setText(c);
        t4.setText(d);
        t5.setText(e);
    }
}