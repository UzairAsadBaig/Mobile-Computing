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

    }
}