package com.example.ktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {
    Button bt, bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bt = (Button) findViewById(R.id.buttonLogOut);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(view);
            }
        });

        bt1 = (Button) findViewById(R.id.buttonlistview);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openList(view);
            }
        });
    }

    void open(View v) {
        Intent dsp = new Intent(this, MainActivity.class);
        startActivity(dsp);
    }
    void openList(View v) {
        Intent dsp = new Intent(this, listviewTraiCay.class);
        startActivity(dsp);
    }

}