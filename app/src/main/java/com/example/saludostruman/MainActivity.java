package com.example.saludostruman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private CheckBox check, check1, check2;
    private RadioGroup radioGroup;
    private RadioButton radioButtonn1, radioButtonn2, radioButtonn3;
    private TextView tv1;

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
        tv1 = findViewById(R.id.tv1);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radioButtonn1.getId()) {
                    tv1.setText("SR");
                } else if (checkedId == radioButtonn2.getId()) {
                    tv1.setText("SRTA");
                }else if(checkedId == radioButtonn3.getId()){
                    tv1.setText("N/A");
                }
            }
        });



}
}