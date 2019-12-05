package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sonidosCasa extends AppCompatActivity implements View.OnClickListener{

    ImageButton conejoBtn, perroBtn, gatoBtn, hamsterBtn, loroBtn;
    MediaPlayer playSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_casa);

        conejoBtn = findViewById(R.id.conejoBtn);
        perroBtn = findViewById(R.id.perroBtn);
        gatoBtn = findViewById(R.id.gatoBtn);
        hamsterBtn = findViewById(R.id.hamsterBtn);
        loroBtn = findViewById(R.id.loroBtn);

        conejoBtn.setOnClickListener(this);
        perroBtn.setOnClickListener(this);
        gatoBtn.setOnClickListener(this);
        hamsterBtn.setOnClickListener(this);
        loroBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(playSound.isPlaying()){
            playSound.stop();
        }else {
            if (conejoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.conejo);
                playSound.start();
            }
            if (perroBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.perro);
                playSound.start();
            }
            if (gatoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.gato);
                playSound.start();
            }
            if (hamsterBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.hamster);
                playSound.start();
            }
            if (loroBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.loro);
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
