package com.example.saludostruman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check, check1, check2;
    private RadioGroup radioGroup;
    private RadioButton radioButtonn1, radioButtonn2, radioButtonn3;
    private TextView tv1, tv2;
    private EditText eTT1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = findViewById(R.id.checkBox4);
        check1 = findViewById(R.id.checkBox5);
        check2 = findViewById(R.id.checkBox6);
        radioButtonn1 = findViewById(R.id.radioButton1);
        radioButtonn2 = findViewById(R.id.radioButton2);
        radioButtonn3 = findViewById(R.id.radioButton3);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        eTT1=findViewById(R.id.eTT1);

    }
        public void presion( View view) {
            String apellido = eTT1.getText().toString();
            if(!apellido.isEmpty() ){
                Toast.makeText(this, "Gracias por Introducir su apellido", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "INTRODUZCA SU APELLIDO", Toast.LENGTH_SHORT).show();
            }
            if (radioButtonn1.isChecked()) {
                apellido = "Sr " + apellido;
            } else if (radioButtonn2.isChecked()) {
                apellido = "SRTA " + apellido;
            } else if (radioButtonn3.isChecked()) {
                apellido = "" + apellido;

            } tv2.setText(apellido);
            }
        public void presion1(View view){
            Toast.makeText(this, "No seleccione mas de una casilla", Toast.LENGTH_SHORT).show();
        String Resultado1=" ";
        if(check.isChecked()){
            Resultado1= "Buenos dias";
        }else if(check1.isChecked()){
            Resultado1="Buenas tardes";
        } else if (check2.isChecked()) {
            Resultado1="Buenas noches";
        }
        tv1.setText(Resultado1);

        }

}




