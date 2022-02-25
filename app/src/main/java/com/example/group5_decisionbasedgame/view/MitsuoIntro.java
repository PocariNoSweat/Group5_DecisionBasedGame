package com.example.group5_decisionbasedgame.view;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;

public class MitsuoIntro extends AppCompatActivity {

    MediaPlayer soundeffect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_mitsuointro);

        //IDs
        TextView txt = findViewById(R.id.touchscreen);
        ImageView mitsuoid = findViewById(R.id.mitsuoid);


        soundeffect = MediaPlayer.create(this, R.raw.pageturnsoundeffect);


        final AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        final AlphaAnimation fadeintxt = new AlphaAnimation(0.0f, 1.0f);
        final AlphaAnimation hideElement = new AlphaAnimation(1.0f, 0.0f);
        //touch count
        final int[] touchCount = {0};

        //animations and durations
        hideElement.setDuration(0);
        hideElement.setFillAfter(true);
        fadeintxt.setDuration(10000);
        fadeintxt.setFillAfter(true);
        fadeIn.setDuration(5000);
        fadeIn.setFillAfter(true);

        txt.startAnimation(hideElement);
        mitsuoid.startAnimation(hideElement);

        txt.startAnimation(fadeintxt);
        mitsuoid.startAnimation(fadeIn);
        //close (for cleaning purpose)

        mitsuoid.setOnClickListener(v -> {
            touchCount[0] = touchCount[0] + 1;
            if (touchCount[0] == 3) {
                startActivity(new Intent(MitsuoIntro.this, NatashaIntro.class));//When button is touched, it will take you to the next character
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                soundeffect.setVolume(100,100);
                soundeffect.start();
            }
        });
    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
}
