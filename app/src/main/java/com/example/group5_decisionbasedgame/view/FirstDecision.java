package com.example.group5_decisionbasedgame.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5_decisionbasedgame.R;

public class FirstDecision extends AppCompatActivity implements View.OnClickListener {

    TextView txtdecision1, txtdecision2, txtdecision3, txtdecision4, txtscenario;
    Button btnpause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_firstdecision);

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
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtdecision1:
                startActivity(new Intent(FirstDecision.this, Ending1.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
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
