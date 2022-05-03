package com.example.operacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


public class Recomendaciones extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones);

        //obteniendo valor de mensaje de la actividad salud
        textView=(TextView) findViewById(R.id.textView);
        String mensaje=getIntent().getStringExtra("mensaje");

        if(mensaje!=null)
        {
            if(mensaje=="Peso bajo muy grave")
            {
                textView.setText("Consume mas carbohidratos");
            }
            else if(mensaje=="Peso bajo grave")
            {
                textView.setText("Estas bien, pero puedes consumir mas alimentos");
            }
            else if(mensaje=="Peso bajo")
            {
                textView.setText("Estas fuera de riesgo");
            }
            else if(mensaje=="Peso normal")
            {
                textView.setText("Peso Normal");
            }
            else if(mensaje=="Peso sobre")
            {
                textView.setText("Estas en riesgo de problemas  cardio-basculares");
            }
            else if(mensaje=="Peso sobre grave")
            {
                textView.setText("Necesitas hacer ejercicio");
            }
            else if(mensaje=="Peso sobre muy grave")
            {
                textView.setText("Necesitas acudir con un nutriologo y realizar ejercicio");
            }
        }
    }
}