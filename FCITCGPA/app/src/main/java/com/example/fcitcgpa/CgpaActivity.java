package com.example.fcitcgpa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CgpaActivity extends AppCompatActivity {
   Spinner gp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        gp1 = findViewById(R.id.gp1);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.grades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        gp1.setAdapter(adapter);
    }
}