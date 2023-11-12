package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logs extends AppCompatActivity {
    Button MainActivity;
    Button m;
    Button r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logs);
        MainActivity = findViewById(R.id.button13);
        r = findViewById(R.id.button12);
        m = findViewById(R.id.button14);
        MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irMainActivity();

            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irRefraction();

            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irMirror();

            }
        });
        }
        public void irMainActivity(){
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    public void irRefraction(){
        Intent intent= new Intent(this, Refraction.class);
        startActivity(intent);

    }
    public void irMirror(){
        Intent intent= new Intent(this, Mirror.class);
        startActivity(intent);

    }
}