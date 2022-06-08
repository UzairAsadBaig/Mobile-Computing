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

        findViewById(R.id.i).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","i");
                startActivity(intent);
            }
        });

        findViewById(R.id.j).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","j");
                startActivity(intent);
            }
        });

        findViewById(R.id.k).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","k");
                startActivity(intent);
            }
        });

        findViewById(R.id.l).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","l");
                startActivity(intent);
            }
        });

        findViewById(R.id.m).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","m");
                startActivity(intent);
            }
        });

        findViewById(R.id.n).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","n");
                startActivity(intent);
            }
        });

        findViewById(R.id.o).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","o");
                startActivity(intent);
            }
        });

        findViewById(R.id.p).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","p");
                startActivity(intent);
            }
        });


        findViewById(R.id.q).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","q");
                startActivity(intent);
            }
        });


        findViewById(R.id.r).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LessonActivty.this,singleLesson.class);
                intent.putExtra("name","r");
                startActivity(intent);
            }
        });


    }
}