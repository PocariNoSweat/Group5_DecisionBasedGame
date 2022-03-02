package com.example.group5_decisionbasedgame.view;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;

public class Credits extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer player;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_credits);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(this);

        //music
        player = MediaPlayer.create(this, R.raw.creditsbgm);
        player.setLooping(true);
        player.setVolume(100, 100);
        player.start();
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnback:
                startActivity(new Intent(Credits.this, Main_Menu.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                player.stop();
                break;
        }
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
