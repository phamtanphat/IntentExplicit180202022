package com.example.intentexplicit180202022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Nhận kiểu string
        Intent intent = getIntent();

        if (intent != null){
            String text = intent.getStringExtra("text");
            Log.d("BBB",text);
        }
    }
}