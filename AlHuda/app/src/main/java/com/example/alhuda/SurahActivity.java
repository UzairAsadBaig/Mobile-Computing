package com.example.alhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SurahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        DbHelper dbHelper = new DbHelper(SurahActivity.this);
        Intent i = getIntent();
        String name=i.getStringExtra("name");
        setTitle(name);
        String id = i.getStringExtra("id");
        ListView listView = findViewById(R.id.surahListView);
        List<SurahModel> list = dbHelper.getSurahDetails(Integer.parseInt(id));
        ArrayAdapter ad =new ArrayAdapter(SurahActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);
    }
}