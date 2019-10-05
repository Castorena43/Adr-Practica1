package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    Double number1 = 0.0;
    Double numero2 = 0.0;
    Double resultado;
    String operador;
    Double minus;
    String dato;
    @Override
    public void onClick(View view) {
        TextView pantalla = findViewById(R.id.Etiqueta);
        switch(view.getId()){
            case R.id.Minus:
                dato = String.valueOf(pantalla.getText());
                minus = Double.parseDouble(dato) * -1;
                pantalla.setText(String.valueOf(minus));
                break;
            case R.id.Cero:

                pantalla.setText(pantalla.getText() + "0");
                break;
            case R.id.Uno:

                pantalla.setText(pantalla.getText() + "1");
                break;
            case R.id.Dos:

                pantalla.setText(pantalla.getText() + "2");
                break;
            case R.id.Tres:
                pantalla.setText(pantalla.getText() + "3");
                break;
            case R.id.Cuatro:
                pantalla.setText(pantalla.getText() + "4");
                break;
            case R.id.Cinco:
                pantalla.setText(pantalla.getText() + "5");
                break;
            case R.id.Seis:
                pantalla.setText(pantalla.getText() + "6");
                break;
            case R.id.Siete:
                pantalla.setText(pantalla.getText() + "7");
                break;
            case R.id.Ocho:
                pantalla.setText(pantalla.getText() + "8");
                break;
            case R.id.Nueve:
                pantalla.setText(pantalla.getText() + "9");
                break;
            case R.id.Divide:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "/";
                pantalla.setText("");
                break;
            case R.id.Suma:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "+";
                pantalla.setText("");
                break;
            case R.id.Resta:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "-";
                pantalla.setText("");
                break;
            case R.id.Multiplica:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "*";
                pantalla.setText("");
                break;
            case R.id.Igual:
                switch(operador){
                    case "/":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 /numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case "+":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 +numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 -numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 *numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;

                }
                break;
            case R.id.Clean:
                numero2 = 0.0;
                number1 = 0.0;
                operador = "";
                pantalla.setText("");
                break;
        }
    }
}
