package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class md extends AppCompatActivity {
    Button Retornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md);
        Retornar = findViewById(R.id.button21);
        Retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irRetornar();

            }
        });
    }
    public void irRetornar () {
        Intent intent = new Intent(this, Logs.class);
        startActivity(intent);

    }

}