package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PantallaInicio extends AppCompatActivity {


    int valorClick= 50;

    Integer num= 0;
    ImageView mechaPapaaaaa;
    Integer costeBillete= 100;


    TextView contador;


    Button tienda;

    Button vuelta;
    int numero = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);
        contador = (TextView) findViewById(R.id.textocontador);
        num = getIntent().getIntExtra("num", 0);
        contador.setText(""+num);
        valorClick = getIntent().getIntExtra("valorClick", 1);
        costeBillete = getIntent().getIntExtra("costeBillete", 100);
        mechaPapaaaaa = (ImageView) findViewById(R.id.imagePapaya);

        tienda = findViewById(R.id.button15);
        vuelta = findViewById(R.id.button20);
        tienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irTienda();
            }
        });
        vuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irVuelta();
            }
        });

    }
        public void irTienda() {
            Intent intent = new Intent(this, Tienda.class);
            intent.putExtra("num", num.intValue());
            intent.putExtra("valorClick", valorClick);
            intent.putExtra("costeBillete", costeBillete.intValue());
            startActivity(intent);
        }
    public void irVuelta() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("num", num.intValue());
        intent.putExtra("valorClick", valorClick);
        intent.putExtra("costeBillete", costeBillete.intValue());
        startActivity(intent);
    }

    public void sumar(View v){
        ScaleAnimation fade_in = new ScaleAnimation(0.7f, 1.2f, 0.7f, 1.2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        fade_in.setDuration(100);
        mechaPapaaaaa.startAnimation(fade_in);
        num += (1* valorClick);
      contador.setText(""+num);



      }




    }



