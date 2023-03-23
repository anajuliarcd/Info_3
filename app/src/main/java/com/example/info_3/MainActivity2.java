package com.example.info_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText textNumber1;
    private EditText textNumber2;
    Button buttonSomar;
    double valor1;
    double valor2 ;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main2);
         textNumber1 = findViewById(R.id.TextNumber1);
         textNumber2 = findViewById(R.id.TextNumber2);
         buttonSomar= findViewById(R.id.buttonSomar);
         buttonSomar.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View view) {
                 Intent in = new Intent (MainActivity2.this, MainActivity21.class);
                 startActivity(in);
             }
         });
     }
}