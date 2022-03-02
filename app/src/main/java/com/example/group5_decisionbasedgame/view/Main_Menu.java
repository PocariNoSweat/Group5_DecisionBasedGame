package com.example.group5_decisionbasedgame.view;

import static com.example.group5_decisionbasedgame.controller.MainMenuBGMRandomizer.MainMenu_music;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;
import com.example.group5_decisionbasedgame.controller.MainMenuBGMRandomizer;

public class Main_Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_mainmenu);

        //media player

        MainMenuBGMRandomizer.MainMenuMusic(this);

        //button IDs and listeners
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        //Main buttons for next activities
        switch (v.getId()) {

            case R.id.btn1:
                startActivity(new Intent(Main_Menu.this, AlexIntro.class));//When button is touched, it will take you to the start of the game
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                MainMenu_music.stop();
                break;

            case R.id.btn3:
                startActivity(new Intent(Main_Menu.this, Settings.class));//When button is touched, it will take you to the settings
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                MainMenu_music.stop();
                break;

            case R.id.btn4:
                startActivity(new Intent(Main_Menu.this, Credits.class));//When button is touched, it will take you to the settings
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                MainMenu_music.stop();
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
