package com.mishel.munguia.garcia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void suma(View miView)
    { }
    
    private Button Button_suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_suma = findViewById(R.id.Button_suma);

        Button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSuma();
            }
        });

    }

    private void abrirOperacion() {
        Intent intent = new Intent(this , operacion.class);
        startActivity(intent);
    }

    private void abrirSuma() {
        Intent intent = new Intent(this , SumaActivity.class);
        startActivity(intent);
    }
}