package com.example.group5_decisionbasedgame.controller;

import android.widget.ImageView;

import com.example.group5_decisionbasedgame.R;

import java.util.Random;

public class BackgroundRandomizer {

public BackgroundRandomizer(){}

    public static void nxtBg1(ImageView background) { background.setImageResource(R.drawable.background1); }
    public static void nxtBg2(ImageView background) { background.setImageResource(R.drawable.background2); }
    public static void nxtBg3(ImageView background) { background.setImageResource(R.drawable.background3); }

    //background randomizer for loading screens
    public static void RandomBG (ImageView background) {
        Random randomizer = new Random();
        byte seed = (byte) randomizer.nextInt(2);

        switch (seed) {
            case 0: nxtBg1(background); break;
            case 1: nxtBg2(background); break;
            case 2: nxtBg3(background); break;
        }
    }
}
