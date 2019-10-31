package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;

public class Main3Activity extends AppCompatActivity {

    EditText e;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bplus,bmin,bequl,bdel;
    int one,two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        e=findViewById(R.id.editText5);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        b0=findViewById(R.id.zero);
        bdiv=findViewById(R.id.div);
        bmul=findViewById(R.id.mul);
        bplus=findViewById(R.id.plus);
        bmin=findViewById(R.id.minus);
        bequl=findViewById(R.id.equl);
        bdel=findViewById(R.id.del);

        click(b1);
        click(b2);
        click(b3);
        click(b4);
        click(b5);
        click(b6);
        click(b7);
        click(b8);
        click(b9);
        click(b0);
        click(bdiv);
        click(bmul);
        click(bmin);
        click(bplus);

        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=one+two;
                e.setText(Integer.toString(r));
            }
        });

    }
    void click (final Button b){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+""+b.getText().toString());
            }
        });
    }
}
