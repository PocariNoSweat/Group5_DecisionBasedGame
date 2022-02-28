package com.example.group5_decisionbasedgame.view;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.group5_decisionbasedgame.R;

public class Intro extends AppCompatActivity {
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private TextView txt1, txt2, txt3, txt4;
    Animation blinkanim;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_intro);

        //IDs
        mContentView = findViewById(R.id.layout);
        txt1 = findViewById(R.id.txtsplash1);
        txt2 = findViewById(R.id.txtsplash2);
        txt3 = findViewById(R.id.txtsplash3);
        txt4 = findViewById(R.id.txtsplash4);
        blinkanim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blinkanimation);

        final AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        final AlphaAnimation fadeOut = new AlphaAnimation( 1.0f , 0.0f ) ;
        final AlphaAnimation hideElement = new AlphaAnimation( 1.0f , 0.0f ) ;

        //animations and durations
        hideElement.setDuration(0);
        hideElement.setFillAfter(true);
        hideElement.setStartOffset(fadeIn.getStartOffset());
        fadeIn.setDuration(6000);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(1000);
        fadeOut.setFillAfter(true);
        fadeOut.setStartOffset(fadeIn.getStartOffset());

        //use of animations
        txt1.startAnimation(hideElement);
        txt2.startAnimation(hideElement);
        txt3.startAnimation(hideElement);
        txt4.startAnimation(hideElement);

        txt1.startAnimation(fadeIn);
        txt2.startAnimation(fadeIn);

        mHideHandler.postDelayed(() -> {
            txt1.startAnimation(fadeOut);
            txt2.startAnimation(fadeOut);
            txt3.startAnimation(blinkanim);
            txt4.startAnimation(fadeIn);

            mContentView.setOnTouchListener((view, motionEvent) -> {
                startActivity(new Intent(Intro.this, Main_Menu.class)); //When screen is touched, it will take you to the next activity
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                return false;
            });
        }, 5000);


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