package com.example.proyecto002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;   // Necesario para usar View
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
    }
    public void sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        if (valor1.isEmpty() || valor2.isEmpty()){
            tv1.setText("Los campos no pueden estar vacios");
            return;
        }
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int suma = nro1 + nro2;

        tv1.setText(String.valueOf(suma));
    }

    public void restar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        if (valor1.isEmpty() || valor2.isEmpty()){
            tv1.setText("Los campos no pueden estar vacios");
            return;
        }

        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int resta = nro1 - nro2;

        tv1.setText(String.valueOf(resta));
    }
}

