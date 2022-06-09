package com.example.learnwithme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    RadioGroup r1,r2,r3,r4,r5;
    RadioButton b1,b2,b3,b4,b5;
    Button submit;
    String[] ans = {"Dog","Owl","Nest","Jug","Zebra"};
    ArrayList<String> userAnswer = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);

        submit = findViewById(R.id.submit);

        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                b1 = findViewById(i);
                userAnswer.add((String) b1.getText());
                submit.setEnabled(userAnswer.size()==5);
            }
        });

        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                b2 = findViewById(i);
                userAnswer.add((String) b2.getText());
                submit.setEnabled(userAnswer.size()==5);
            }
        });
        r3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                b3 = findViewById(i);
                userAnswer.add((String) b3.getText());
                submit.setEnabled(userAnswer.size()==5);
            }
        });
        r4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                b4 = findViewById(i);
                userAnswer.add((String) b4.getText());
                submit.setEnabled(userAnswer.size()==5);
            }
        });
        r5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                b5 = findViewById(i);
                userAnswer.add((String) b5.getText());
                submit.setEnabled(userAnswer.size()==5);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int marks = 0;
                for (int i = 0; i <7; i++)
                    if (userAnswer.get(i).matches(ans[i]))
                        marks++;
                Intent intent = new Intent(Quiz.this, Result.class);
                intent.putExtra("marks",marks);
                startActivity(intent);
            }
        });
    }
}