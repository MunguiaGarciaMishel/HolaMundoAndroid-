package com.mishel.munguia.garcia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void suma(View miView)
    { }
    public void resta(View miView)
    { }
    public void multiplicacion(View miView)
    { }
    public void division(View miView)
    { }

    private Button Button_suma;
    private Button Button_resta;
    private Button Button_division;
    private Button Button_multiplicacion;
    private Button button_operacion;
    private Button button_dinero;
    private Button button_tiempo;
    private Button button_cambio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_suma = findViewById(R.id.Button_suma);
        Button_resta = findViewById(R.id.Button_resta);
        Button_multiplicacion = findViewById(R.id.Button_multiplicacion);
        Button_division = findViewById(R.id.Button_division);
        button_operacion = findViewById(R.id.button_operacion);
        button_dinero = findViewById(R.id.button_dinero);
        button_tiempo = findViewById(R.id.button_tiempo);
        button_cambio = findViewById(R.id.button_cambio);

        Button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSuma();
            }
        });

        Button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirResta();
            }
        });

        Button_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMultiplicacion();
            }
        });

        Button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirDivision();
            }
        });

        button_operacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirOperacion();
            }
        });

        button_dinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirDinero();
            }
        });

        button_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirTiempo();
            }
        });

        button_cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCambio();
            }
        });

    }

    private void abrirOperacion() {
        Intent intent = new Intent(this , operacion.class);
        startActivity(intent);
    }

    private void abrirTiempo() {
        Intent intent = new Intent(this , Tiempo.class);
        startActivity(intent);
    }

    private void abrirDinero() {
        Intent intent = new Intent(this , Dinero.class);
        startActivity(intent);
    }

    private void abrirCambio() {
        Intent intent = new Intent(this , Cambio.class);
        startActivity(intent);
    }

    private void abrirSuma() {
        Intent intent = new Intent(this , SumaActivity.class);
        startActivity(intent);
    }

    private void abrirResta() {
        Intent intent = new Intent(this , RestaActivity.class);
        startActivity(intent);
    }

    private void abrirMultiplicacion() {
        Intent intent = new Intent(this , multiplicacionActivity.class);
        startActivity(intent);
    }

    private void abrirDivision() {
        Intent intent = new Intent(this , divisionActivity.class);
        startActivity(intent);
    }
}