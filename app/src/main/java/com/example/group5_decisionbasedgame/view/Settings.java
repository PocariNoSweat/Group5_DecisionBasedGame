package com.example.group5_decisionbasedgame.view;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer player;
    private TextView txtlogsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_settings);

        //music player

        player = MediaPlayer.create(this, R.raw.settingsmusic);
        player.setLooping(true);
        player.setVolume(100, 100);
        player.start();

        // Ids
        txtlogsettings = findViewById(R.id.txtlogsettings);

        //buttons and listeners

        Button btneng = findViewById(R.id.btneng);
        btneng.setOnClickListener(this);

        Button btntag = findViewById(R.id.btntag);
        btntag.setOnClickListener(this);

        Button btnceb = findViewById(R.id.btnceb);
        btnceb.setOnClickListener(this);

        Button btnchi = findViewById(R.id.btnchi);
        btnchi.setOnClickListener(this);

        Button btnjap = findViewById(R.id.btnjap);
        btnjap.setOnClickListener(this);

        Button btnrus = findViewById(R.id.btnrus);
        btnrus.setOnClickListener(this);

        Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnback:
                startActivity(new Intent(Settings.this, Main_Menu.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                player.stop();
                break;

            case R.id.btneng:
                if (txtlogsettings.getVisibility() == View.VISIBLE) {
                    txtlogsettings.setVisibility(View.GONE);//remove "LANGUAGE APPLIED" text when clicking on another button
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(Settings.this);

                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Change the language to English?");

                builder.setPositiveButton("YES", (dialogInterface, i) -> txtlogsettings.setVisibility(View.VISIBLE));

                builder.setNegativeButton("CANCEL", (dialogInterface, i) -> dialogInterface.cancel());
                builder.show();
                break;

            case R.id.btntag:

                if (txtlogsettings.getVisibility() == View.VISIBLE) {
                    txtlogsettings.setVisibility(View.GONE);//remove "LANGUAGE APPLIED" text when clicking on another button
                }

                builder = new AlertDialog.Builder(Settings.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Change the language to Tagalog?");

                builder.setPositiveButton("YES", (dialogInterface, i) -> txtlogsettings.setVisibility(View.VISIBLE));

                builder.setNegativeButton("CANCEL", (dialogInterface, i) -> dialogInterface.cancel());
                builder.show();
                break;

            case R.id.btnceb:

                if (txtlogsettings.getVisibility() == View.VISIBLE) {
                    txtlogsettings.setVisibility(View.GONE);//remove "LANGUAGE APPLIED" text when clicking on another button
                }


                builder = new AlertDialog.Builder(Settings.this);
                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("Change the language to Cebuano?");

                builder.setPositiveButton("YES", (dialogInterface, i) -> txtlogsettings.setVisibility(View.VISIBLE));

                builder.setNegativeButton("CANCEL", (dialogInterface, i) -> dialogInterface.cancel());
                builder.show();
                break;

            case R.id.btnjap:
            case R.id.btnchi:
            case R.id.btnrus:

                if (txtlogsettings.getVisibility() == View.VISIBLE) {
                    txtlogsettings.setVisibility(View.GONE);//remove "LANGUAGE APPLIED" text when clicking on another button
                }
                builder = new AlertDialog.Builder(Settings.this);

                builder.setCancelable(true);
                builder.setTitle("Information");
                builder.setMessage("COMING SOON!");

                builder.setNegativeButton("OKAY", (dialogInterface, i) -> {
                });
                builder.show();
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

