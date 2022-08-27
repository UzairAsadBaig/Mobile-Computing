package com.example.fcitcgpa;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class GpaActivity extends AppCompatActivity {
    Spinner gp1,gp2,gp3,gp4,gp5,gp6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);
        gp1 = findViewById(R.id.gp1);
        gp2 = findViewById(R.id.gp2);
        gp3 = findViewById(R.id.gp3);
        gp4 = findViewById(R.id.gp4);
        gp5 = findViewById(R.id.gp5);
        gp6 = findViewById(R.id.gp6);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.grades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        gp1.setAdapter(adapter);
        gp2.setAdapter(adapter);
        gp3.setAdapter(adapter);
        gp4.setAdapter(adapter);
        gp5.setAdapter(adapter);
        gp6.setAdapter(adapter);
    }
}