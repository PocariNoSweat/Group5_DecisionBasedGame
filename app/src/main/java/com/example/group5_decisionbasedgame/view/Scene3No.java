package com.example.group5_decisionbasedgame.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.group5_decisionbasedgame.R;
public class Scene3No extends AppCompatActivity implements View.OnClickListener{

    Button btnnextdlg, btnpause;
    TextView txtdlg, txtname;
    MediaPlayer bgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_firstscene);

        //music
        bgm = MediaPlayer.create(this, R.raw.firstscenebgm);
        bgm.setLooping(true);
        bgm.setVolume(100, 100);
        bgm.start();

        //IDS and Listeners
        btnnextdlg = findViewById(R.id.btnnextdlg);
        btnnextdlg.setOnClickListener(this);

        btnpause = findViewById(R.id.btnpause);
        btnpause.setOnClickListener(this);

        txtdlg = findViewById(R.id.txtdlg);
        txtname = findViewById(R.id.txtname);

        txtname.setVisibility(View.INVISIBLE);
        txtdlg.setText("Oops! This route is still under construction. We are terribly sorry!");
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnnextdlg:
                    startActivity(new Intent(Scene3No.this, Scene2BlameOldManScenario.class));
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    bgm.stop();
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
