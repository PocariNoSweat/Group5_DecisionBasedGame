package com.example.group5_decisionbasedgame.view;

import static com.example.group5_decisionbasedgame.controller.EndingBGMRandomizer.EndingBGM;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;
import com.example.group5_decisionbasedgame.controller.EndingBGMRandomizer;

public class Ending3 extends AppCompatActivity implements View.OnClickListener{

    TextView txtending;
    Button btnmainmenu, btnagain, btnload;
    MediaPlayer bgmwin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_3rdending);

        //Media Player
        bgmwin = MediaPlayer.create(this, R.raw.bgmwin);
        bgmwin.setLooping(true);
        bgmwin.setVolume(100, 100);
        bgmwin.start();



        //IDs and Listeners
        btnagain = findViewById(R.id.btnagain);
        btnagain.setOnClickListener(this);

        btnmainmenu = findViewById(R.id.btnmainmenu);
        btnmainmenu.setOnClickListener(this);

        btnload = findViewById(R.id.btnload);
        btnload.setOnClickListener(this);

        txtending = findViewById(R.id.txtending);
        txtending.animate().alpha(0f).setDuration(30000);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnagain:
                AlertDialog.Builder builder = new AlertDialog.Builder(Ending3.this);
                builder.setCancelable(true);
                builder.setTitle("Attention!");
                builder.setMessage("Do you wish to restart the game?");

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(Ending3.this, LoadingScreen.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        bgmwin.stop();
                    }
                });
                builder.show();
                break;

            case R.id.btnmainmenu:
                builder = new AlertDialog.Builder(Ending3.this);
                builder.setCancelable(true);
                builder.setTitle("Attention!");
                builder.setMessage("Do you wish to return to the main menu? You will lose all your progress.");

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(Ending3.this, Main_Menu.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        bgmwin.stop();
                    }
                });
                builder.show();
                break;
            case R.id.btnload:
                startActivity(new Intent(Ending3.this, LoadingScreen.class));//not finished
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                bgmwin.stop();
                break;
        }
    }

    private void enableFullscreen(){
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
