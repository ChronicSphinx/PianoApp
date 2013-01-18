package com.games.pianoApp;

import com.games.framework.Screen;
import com.games.framework.impl.AndroidGame;

public class PianoApp extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}