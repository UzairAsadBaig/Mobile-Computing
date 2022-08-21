package com.example.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Record extends AppCompatActivity {

    EditText name,rollNo;
    Button update,delete;
    StudentModel student;
    Switch enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        name = findViewById(R.id.name);
        rollNo = findViewById(R.id.rollNo);
        enroll = findViewById(R.id.enroll);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);

        Intent intent = getIntent();

        student = new StudentModel(intent.getStringExtra("name"),intent.getIntExtra("roll",-1),intent.getBooleanExtra("isEnroll",false));
//        student.setName((String)intent.getStringExtra("name"));
//        student.setEnroll(intent.getBooleanExtra("isEnroll",false));
//        student.setRollNmber(intent.getIntExtra("roll",-1));

        name.setText(student.getName());
        rollNo.setText(""+student.getRollNmber());
        enroll.setChecked(student.isEnroll());
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(Record.this);
                int stRoll = student.getRollNmber();
                student.setName(String.valueOf(name.getText()));
                student.setEnroll(enroll.isChecked());
                student.setRollNmber(Integer.parseInt(rollNo.getText().toString()));
                Log.d("@@@", student.toString());
                dbHelper.updateStudent(student,stRoll);
                Toast.makeText(Record.this, "Student has been updated!", Toast.LENGTH_SHORT).show();

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(Record.this);
                int stRoll = student.getRollNmber();
                dbHelper.deleteStudent(stRoll);
                Toast.makeText(Record.this, "Student has been deleted!", Toast.LENGTH_SHORT).show();

            }
        });






    }

}