package com.example.fcitcgpa;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CgpaBtn,GpaBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CgpaBtn = (Button) findViewById(R.id.calCgpa);
        GpaBtn = (Button) findViewById(R.id.calGpa);
        CgpaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CgpaActivity.class);
                startActivity(intent);
            }
        });
        GpaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GpaActivity.class);
                startActivity(intent);
            }
        });
    }
}