package com.example.fcitcgpa;
import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.Precision;
import android.util.Log;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GpaActivity extends AppCompatActivity {
    Spinner gp1,gp2,gp3,gp4,gp5,gp6;
    EditText ch1,ch2,ch3,ch4,ch5,ch6;
    Button finalizeGpa;
    TextView gpaResult;
    Double[] gradePoints= {4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.0,0.0};
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        //Initialize View Objects
        gpaResult = findViewById(R.id.gpaResult);
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
                Double GPA=0.0;
                int[] grades = new int[6];
                String[] creditHours = new String[6];
                creditHours[0] = ch1.getText().toString();
                creditHours[1] = ch2.getText().toString();
                creditHours[2] = ch3.getText().toString();
                creditHours[3] = ch4.getText().toString();
                creditHours[4] = ch5.getText().toString();
                creditHours[5] = ch6.getText().toString();
                grades[0] = gp1.getSelectedItemPosition();
                grades[1] = gp2.getSelectedItemPosition();
                grades[2] = gp3.getSelectedItemPosition();
                grades[3] = gp4.getSelectedItemPosition();
                grades[4] = gp5.getSelectedItemPosition();
                grades[5] = gp6.getSelectedItemPosition();

                Double gpSum = 0.0;
                int tch = 0;
                for (int i = 0; i < 6; i++) {
                    if(!creditHours[i].equals("")){
                        gpSum += parseDouble(creditHours[i])*gradePoints[grades[i]];
                        tch += parseDouble(creditHours[i]);
                    }
                }

                GPA = round(gpSum/tch,2);
                String resultMessage="GPA =  "+GPA;
                gpaResult.setText(resultMessage);


            }
        });




    }
}