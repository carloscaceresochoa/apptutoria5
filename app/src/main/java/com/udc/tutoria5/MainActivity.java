package com.udc.tutoria5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import com.udc.tutoria5.modelo.Persona;

public class MainActivity extends AppCompatActivity {

    private EditText nomtext;
    private EditText edadtext;
    private EditText esttext;
    private Switch acept;
    private RadioButton mascr;
    private RadioButton femr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomtext=findViewById(R.id.nomtext);
        edadtext=findViewById(R.id.edadtext);
        esttext=findViewById(R.id.esttext);
        acept=findViewById(R.id.acept);
        mascr=findViewById(R.id.masr);
        femr=findViewById(R.id.femr);
    }

    public void enviar(View view){
        String nombre=nomtext.getText().toString();
        int edad=Integer.valueOf(edadtext.getText().toString());
        double est=Double.valueOf(esttext.getText().toString());
        boolean b=acept.isChecked();
        char genero='F';
        if(mascr.isChecked()){
            genero='M';
        }
        // objeto envio de los datos
        Bundle bundle=new Bundle();
        bundle.putString("nombre",nombre);
        bundle.putInt("edad",edad);
        bundle.putDouble("est",est);
        bundle.putBoolean("b",b);
        bundle.putChar("genero",genero);

        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("bundle",bundle);
        startActivity(intent);

    }


    public void enviarObjeto(View view){
        String nombre=nomtext.getText().toString();
        int edad=Integer.valueOf(edadtext.getText().toString());
        double est=Double.valueOf(esttext.getText().toString());
        boolean b=acept.isChecked();
        char genero='F';
        if(mascr.isChecked()){
            genero='M';
        }
        Persona persona=new Persona(nombre,edad,est,b,genero);
        // objeto envio de los datos

        Bundle bundle=new Bundle();
        bundle.putSerializable("persona",persona);
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("bundle",bundle);
        startActivity(intent);



    }
}