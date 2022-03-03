package com.example.group5_decisionbasedgame.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;
import com.example.group5_decisionbasedgame.controller.FirstSceneDlgFlow;
import com.example.group5_decisionbasedgame.model.ScenarioDialogues;

public class FirstScene extends AppCompatActivity implements View.OnClickListener {

    Button btnnextdlg, btnsavegame, btnskipdlg, btnpause;
    TextView txtdlg, txtname;
    FirstSceneDlgFlow kenjigwapo;
    ScenarioDialogues next;
    MediaPlayer bgm;
    ImageView imgAlex, imgBryan, imgToni, imgLeRodge, imgNatasha, imgMitsuo;

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

        btnsavegame = findViewById(R.id.btnsavegame);
        btnsavegame.setOnClickListener(this);

        btnskipdlg = findViewById(R.id.btnskipdlg);
        btnskipdlg.setOnClickListener(this);

        btnpause = findViewById(R.id.btnpause);
        btnpause.setOnClickListener(this);

        imgAlex = findViewById(R.id.imgAlex);
        imgLeRodge = findViewById(R.id.imgLeRodge);

        txtdlg = findViewById(R.id.txtdlg);
        txtname = findViewById(R.id.txtname);

        kenjigwapo = new FirstSceneDlgFlow();
        next = new ScenarioDialogues();

        FirstSceneDlgFlow.firstscene(txtdlg, txtname, next, kenjigwapo);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnnextdlg:
                if (next.getnextdlg() == 0) {
                    next.setnextdlg(1);
                }else{
                    next.setnextdlg(next.getnextdlg() + 1);}
                    kenjigwapo.nextdlg(txtdlg, txtname, next, imgAlex, imgLeRodge, imgToni, imgBryan, imgNatasha, imgMitsuo);
                if (next.getnextdlg()==40) {
                    startActivity(new Intent(FirstScene.this, FirstDecision.class));
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    bgm.stop();
                }
                break;
            case R.id.btnskipdlg:
                AlertDialog.Builder builder = new AlertDialog.Builder(FirstScene.this);
                builder.setCancelable(true);
                builder.setTitle("Attention!");
                builder.setMessage("This will skip the scenario. Continue to the decisions?");

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(FirstScene.this, FirstDecision.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        bgm.stop();
                    }
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
