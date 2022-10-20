package com.example.calculadoradefraciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fraciones que vienen escritas por el usuario
        final EditText numeUno = findViewById(R.id.numerador1);
        final EditText numeDos = findViewById(R.id.numerador2);
        final EditText denoUno = findViewById(R.id.denominador1);
        final EditText denoDos = findViewById(R.id.denominador2);

        //El resultado que se muestra en pantalla
        final TextView salidaNume = findViewById(R.id.numSalida);
        final TextView salidaDeno = findViewById(R.id.denSalida);

        //Botones de operaciones
        final Button btnSumar = findViewById(R.id.btnSuma);
        final Button btnRestar = findViewById(R.id.btnResta);
        final Button btnMultip = findViewById(R.id.btnMulti);
        final Button btnDivi = findViewById(R.id.btnDiv);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Se transforma de String a Integer
                final int num1 = Integer.parseInt(numeUno.getText().toString());
                final int num2 = Integer.parseInt(numeDos.getText().toString());
                final int den1 = Integer.parseInt(denoUno.getText().toString());
                final int den2 = Integer.parseInt(denoDos.getText().toString());
                final int numeradorFinal = (den1*num1) + (den2*num2);
                final int denominadorFinal = den1 * den2;

                salidaNume.setText(0);
                salidaDeno.setText(0);
            }
        });

/*
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
*/

    }
}