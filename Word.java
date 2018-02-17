package com.example.android.myclass;

/**
 * Created by dharani on 12/19/2017.
 */

public class Word {

    private String mFacultyNames;

    private String mSubjectNames;

    public Word(String facultyNames, String subjectNames)
    {
        mFacultyNames=facultyNames;
        mSubjectNames=subjectNames;
    }


    public String getmFacultyNames(){
        return mFacultyNames;
    }

    public String getmSubjectNames(){
        return mSubjectNames;
    }
}
