package com.example.group5_decisionbasedgame.controller;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.group5_decisionbasedgame.R;

import java.util.Random;

public class EndingBGMRandomizer {
        public static MediaPlayer EndingBGM;

        public static void EndingMusic(Context context) {
            Random randomizer = new Random();
            byte seed = (byte) randomizer.nextInt(3);

            switch (seed) {
                case 0:
                    EndingBGM = MediaPlayer.create(context, R.raw.endingbgm); break;
                case 1:
                    EndingBGM = MediaPlayer.create(context, R.raw.endingbgm1); break;
                case 2:
                    EndingBGM = MediaPlayer.create(context, R.raw.endingbgm2); break;

            }
            EndingBGM.start();
            EndingBGM.setVolume(100,100);
            EndingBGM.setLooping(true);
        }
    }

