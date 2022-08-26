package com.example.alhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ParahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah);
        Intent i = getIntent();
        String id=i.getStringExtra("id");
        setTitle("Parah "+id);
        ListView listView = findViewById(R.id.parahListView);
        DbHelper dbHelper = new DbHelper(ParahActivity.this);
        List<SurahModel> list = dbHelper.getParaDetails(Integer.parseInt(id));
        ArrayAdapter ad =new ArrayAdapter(ParahActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);
    }
}