package com.example.learnwithme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button githubRep, lesson,quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        githubRep = findViewById(R.id.githubRep);
        lesson = findViewById(R.id.lesson);
        quiz = findViewById(R.id.quiz);

        //Adding event listner to the github repository button
        githubRep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String githubReositoryLink = "https://github.com/UzairAsadBaig/Mobile_Computing";
                Intent gitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubReositoryLink));
                startActivity(gitIntent);
            }
        });

        lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lessonIntent = new Intent(MainActivity.this,LessonActivty.class);
                startActivity(lessonIntent);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quizIntent = new Intent(MainActivity.this,Quiz.class);
                startActivity(quizIntent);
            }
        });
    }
}