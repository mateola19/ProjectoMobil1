package com.example.contador;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView FourHundred;
    Button Opciones;
    Button botonInicio;
    Button salida;
    Button logs;
    Integer num;
    Integer costeBillete= 100;
    int valorClick= 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cogemos referencia del boton start
        botonInicio = findViewById(R.id.buttonStart);
        num = getIntent().getIntExtra("num", 0);
        valorClick = getIntent().getIntExtra("valorClick", 1);
        costeBillete = getIntent().getIntExtra("costeBillete", 100);
        salida = findViewById(R.id.button6);
        logs = findViewById(R.id.button11);
        Opciones = findViewById(R.id.button3);
        botonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irPantallaInicio();

            }
        });
        salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mostrarDialogo();
            }
        });
        logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                irLogs();
            }
        });
        Opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                irOpciones();
            }
        });
    }
    public void irPantallaInicio(){
        Intent intent= new Intent(this, PantallaInicio.class);
        intent.putExtra("num", num.intValue());
        startActivity(intent);


    }
    public void mostrarDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cerrar Aplicacion")
                .setMessage("Esta seguro de que quiere salir?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", null);
        AlertDialog dialogo=builder.create();
        dialogo.show();
    }
    public void irLogs() {
        Intent intent = new Intent(this, Logs.class);
        startActivity(intent);
    }
    public void irOpciones() {
        Intent intent = new Intent(this, Opciones.class);
        startActivity(intent);
    }


}