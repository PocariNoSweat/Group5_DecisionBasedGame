package com.example.group5_decisionbasedgame.view;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;
import com.example.group5_decisionbasedgame.controller.BackgroundRandomizer;
import com.example.group5_decisionbasedgame.controller.FactRandomizer;

public class LoadingScreen extends AppCompatActivity {
    ImageView background;
   public TextView txtFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_loadingscreen);
        background = findViewById(R.id.bgImage);
        txtFact = findViewById(R.id.txtFact);

        BackgroundRandomizer.RandomBG(background);
        FactRandomizer.RandomFact(txtFact);
        txtFact.animate().alpha(0f).setDuration(11000);
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(LoadingScreen.this, FirstScene.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }, 12000);//when 11 seconds of text animation is done, 1 second for hold and it will take the user to the next activity. (12 seconds total)
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
