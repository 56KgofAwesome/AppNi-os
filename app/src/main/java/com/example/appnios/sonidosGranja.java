package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sonidosGranja extends AppCompatActivity implements View.OnClickListener{

   ImageButton cerdoBtn, burroBtn, vacaBtn, patoBtn, polloBtn;
    MediaPlayer playSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_granja);


        cerdoBtn = findViewById(R.id.cerdoBtn);
        burroBtn = findViewById(R.id.burroBtn);
        vacaBtn = findViewById(R.id.vacaBtn);
        patoBtn = findViewById(R.id.patoBtn);
        polloBtn = findViewById(R.id.polloBtn);

        cerdoBtn.setOnClickListener(this);
        burroBtn.setOnClickListener(this);
        vacaBtn.setOnClickListener(this);
        patoBtn.setOnClickListener(this);
        polloBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(playSound.isPlaying()){
            playSound.stop();
        }else {
            if (cerdoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.cerdo);
                playSound.start();
            }
            if (burroBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.burro);
                playSound.start();
            }
            if (vacaBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.vaca);
                playSound.start();
            }
            if (patoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.pato);
                playSound.start();
            }
            if (polloBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.pollo);
                playSound.start();
            }
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
        playSound = MediaPlayer.create(this,R.raw.conejo);
    }
    @Override
    protected void onPause() {
        super.onPause();
        playSound.stop();
    }
}
