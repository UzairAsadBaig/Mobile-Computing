package com.example.fcitcgpa;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
public class GpaActivity extends AppCompatActivity {
    Spinner gp1,gp2,gp3,gp4,gp5,gp6;
    EditText ch1,ch2,ch3,ch4,ch5,ch6;
    Button finalizeGpa;
    Double[] gradePoints= {4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.0,0.0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        //Initialize View Objects
        gp1 = findViewById(R.id.gp1);
        gp2 = findViewById(R.id.gp2);
        gp3 = findViewById(R.id.gp3);
        gp4 = findViewById(R.id.gp4);
        gp5 = findViewById(R.id.gp5);
        gp6 = findViewById(R.id.gp6);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
        ch6 = findViewById(R.id.ch6);
        finalizeGpa = (Button) findViewById(R.id.finalizeGpa);


        //Adding string-array of grades into the Spinner via Adapter
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.grades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        gp1.setAdapter(adapter);
        gp2.setAdapter(adapter);
        gp3.setAdapter(adapter);
        gp4.setAdapter(adapter);
        gp5.setAdapter(adapter);
        gp6.setAdapter(adapter);

        //Adding Event listner to the finalize gpa button
        finalizeGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(ch1.getText().toString(),gp1.getSelectedItemPosition()+"");

            }
        });




    }
}