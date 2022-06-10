package com.example.learnwithme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String res = (String) getIntent().getStringExtra("marks");
        result = findViewById(R.id.result);
        result.setText(res+" / 5");
    }
}