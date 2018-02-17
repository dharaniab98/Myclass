package com.example.android.myclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DAAActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daa);

        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("syllabus.pdf").load();

    }
}
