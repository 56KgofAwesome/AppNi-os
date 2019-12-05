package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton granjaBtn, selvaBtn, marBtn, casaBtn2, bosqueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        granjaBtn = findViewById(R.id.granjaBtn);
        selvaBtn = findViewById(R.id.selvaBtn);
        marBtn = findViewById(R.id.marBtn);
        casaBtn2 = findViewById(R.id.casaBtn2);
        bosqueBtn = findViewById(R.id.bosqueBtn);

        granjaBtn.setOnClickListener(this);
        selvaBtn.setOnClickListener(this);
        marBtn.setOnClickListener(this);
        casaBtn2.setOnClickListener(this);
        bosqueBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(granjaBtn.isPressed()){
            Intent i = new Intent(MainActivity.this, sonidosGranja.class);
            //Intent i = new Intent("com.example.appnios.sonidosGranja");
            startActivity(i);
        }if(selvaBtn.isPressed()){
            Intent i = new Intent(MainActivity.this, sonidosSelva.class);
            //Intent i = new Intent("com.example.appnios.sonidosGranja");
            startActivity(i);
        }if(marBtn.isPressed()){
            Intent i = new Intent(MainActivity.this, sonidosMar.class);
            //Intent i = new Intent("com.example.appnios.sonidosGranja");
            startActivity(i);
        }if(casaBtn2.isPressed()){
            Intent i = new Intent(MainActivity.this, sonidosCasa.class);
            //Intent i = new Intent("com.example.appnios.sonidosGranja");
            startActivity(i);
        }if(bosqueBtn.isPressed()){
            Intent i = new Intent(MainActivity.this, sonidosBosque.class);
            //Intent i = new Intent("com.example.appnios.sonidosGranja");
            startActivity(i);
        }

    }
}
