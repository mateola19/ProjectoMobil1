package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tienda extends AppCompatActivity {
    Button Return;

    int valorClick= 1;
    Button auto;
    Button botonMejora1;
    BigInteger num= BigInteger.ZERO;
    Integer costeBillete= 100;
    BigInteger mil = new BigInteger("1000");
    BigInteger millon = new BigInteger("1000000");
    BigInteger billon= new BigInteger("1000000000");
    int numero = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
        num = BigInteger.valueOf(getIntent().getIntExtra("num", 0));
        valorClick = getIntent().getIntExtra("valorClick", 1);
        costeBillete = getIntent().getIntExtra("costeBillete", 100);
        botonMejora1 = (Button) findViewById(R.id.button2);
        botonMejora1.setText("Coste: " + costeBillete);
        Return = findViewById(R.id.button18);
        auto = (Button) findViewById(R.id.autoclick);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irReturn();

            }
        });
    }
    public void irReturn(){
        Intent intent= new Intent(this, PantallaInicio.class);
        intent.putExtra("num", num.intValue());
        intent.putExtra("valorClick", valorClick);
        intent.putExtra("costeBillete", costeBillete.intValue());
        startActivity(intent);

    }
    public void mejora(View v) {
        if (num.compareTo(new BigInteger("100")) >= 0) {
            num = num.subtract(BigInteger.valueOf(costeBillete));
            valorClick = valorClick + 1;
            //contador.setText(numFormato(num));
            costeBillete = costeBillete + 20;
            botonMejora1.setText("Coste: " + costeBillete);
        }
    }
    public String numFormato (BigInteger valor) {
        String formattedValue = valor.toString();

        if (valor.compareTo(mil)>= 0 && valor.compareTo(millon) < 0) {
            formattedValue=Double.toString(valor.divide(BigInteger.valueOf(1000)).doubleValue()).substring(0,3) + "Mil";
        } else if (valor.compareTo(millon)>= 0 && valor.compareTo(billon) < 0) {
            formattedValue = Double.toString(valor.divide(BigInteger.valueOf(1000000)).doubleValue()).substring(0,4) + "M";
        }
        else if (valor.compareTo(billon)>= 0 && valor.compareTo(billon) < 0) {
            formattedValue = Double.toString(valor.divide(BigInteger.valueOf(1000000000)).doubleValue()).substring(0,5) + "B";
        }
        return formattedValue;
    }
    public void auto(){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                num = num.add(BigInteger.valueOf(numero));
                //Background work here
                handler.post(() -> {
                    ScaleAnimation fade_in = new ScaleAnimation(0.7f, 1.2f, 0.7f, 1.2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    fade_in.setDuration(100);
                    //mechaPapaaaaa.startAnimation(fade_in);
                    //contador.setText(numFormato(num));
                    //UI Thread work here
                });
            }
        });
    }
}

