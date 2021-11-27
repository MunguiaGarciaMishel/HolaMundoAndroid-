package com.mishel.munguia.garcia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Dinero extends AppCompatActivity {

    private EditText editTextX;

    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);
        editTextX = findViewById(R.id.editTextNumberX );

        editTextTotal = findViewById(R.id.editTextNumberTotal );
        editTextX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion( );
                }
            }
        });

    }

    private void realizaOperacion()
    {
        int total = 0;
        if( editTextX.getText().toString() != null )
        {
            if( isEntero( editTextX.getText().toString() ) )
            {
                total = getEntero( editTextX.getText().toString() );
            }
        }

        editTextTotal.setText( String.format("%d" , total * 25 ) , TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled( false );
    }

    private int getEntero(String entero)
    {
        try
        {
            return Integer.parseInt( entero );
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }

    private boolean isEntero(String entero)
    {
        try
        {
            if( entero == null || entero.length() == 0)
            {
                return false;
            }
            Integer.parseInt( entero );
            return true;
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return false;

    }
}