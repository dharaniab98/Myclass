package com.example.android.myclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MaterialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);

        TextView ooadtext = (TextView) findViewById(R.id.material1);
        ooadtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ooadIntent = new Intent(MaterialActivity.this, OOADActivity.class);
                startActivity(ooadIntent);
            }
        });


        TextView daatext = (TextView) findViewById(R.id.material2);
        daatext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daaIntent = new Intent(MaterialActivity.this, DAAActivity.class);
                startActivity(daaIntent);
            }
        });

        TextView dmdwtext = (TextView) findViewById(R.id.material3);
        dmdwtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dmdwIntent = new Intent(MaterialActivity.this, DMDWActivity.class);
                startActivity(dmdwIntent);
            }
        });
        TextView mepatext = (TextView) findViewById(R.id.material4);
        mepatext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mepaIntent = new Intent(MaterialActivity.this, MEPAActivity.class);
                startActivity(mepaIntent);
            }
        });

        TextView oetext = (TextView) findViewById(R.id.material5);
        oetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oeIntent = new Intent(MaterialActivity.this, OEActivity.class);
                startActivity(oeIntent);
            }
        });
        TextView wptext = (TextView) findViewById(R.id.material6);
        wptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wpIntent = new Intent(MaterialActivity.this, WPActivity.class);
                startActivity(wpIntent);
            }
        });


    }
}




