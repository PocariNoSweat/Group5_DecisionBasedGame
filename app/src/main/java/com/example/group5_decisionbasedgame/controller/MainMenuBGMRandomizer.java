package com.example.group5_decisionbasedgame.controller;


import android.content.Context;
import android.media.MediaPlayer;

import com.example.group5_decisionbasedgame.R;

import java.util.Random;

public class MainMenuBGMRandomizer {
    public static MediaPlayer MainMenu_music;

    public static void MainMenuMusic(Context context) {
        Random randomizer = new Random();
        byte seed = (byte) randomizer.nextInt(6);

        switch (seed) {
            case 0:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic); break;
            case 1:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic1); break;
            case 2:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic2); break;
            case 3:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic3); break;
            case 4:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic4); break;
            case 5:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic5); break;
        }
        MainMenu_music.start();
        MainMenu_music.setVolume(100,100);
        MainMenu_music.setLooping(true);
    }
}
