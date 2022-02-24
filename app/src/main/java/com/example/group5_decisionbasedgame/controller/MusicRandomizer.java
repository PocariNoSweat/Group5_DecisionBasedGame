package com.example.group5_decisionbasedgame.controller;


import android.content.Context;
import android.media.MediaPlayer;

import com.example.group5_decisionbasedgame.R;

import java.util.Random;

public class MusicRandomizer {
    public static MediaPlayer MainMenu_music;

    public static void MainMenuMusic(Context context) {
        Random randomizer = new Random();
        byte seed = (byte) randomizer.nextInt(3);

        switch (seed) {
            case 0:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic); break;
            case 1:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic1); break;
            case 2:
                MainMenu_music = MediaPlayer.create(context, R.raw.mainmenumusic2); break;
        }
        MainMenu_music.start();
        MainMenu_music.setVolume(100,100);
        MainMenu_music.setLooping(true);
    }
}
