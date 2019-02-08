package com.example.redes.ultimaleccion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Resultados extends AppCompatActivity {

    public TextView co, inc;
    public String c,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        co = (TextView) findViewById(R.id.co);
        inc = (TextView) findViewById(R.id.inc);



        co.setText("correcto "+MainActivity.corr);
        inc.setText("incorrecto "+MainActivity.incorr);




    }
}
