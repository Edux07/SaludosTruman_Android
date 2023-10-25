package com.example.saludostruman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox check, check1, check2;
    RadioGroup radioGroup;
    RadioButton radioButtonn1, radioButtonn2, radioButtonn3;
    Button btn1 , btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = findViewById(R.id.checkBox4);
        check1 = findViewById(R.id.checkBox5);
        check2= findViewById(R.id.checkBox6);
        radioButtonn1= findViewById(R.id.radioButton1);
        radioButtonn2= findViewById(R.id.radioButton2);
        radioButtonn3= findViewById(R.id.radioButton3);
        btn1= findViewById(R.id.button);
        btn2= findViewById(R.id.button2);

    }
    public void onBtnClic(){

    }
    public void onBtnClic2(){

    }
}