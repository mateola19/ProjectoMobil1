package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Refraction extends AppCompatActivity {

    Button Vuelta;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rr);
            Vuelta = findViewById(R.id.button22);
            Vuelta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    irVuelta();

                }
            });
        }
        public void irVuelta () {
            Intent intent = new Intent(this, Logs.class);
            startActivity(intent);

        }

}