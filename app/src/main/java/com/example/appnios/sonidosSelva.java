package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sonidosSelva extends AppCompatActivity implements View.OnClickListener{
    ImageButton monoBtn, leonBtn, elefanteBtn, bufaloBtn, serpienteBtn;
    MediaPlayer playSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_selva);


        monoBtn = findViewById(R.id.monoBtn);
        leonBtn = findViewById(R.id.leonBtn);
        elefanteBtn = findViewById(R.id.elefanteBtn);
        bufaloBtn = findViewById(R.id.bufaloBtn);
        serpienteBtn = findViewById(R.id.serpienteBtn);

        monoBtn.setOnClickListener(this);
        leonBtn.setOnClickListener(this);
        elefanteBtn.setOnClickListener(this);
        bufaloBtn.setOnClickListener(this);
        serpienteBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(playSound.isPlaying()){
            playSound.stop();
        }else {
            if (monoBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.mono);
                playSound.start();
            }
            if (leonBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.leon);
                playSound.start();
            }
            if (elefanteBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.elefante);
                playSound.start();
            }
            if (bufaloBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.bufalo);
                playSound.start();
            }
            if (serpienteBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.serpiente);
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
