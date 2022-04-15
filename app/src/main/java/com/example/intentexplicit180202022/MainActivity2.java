package com.example.intentexplicit180202022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Nhận kiểu string
//        Intent intent = getIntent();
//
//        if (intent != null){
//            String text = intent.getStringExtra("text");
//            Log.d("BBB",text);
//        }
        // 2 : Nhận kiểu object
//        Intent intent = getIntent();
//
//        if (intent != null){
//            ArrayList<Animal> animal = intent.getParcelableArrayListExtra("object");
//            Log.d("BBB",animal.size() + "");
//        }
        // 3 Nhận kiểu bundle
//        Intent intent = getIntent();
//
//        if (intent != null){
//            Bundle bundle = intent.getBundleExtra("bundle");
//            String text = bundle.getString("text");
//            int number = bundle.getInt("number");
//            Log.d("BBB",text);
//            Log.d("BBB",number + "");
//        }
    }
}