package com.example.android.myclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("faculty1","lutti"));
        words.add(new Word("faculty2","ottiko"));
        words.add(new Word("faculty","tolookosu"));
        words.add(new Word("faculty","oyyiso"));
        words.add(new Word("faculty","massoka"));
        words.add(new Word("faculty","temmokka"));
        words.add(new Word("faculty","kenekaku"));
        words.add(new Word("faculty","kawinta"));
        words.add(new Word("faculty","wo'e"));
        words.add(new Word("faculty","na'aacha"));


        WordAdapter  adapter = new WordAdapter(this, words,R.color.category_faculty);

        ListView listView=(ListView) findViewById(R.id.activity_faculty);
        listView.setAdapter(adapter);
    }
}
