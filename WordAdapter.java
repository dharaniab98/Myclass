package com.example.android.myclass;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dharani on 12/19/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public  WordAdapter(Activity context, ArrayList<Word> Words,int colorSourceId){

        super(context, 0, (List<Word>) Words);
        mColorResourceId=colorSourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent,false);

        }
        Word currentWord=getItem(position);

        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.faculty_names);
        miwokTextView.setText(currentWord.getmFacultyNames());

        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.faculty_subject);
        defaultTextView.setText(currentWord.getmSubjectNames());
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
                miwokTextView.setBackgroundColor(color);
        defaultTextView.setBackgroundColor(color);

        return listItemView;

}



}
