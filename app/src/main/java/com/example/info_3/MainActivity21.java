package com.example.info_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity21 extends MainActivity2 {
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        textResult = findViewById(R.id.textResult);
        textResult.setText(String.valueOf(valor1 + valor2));
    }
}