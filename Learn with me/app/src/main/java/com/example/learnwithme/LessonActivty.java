package com.example.learnwithme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_activty);

        findViewById(R.id.a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","a");
                startActivity(intent);
            }
        });

        findViewById(R.id.b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","b");
                startActivity(intent);
            }
        });

        findViewById(R.id.c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","c");
                startActivity(intent);
            }
        });

        findViewById(R.id.d).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","d");
                startActivity(intent);
            }
        });

        findViewById(R.id.e).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","e");
                startActivity(intent);
            }
        });

        findViewById(R.id.f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","f");
                startActivity(intent);
            }
        });

        findViewById(R.id.g).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","g");
                startActivity(intent);
            }
        });

        findViewById(R.id.h).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","h");
                startActivity(intent);
            }
        });


    }
}