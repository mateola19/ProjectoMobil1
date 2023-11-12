package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Graficos extends AppCompatActivity {

    Button Vuelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos);
        Vuelta = findViewById(R.id.button23);
        Vuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irVuelta();

            }
        });
    }
    public void irVuelta() {
        Intent intent = new Intent(this, Opciones.class);
        startActivity(intent);
    }
}