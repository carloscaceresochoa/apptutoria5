package com.udc.tutoria5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.udc.tutoria5.modelo.Persona;

public class MainActivity2 extends AppCompatActivity {
    private TextView saltext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        saltext=findViewById(R.id.saltext);
        recibirObjeto();
    }

    public void recibir() {
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String nombre = bundle.getString("nombre");
        int edad = bundle.getInt("edad");
        double est = bundle.getDouble("est");
        boolean b = bundle.getBoolean("b");
        char genero = bundle.getChar("genero");

        String mensaje=nombre+" "+edad+" "+est+" "+b+" "+genero;
        saltext.setText(mensaje);


    }

    public void recibirObjeto() {
        Bundle bundle = getIntent().getBundleExtra("bundle");
        Persona persona=(Persona)bundle.getSerializable("persona");
        saltext.setText(persona.mostrar());


    }
}