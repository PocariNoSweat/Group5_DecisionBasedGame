package com.example.group5_decisionbasedgame.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import com.example.group5_decisionbasedgame.R;

public class Intro extends AppCompatActivity {
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private TextView txt1, txt2, txt3, txt4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_intro);

        mContentView = findViewById(R.id.layout);
        txt1 = findViewById(R.id.txtsplash1);
        txt2 = findViewById(R.id.txtsplash2);
        txt3 = findViewById(R.id.txtsplash3);
        txt4 = findViewById(R.id.txtsplash4);

        final AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        final AlphaAnimation fadeOut = new AlphaAnimation( 1.0f , 0.0f ) ;
        final AlphaAnimation hideElement = new AlphaAnimation( 1.0f , 0.0f ) ;

        hideElement.setDuration(0);
        hideElement.setFillAfter(true);
        hideElement.setStartOffset(fadeIn.getStartOffset());
        fadeIn.setDuration(5000);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(5000);
        fadeOut.setFillAfter(true);
        fadeOut.setStartOffset(fadeIn.getStartOffset());

        txt1.startAnimation(hideElement);
        txt2.startAnimation(hideElement);
        txt3.startAnimation(hideElement);
        txt4.startAnimation(hideElement);

        txt1.startAnimation(fadeIn);
        txt2.startAnimation(fadeIn);

        mHideHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                txt1.startAnimation(fadeOut);
                txt2.startAnimation(fadeOut);
                txt3.startAnimation(fadeIn);
                txt4.startAnimation(fadeIn);

                mContentView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        startActivity(new Intent(Intro.this, Main_Menu.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return false;
                    }
                });
            }
        }, 5000);


    }

    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
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
}