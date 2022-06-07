package com.example.learnwithme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class singleLesson extends AppCompatActivity {
     TextView t;
     ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_lesson);
        t = findViewById(R.id.lessonName);
        i = findViewById(R.id.lessonImage);
        String name = getIntent().getStringExtra("name");
        t.setText(name);
        i.setImageResource(getResources().getIdentifier(name, "drawable", getPackageName()));
    }
}