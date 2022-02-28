package com.example.group5_decisionbasedgame.controller;
import com.example.group5_decisionbasedgame.model.LoadingScreenTexts;

import java.util.Random;

import android.widget.TextView;

public class FactRandomizer {

    public FactRandomizer() {
        new LoadingScreenTexts();
    }
    public static void RandomFact(TextView txtFact) {

        Random randomizer = new Random();
        byte seed = (byte) randomizer.nextInt(4);

        switch (seed) {
            case 0:
                txtFact.setText(LoadingScreenTexts.getfact1()); break;
            case 1:
                txtFact.setText(LoadingScreenTexts.getfact2()); break;
            case 2:
                txtFact.setText(LoadingScreenTexts.getfact3()); break;
            case 3:
                txtFact.setText(LoadingScreenTexts.getfact4()); break;
        }
    }
}

