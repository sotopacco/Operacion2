package com.example.operacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Salud extends AppCompatActivity
{

    EditText etNombre, etPeso, etAltura;
    TextView textView2,textView3;
    Button btnCalcular, btnLimpiar, btnRecomendacion;
    RadioButton rbVaron, rbMujer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre=(EditText) findViewById(R.id.txtNombre);
        etPeso=(EditText) findViewById(R.id.txtPeso);
        etAltura=(EditText) findViewById(R.id.txtAltura);

        btnCalcular=(Button)  findViewById(R.id.btnCalcular);
        btnLimpiar=(Button)  findViewById(R.id.btnLimpiar);
        btnRecomendacion=(Button)  findViewById(R.id.btnRecomendacion);

        rbVaron=(RadioButton) findViewById(R.id.rVaron);
        rbMujer=(RadioButton) findViewById(R.id.rMujer);

        textView2=(TextView) findViewById(R.id.textView2);
        textView3=(TextView) findViewById(R.id.textView3);

        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Limpiar();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CalcularIMC();
            }
        });
    }

    //metodo para ir a la actividad de recomendaciones llevando valor de mensaje
    public void Recomendaciones(View view)
    {
        Intent recomendaciones = new Intent(Salud.this,Recomendaciones.class);
        recomendaciones.putExtra("dato",textView3.getText().toString());
        startActivity(recomendaciones);
    }

    private void Limpiar()
    {
        etNombre.setText("");
        etAltura.setText("");
        etPeso.setText("");
        rbMujer.setChecked(false);
        rbVaron.setChecked(false);
        textView2.setText("");
        textView3.setText("");
    }
    private String MensajeIMC(double IMC)
    {

        String mensaje="";
        if(IMC<16)
            mensaje="Peso bajo muy grave";
        else  if ((IMC>=16) && (IMC<16.99))
            mensaje="Peso bajo grave";
        else if((17<=IMC) && (IMC<18.49))
            mensaje="Bajo peso";
        else if((18.5<=IMC) && (IMC<24.99))
            mensaje="Peso normal";
        else if((25<=IMC) && (IMC<29.99))
            mensaje="Sobrepeso";
        else if((30<=IMC) && (IMC<34.99))
            mensaje="Obesidad grado I";
        else if((35<=IMC) && (IMC<39.99))
            mensaje="Obesidad grado II";
        else if(IMC>=40)
            mensaje="Obesidad grado III";
        return mensaje;
    }
    private void CalcularIMC()
    {
        String nombre= etNombre.getText().toString();
        Double altura= Double.valueOf(etAltura.getText().toString());
        Double peso= Double.valueOf(etPeso.getText().toString());

        double aux=Math.pow(altura,2);
        double IMC = peso/aux;
        String a = MensajeIMC(IMC);

        textView3.setText("Tu ICM es: "+String.format("%.2f",IMC)+" "+ MensajeIMC(IMC));
        if (rbMujer.isChecked())
        {
            textView2.setText("ERES MUJER");
        }else if(rbVaron.isChecked()==true) {

            textView2.setText("ERES VARON");
        }else{
            textView2.setText("No eligio genero");
        }
    }
}