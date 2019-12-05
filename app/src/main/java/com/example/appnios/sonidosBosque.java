package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sonidosBosque extends AppCompatActivity implements View.OnClickListener{
    ImageButton ciervoBtn, buhoBtn, ardillaBtn, loboBtn, osoBtn;
    MediaPlayer playSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_bosque);


        ciervoBtn = findViewById(R.id.ciervoBtn);
        buhoBtn = findViewById(R.id.buhoBtn);
        ardillaBtn = findViewById(R.id.ardillaBtn);
        loboBtn = findViewById(R.id.loboBtn);
        osoBtn = findViewById(R.id.osoBtn);

        ciervoBtn.setOnClickListener(this);
        buhoBtn.setOnClickListener(this);
        ardillaBtn.setOnClickListener(this);
        loboBtn.setOnClickListener(this);
        osoBtn.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if(playSound.isPlaying()){
            playSound.stop();
        }else {
            if (ciervoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.ciervo);
                playSound.start();
            }
            if (buhoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.buho);
                playSound.start();
            }
            if (ardillaBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.ardilla);
                playSound.start();
            }
            if (loboBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.lobo);
                playSound.start();
            }
            if (osoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.oso);
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
