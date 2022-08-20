package com.example.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        Intent intent = getIntent();

        String stName = intent.getStringExtra("name");
        Boolean isEnroll = intent.getBooleanExtra("isEnroll",false);
        int roll = intent.getIntExtra("roll",-1);




    }

}