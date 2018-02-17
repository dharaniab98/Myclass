package com.example.android.myclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView syllabus=(TextView)findViewById(R.id.syllabus);
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabusIntent=new Intent(MainActivity.this,SyllabusActivity.class);
                startActivity(syllabusIntent);
            }
        });

        TextView timetable=(TextView)findViewById(R.id.time_table);
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent timetableIntent=new Intent(MainActivity.this,TimeTableActivity.class);
                startActivity(timetableIntent);
            }
        });

        TextView faculty=(TextView)findViewById(R.id.faculty);
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facultyIntent=new Intent(MainActivity.this,FacultyActivity.class);
                startActivity(facultyIntent);
            }
        });

        TextView  material=(TextView)findViewById(R.id.material);

        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent materialIntent=new Intent(MainActivity.this,MaterialActivity.class);
                startActivity(materialIntent);
            }
        });
        }

}
