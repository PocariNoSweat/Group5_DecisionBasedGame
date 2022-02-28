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
        byte seed = (byte) randomizer.nextInt(27);

        switch (seed) {
            case 0:
                txtFact.setText(LoadingScreenTexts.getfact1()); break;
            case 1:
                txtFact.setText(LoadingScreenTexts.getfact2()); break;
            case 2:
                txtFact.setText(LoadingScreenTexts.getfact3()); break;
            case 3:
                txtFact.setText(LoadingScreenTexts.getfact4()); break;
            case 4:
                txtFact.setText(LoadingScreenTexts.getfact5()); break;
            case 5:
                txtFact.setText(LoadingScreenTexts.getfact6()); break;
            case 6:
                txtFact.setText(LoadingScreenTexts.getfact7()); break;
            case 7:
                txtFact.setText(LoadingScreenTexts.getfact8()); break;
            case 8:
                txtFact.setText(LoadingScreenTexts.getfact9()); break;
            case 9:
                txtFact.setText(LoadingScreenTexts.getfact10()); break;
            case 10:
                txtFact.setText(LoadingScreenTexts.getfact11()); break;
            case 11:
                txtFact.setText(LoadingScreenTexts.getfact12()); break;
            case 12:
                txtFact.setText(LoadingScreenTexts.getfact13()); break;
            case 13:
                txtFact.setText(LoadingScreenTexts.getfact14()); break;
            case 14:
                txtFact.setText(LoadingScreenTexts.getfact15()); break;
            case 15:
                txtFact.setText(LoadingScreenTexts.getfact16()); break;
            case 16:
                txtFact.setText(LoadingScreenTexts.getfact17()); break;
            case 17:
                txtFact.setText(LoadingScreenTexts.getfact18()); break;
            case 18:
                txtFact.setText(LoadingScreenTexts.getfact19()); break;
            case 19:
                txtFact.setText(LoadingScreenTexts.getfact20()); break;
            case 20:
                txtFact.setText(LoadingScreenTexts.getfact21()); break;
            case 21:
                txtFact.setText(LoadingScreenTexts.getfact22()); break;
            case 22:
                txtFact.setText(LoadingScreenTexts.getfact23()); break;
            case 23:
                txtFact.setText(LoadingScreenTexts.getfact24()); break;
            case 24:
                txtFact.setText(LoadingScreenTexts.getfact25()); break;
            case 25:
                txtFact.setText(LoadingScreenTexts.getfact26()); break;
            case 26:
                txtFact.setText(LoadingScreenTexts.getfact27()); break;
        }
    }
}

