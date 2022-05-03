package com.example.operacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operaciones extends AppCompatActivity
{
    EditText txtNum1, txtNum2;
    Button btnSuma, btnResta,btnProducto, btnDiv, btnLimpiar;
    Button btnCoseno, btnTangente, btnLn, btnLg, btnSin, btnSecante, btnPotencia,btnRaiz;
    TextView txtResultado;
    TextView txtResultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        txtNum1 = (EditText) findViewById(R.id.numero1);
        txtNum2 = (EditText) findViewById(R.id.numero2);
        btnSuma = (Button) findViewById(R.id.btnsuma);

        btnResta = (Button) findViewById(R.id.btnresta);
        btnProducto = (Button) findViewById(R.id.btnproducto);
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnLimpiar = (Button) findViewById(R.id.btnlimpiar);
        btnCoseno = (Button) findViewById(R.id.btnCoseno);
        btnTangente = (Button) findViewById(R.id.btnrTangente);
        btnLn = (Button) findViewById(R.id.btnLn);
        btnLg = (Button) findViewById(R.id.btnLg);
        btnSin = (Button) findViewById(R.id.btnSin);
        btnSecante = (Button) findViewById(R.id.btnSecante);
        btnPotencia = (Button) findViewById(R.id.btnPotencia);
        btnRaiz = (Button) findViewById(R.id.btnRaiz);

        txtResultado = (TextView) findViewById(R.id.resultado);
        txtResultado1 = (TextView) findViewById(R.id.resultado1);
        btnSuma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= nro1 + nro2;
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= nro1 - nro2;
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("");
            }
        });
        btnProducto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= nro1 * nro2;
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= nro1 / nro2;
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("");
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                txtNum1.setHint("Ingrese numero 1");
                txtNum2.setHint("Ingrese numero 2");
                txtResultado.setHint("El resultado es:");
                txtResultado1.setHint("El resultado es:");
            }
        });




        btnCoseno.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());

                double resp= Math.cos(nro1);
                double resp1= Math.cos(nro2);

                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });
        btnTangente.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= Math.tan(nro1);
                double resp1= Math.tan(nro2);
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });
        btnLn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= Math.log(nro1);
                double resp1= Math.log(nro2);
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });
        btnLg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= Math.log10(nro1);
                double resp1= Math.log10(nro2);
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= Math.sin(nro1);
                double resp1= Math.sin(nro2);
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });

        btnSecante.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= 1/(Math.cos(nro1));
                double resp1= 1/(Math.cos(nro2));
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });
        btnPotencia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= Math.pow(nro1,nro2);
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("");
            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double nro1 = Double.parseDouble(txtNum1.getText().toString());
                double nro2 = Double.parseDouble(txtNum2.getText().toString());
                double resp= Math.sqrt(nro1);
                double resp1= Math.sqrt(nro2);
                txtResultado.setText("El resultado es: "+resp);
                txtResultado1.setText("El resultado es: "+resp1);
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResultado.setText("");
                txtResultado1.setText("");
                /*
                txtNum1.setHint("Ingrese numero 1");
                txtNum2.setHint("Ingrese numero 2");
                txtResultado.setHint("El resultado es:");
                txtResultado.setHint("El resultado es:");*/
            }
        });
    }
}