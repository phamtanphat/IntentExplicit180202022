package com.example.intentexplicit180202022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentexplicit180202022.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.buttonString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("text", "hello");
                startActivity(intent);
            }
        });

        mBinding.buttonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animal animal = new Animal("Cat");

                ArrayList<Animal> listAnimals = new ArrayList<>();
                listAnimals.add(animal);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("object", listAnimals);
                startActivity(intent);
            }
        });

        mBinding.buttonBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("text","Value");
                bundle.putInt("number",1);
                intent.putExtra("bundle",bundle);
                startActivity(intent);
            }
        });
    }
}