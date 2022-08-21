package com.example.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Record extends AppCompatActivity {

    EditText name,rollNo;
    Button update,delete;
    StudentModel student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        name = findViewById(R.id.name);
        rollNo = findViewById(R.id.rollNo);

        Intent intent = getIntent();

        student = new StudentModel(intent.getStringExtra("name"),intent.getIntExtra("roll",-1),intent.getBooleanExtra("isEnroll",false));
//        student.setName((String)intent.getStringExtra("name"));
//        student.setEnroll(intent.getBooleanExtra("isEnroll",false));
//        student.setRollNmber(intent.getIntExtra("roll",-1));

        name.setText(student.getName());
        rollNo.setText(student.getRollNmber());

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(Record.this);
                dbHelper.updateStudent(student);

            }
        });






    }

}