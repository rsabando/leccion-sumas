package com.example.redes.ultimaleccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText resultado;
    public Button btnvalidar;
    //public int incorrecto,correcto;
    public String valor;
    //public static int valor1;
    public static int corr, incorr;

    public  MediaPlayer cosonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (EditText) findViewById(R.id.resultado);
        btnvalidar = (Button) findViewById(R.id.btnvalidar);
        cosonido = MediaPlayer.create(this, R.raw.correcto1selsv);

        btnvalidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor =resultado.getText().toString();
              //  Toast.makeText(getApplicationContext(), valor,
                //        Toast.LENGTH_LONG).show();
                if(corr>=2){
                    //corr++;
                    Intent result = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(result);
                }
                if(valor.equals("5")){
                    Toast.makeText(getApplicationContext(), "Correcto ",
                       Toast.LENGTH_LONG).show();
                    corr++;
                    cosonido.start();

                }
                else{
                    Toast.makeText(getApplicationContext(), "Incorrecto ",
                            Toast.LENGTH_LONG).show();
                    incorr++;
                }

            }
        });


    }




}
