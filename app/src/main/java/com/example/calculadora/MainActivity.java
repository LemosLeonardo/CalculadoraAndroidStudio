package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Campos do layout
    EditText num1, num2;
    TextView result;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;

    //Vars da classe para o calculo
    double n1, n2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final EditText inputValor1 = findViewById(R.id.inputValor1);
        final EditText inputValor2 = findViewById(R.id.inputValor2);
        final TextView resultadoCalculo = findViewById(R.id.resultadoCalculo);*/
        //Coletando valores

        //Pegando os valores do usuário
        num1    = (EditText) findViewById(R.id.inputValor1);
        num2    = (EditText) findViewById(R.id.inputValor2);
        result  = (TextView) findViewById(R.id.resultadoCalculo);

        btSomar       = (Button)   findViewById(R.id.btnSomar);
        btSubtrair    = (Button)   findViewById(R.id.btnSubtrair);
        btDividir     = (Button)   findViewById(R.id.btnDividir);
        btMultiplicar = (Button)   findViewById(R.id.btnMultiplicar);

        //BOTÃO SOMAR
        btSomar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1+n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO SUBTRAIR
        btSubtrair.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1-n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO DIVIDIR
        btDividir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1/n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO MULTIPLICAR
        btMultiplicar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1*n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });




    }

}
