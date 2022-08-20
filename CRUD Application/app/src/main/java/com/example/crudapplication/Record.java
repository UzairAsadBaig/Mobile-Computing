package com.example.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Record extends AppCompatActivity {

    EditText name,rollNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        name = findViewById(R.id.name);
        rollNo = findViewById(R.id.rollNo);

        Intent intent = getIntent();

        String stName = intent.getStringExtra("name");
        Boolean isEnroll = intent.getBooleanExtra("isEnroll",false);
        int stRoll = intent.getIntExtra("roll",-1);

        name.setText(stName);
        rollNo.setText(stRoll+"");





    }

}