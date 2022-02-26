package com.example.group5_decisionbasedgame.controller;
import android.widget.TextView;

import com.example.group5_decisionbasedgame.model.LoadingScreenTexts;

import java.util.Random;

public class FactRandomizer extends LoadingScreenTexts{

    TextView txtFact;

    public FactRandomizer() {

            Random randomizer = new Random();
            byte seed = (byte) randomizer.nextInt(4);


            }
        }
