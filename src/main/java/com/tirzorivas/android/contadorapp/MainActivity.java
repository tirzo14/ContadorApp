package com.tirzorivas.android.contadorapp;

import android.renderscript.Int2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText campoConteo;
    private Button buttonCount;
    private Button buttonClean;

    private int conteo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        campoConteo = (EditText) findViewById(R.id.campoConteo);
        buttonCount =(Button) findViewById(R.id.botonContar);
        buttonClean = (Button) findViewById(R.id.botonReiniciar);

        buttonCount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                conteo ++;
                campoConteo.setText("" + conteo);
            }
        });
        buttonClean.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                conteo = 0;
                campoConteo.setText("0");

            }
        });
    }
}
