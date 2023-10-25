package com.example.saludostruman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox check, check1, check2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = findViewById(R.id.checkBox4);
        check1 = findViewById(R.id.checkBox5);
        check2= findViewById(R.id.checkBox6);
    }
}