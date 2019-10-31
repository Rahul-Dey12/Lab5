package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button button;
    EditText editText1,editText2,editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText1=findViewById(R.id.editText2);
        editText2=findViewById(R.id.editText3);
        editText3=findViewById(R.id.editText4);

        button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(editText1.getText().toString());
                int y = Integer.parseInt(editText2.getText().toString());
                int z = Integer.parseInt(editText3.getText().toString());
                int r = x*200+y*50+z*80;

                Toast.makeText(getApplicationContext(),Integer.toString(r),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
