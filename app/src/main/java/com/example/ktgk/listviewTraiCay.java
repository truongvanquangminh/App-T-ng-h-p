package com.example.ktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class listviewTraiCay extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_trai_cay);

        Anhxa();
        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);

        bt = (Button) findViewById(R.id.btprofile);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(view);
            }
        });
    }
    void open(View v) {
        Intent dsp = new Intent(this, profile.class);
        startActivity(dsp);
    }

    private void Anhxa(){
        lvTraiCay = (ListView) findViewById(R.id.listviewTraicay);
        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new TraiCay("Quả dâu", "Dâu tây Đà Lạt", R.drawable.quadau));
        arrayTraiCay.add(new TraiCay("Dừa sáp", "Đặc sản Trà Vinh", R.drawable.duasap));
        arrayTraiCay.add(new TraiCay("Măng cụt", "Măng cụt miền Tây", R.drawable.mangcut));
        arrayTraiCay.add(new TraiCay("Thanh Long", "Thanh Long Bình Thuận", R.drawable.thanhlong));
        arrayTraiCay.add(new TraiCay("Xoài cát", "Xoài cát thơm ngọt", R.drawable.xoaicat));

    }
}