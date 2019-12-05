package com.example.appnios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sonidosMar extends AppCompatActivity implements View.OnClickListener{

    ImageButton orcaBtn, ballenaBtn, delfinBtn, focaBtn;
    MediaPlayer playSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_mar);



        orcaBtn = findViewById(R.id.orcaBtn);
        ballenaBtn = findViewById(R.id.ballenaBtn);
        delfinBtn = findViewById(R.id.delfinBtn);
        focaBtn = findViewById(R.id.focaBtn);

        orcaBtn.setOnClickListener(this);
        ballenaBtn.setOnClickListener(this);
        delfinBtn.setOnClickListener(this);
        focaBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(playSound.isPlaying()){
            playSound.stop();
        }else {

            if (ballenaBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.ballena);
                playSound.start();
            }
            if (delfinBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.delfin);
                playSound.start();
            }
            if (focaBtn.isPressed()) {
                playSound = MediaPlayer.create(this, R.raw.foca);
                playSound.start();
            }
            if (v.getId() == R.id.orcaBtn) {
                playSound = MediaPlayer.create(this, R.raw.orca);
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
