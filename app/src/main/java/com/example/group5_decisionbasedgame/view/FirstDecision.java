package com.example.group5_decisionbasedgame.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;

public class FirstDecision extends AppCompatActivity implements View.OnClickListener {

    TextView txtdecision1, txtdecision2, txtdecision3, txtdecision4, txtscenario;
    Button btnpause;
    MediaPlayer bgm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_firstdecision);

        //music
        bgm = MediaPlayer.create(this, R.raw.firstdecisionbgm);
        bgm.setLooping(true);
        bgm.setVolume(100, 100);
        bgm.start();


        //IDs and Listeners
        txtdecision1 = findViewById(R.id.txtdecision1);
        txtdecision1.setOnClickListener(this);

        txtdecision2 = findViewById(R.id.txtdecision2);
        txtdecision2.setOnClickListener(this);

        txtdecision3 = findViewById(R.id.txtdecision3);
        txtdecision3.setOnClickListener(this);

        txtdecision4 = findViewById(R.id.txtdecision4);
        txtdecision4.setOnClickListener(this);

        txtscenario = findViewById(R.id.txtscenario);

        btnpause = findViewById(R.id.btnpause);
        btnpause.setOnClickListener(this);

        //text color
        String text = "As they wander around, they see an old man asking for help. The group of friends rushed to help the old man. Little do they know the old man was terribly sick and scratched one of them. What should they do?";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan fcsWhite = new ForegroundColorSpan(Color.WHITE);
        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);

        ss.setSpan(fcsWhite, 0, 185, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsRed, 186, 206, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtscenario.setText(ss);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtdecision1:
                startActivity(new Intent(FirstDecision.this, Scene2IgnoreScratch.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                bgm.stop();
                break;
            case R.id.txtdecision2:
            case R.id.txtdecision3:
                AlertDialog.Builder builder = new AlertDialog.Builder(FirstDecision.this);
                builder.setCancelable(true);
                builder.setTitle("Attention!");
                builder.setMessage("This decision is unavailable. Try another one.");

                builder.setNegativeButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                break;
            case R.id.txtdecision4:
                startActivity(new Intent(FirstDecision.this, Scene2BlameOldMan.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                bgm.stop();
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
