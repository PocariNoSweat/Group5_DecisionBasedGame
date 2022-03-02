package com.example.group5_decisionbasedgame.view;

import static com.example.group5_decisionbasedgame.controller.EndingBGMRandomizer.EndingBGM;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;

public class FirstScene extends AppCompatActivity implements View.OnClickListener {
    TextView btnnextdlg, btnsavegame, btnskipdlg, btnpause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_firstscene);

        //IDS and Listeners
        btnnextdlg = findViewById(R.id.btnnextdlg);
        btnnextdlg.setOnClickListener(this);

        btnsavegame = findViewById(R.id.btnsavegame);
        btnsavegame.setOnClickListener(this);

        btnskipdlg = findViewById(R.id.btnskipdlg);
        btnskipdlg.setOnClickListener(this);

        btnpause = findViewById(R.id.btnpause);
        btnpause.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

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
