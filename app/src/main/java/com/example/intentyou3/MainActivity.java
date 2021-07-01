package com.example.intentyou3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
protected Button b2;
protected EditText et1;
    protected EditText et2;
    protected EditText et3;
    protected EditText et4;
    protected EditText et5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2=findViewById(R.id.b2);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("et1",et1.getText().toString());
                intent.putExtra("et2",et2.getText().toString());
                intent.putExtra("et3",et3.getText().toString());
                intent.putExtra("et4",et4.getText().toString());
                intent.putExtra("et5",et5.getText().toString());
                startActivity(intent);
            }
        });
    }
}