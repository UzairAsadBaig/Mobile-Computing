package com.example.learnwithme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Locale;

public class singleLesson extends AppCompatActivity {
     TextView t1,t2;
     ImageView i;
     HashMap<String,String> map = new HashMap<String,String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_lesson);

        map.put("a","Apple");
        map.put("b","Bat");
        map.put("c","Cat");
        map.put("d","Dog");
        map.put("e","Elephant");
        map.put("f","Fish");
        map.put("g","Goat");
        map.put("h","Hen");
        map.put("i","Ink");
        map.put("j","Jug");
        map.put("k","Kite");
        map.put("l","Lamp");
        map.put("m","Moon");
        map.put("n","Nest");
        map.put("o","Owl");
        map.put("p","Pakistan");
        map.put("q","Quilt");
        map.put("r","Rat");
        map.put("s","Snake");
        map.put("t","Truck");
        map.put("u","Umberalla");
        map.put("v","Violin");
        map.put("w","Wheel");
        map.put("x","X Ray");
        map.put("y","Yatch");
        map.put("z","Zebra");

        t1 = findViewById(R.id.lessonName);
        t2 = findViewById(R.id.lessonExample);
        i = findViewById(R.id.lessonImage);
        String name = getIntent().getStringExtra("name");
        t1.setText(name.toUpperCase(Locale.ROOT));
        t2.setText(map.get(name));
        i.setImageResource(getResources().getIdentifier(name, "drawable", getPackageName()));
    }
}