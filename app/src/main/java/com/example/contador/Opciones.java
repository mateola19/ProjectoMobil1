package com.example.contador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Opciones extends AppCompatActivity {

    Button Return;
    Button Graficos;
    private TextView texto1, texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        Return = findViewById(R.id.button8);
        Graficos = findViewById(R.id.button9);
        texto1 = findViewById(R.id.text1);
        texto2 = findViewById(R.id.Text10);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irReturn();

            }
        });
        Graficos.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            irGraficos();

        }
    });
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.activity_menu_principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        texto1.setText("Opcion seleccionada");
        final int menuId = item.getItemId();
        if (menuId == R.id.op1) {
            texto2.setText("Has elegido Graficos");
            return true;
        } else if (menuId == R.id.op2) {
            texto2.setText("Has elegido Sonido");
            return true;
        } else if (menuId == R.id.op3) {
            texto2.setText("Has elegido Return");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void irReturn() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void irGraficos() {
        Intent intent = new Intent(this, Graficos.class);
        startActivity(intent);
    }
}
