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


        //Botones de operaciones
        final Button btnSumar = findViewById(R.id.btnSuma);
        final Button btnRestar = findViewById(R.id.btnResta);
        final Button btnMultip = findViewById(R.id.btnMulti);
        final Button btnDivi = findViewById(R.id.btnDiv);

        //Metodo sumar
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Se transforma de String a Integer
                final int num1 = Integer.parseInt(String.valueOf(numeUno.getText()));
                final int num2 = Integer.parseInt(String.valueOf(numeDos.getText()));
                final int den1 = Integer.parseInt(String.valueOf(denoUno.getText()));
                final int den2 = Integer.parseInt(String.valueOf(denoDos.getText()));

                int numFinal = (den1*num1) + (den2*num2);
                int denoFinal = den1 * den2;

                mostrar(numFinal, denoFinal);
                //salidaNume.setText(numeradorFinal);
                //salidaDeno.setText(denominadorFinal);
            }
        });

        //Metodod restar
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int num1 = Integer.parseInt(String.valueOf(numeUno.getText()));
                final int num2 = Integer.parseInt(String.valueOf(numeDos.getText()));
                final int den1 = Integer.parseInt(String.valueOf(denoUno.getText()));
                final int den2 = Integer.parseInt(String.valueOf(denoDos.getText()));

                int numFinal = ((num1*den2)-(den1*num2));
                int denoFinal = den1 * den2;


                mostrar(numFinal, denoFinal);
            }
        });

        //Metodo multiplicar
        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int num1 = Integer.parseInt(String.valueOf(numeUno.getText()));
                final int num2 = Integer.parseInt(String.valueOf(numeDos.getText()));
                final int den1 = Integer.parseInt(String.valueOf(denoUno.getText()));
                final int den2 = Integer.parseInt(String.valueOf(denoDos.getText()));

                int numFinal = num1 * num2;
                int denoFinal = den1 * den2;


                mostrar(numFinal, denoFinal);
            }
        });

        //Metodo dividir
        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int num1 = Integer.parseInt(String.valueOf(numeUno.getText()));
                final int num2 = Integer.parseInt(String.valueOf(numeDos.getText()));
                final int den1 = Integer.parseInt(String.valueOf(denoUno.getText()));
                final int den2 = Integer.parseInt(String.valueOf(denoDos.getText()));

                int numFinal = num1 * den2;
                int denoFinal = num2 * den1;

                mostrar(numFinal, denoFinal);
            }
        });


    }

    private void mostrar(int num, int deno){
        final TextView salidaNume = findViewById(R.id.numSalida);
        final TextView salidaDeno = findViewById(R.id.denSalida);
        int mcd = MCD(num, deno);

        salidaNume.setText(num/mcd);
        salidaDeno.setText(deno/mcd);
    }

    // a es el numerador y b es el denominador
    public int MCD(int a, int b){
        while(b>0){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }


}