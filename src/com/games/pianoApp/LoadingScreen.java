package com.games.pianoApp;

import com.games.framework.Game;
import com.games.framework.Graphics;
import com.games.framework.Screen;
import com.games.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("blackBG.png", PixmapFormat.RGB565);
        Assets.blackKeyDown = g.newPixmap("blackdown.png", PixmapFormat.ARGB4444);
        Assets.blackKeyUp = g.newPixmap("blackup.png", PixmapFormat.ARGB4444);
        
        Assets.key = g.newPixmap("key.png", PixmapFormat.ARGB4444);
        Assets.keyDown = g.newPixmap("keyDown.png", PixmapFormat.ARGB4444);
        Assets.keyUp = g.newPixmap("keyup.png", PixmapFormat.ARGB4444);
        Assets.keyPressed = g.newPixmap("keyPressed.png", PixmapFormat.ARGB4444);
        
        Assets.black0 = game.getAudio().newSound("blackroof0.mp3");
        Assets.black1 = game.getAudio().newSound("blackroof1.mp3");
        Assets.black2 = game.getAudio().newSound("blackroof2.mp3");
        Assets.black3 = game.getAudio().newSound("blackroof3.mp3");
        Assets.black4 = game.getAudio().newSound("blackroof4.mp3");
        Assets.black5 = game.getAudio().newSound("blackroof5.mp3");
        Assets.black6 = game.getAudio().newSound("blackroof6.mp3");
        
        Assets.white0 = game.getAudio().newSound("roof0.mp3");
        Assets.white1 = game.getAudio().newSound("roof1.mp3");
        Assets.white2 = game.getAudio().newSound("roof2.mp3");
        Assets.white3 = game.getAudio().newSound("roof3.mp3");
        Assets.white4 = game.getAudio().newSound("roof4.mp3");
        Assets.white5 = game.getAudio().newSound("roof5.mp3");
        Assets.white6 = game.getAudio().newSound("roof6.mp3");
        Assets.white7 = game.getAudio().newSound("roof7.mp3");
        Assets.white8 = game.getAudio().newSound("roof8.mp3");
        Assets.white9 = game.getAudio().newSound("roof9.mp3");
        
//        Assets.card = g.newPixmap("card.png", PixmapFormat.ARGB4444);
//        Assets.logo = g.newPixmap("title.png", PixmapFormat.ARGB4444);
//        Assets.mainMenu = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
//        Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
//        Assets.help1 = g.newPixmap("help1.png", PixmapFormat.ARGB4444);
//        Assets.help2 = g.newPixmap("help2.png", PixmapFormat.ARGB4444);
//        Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
//        Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
//        Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
//        Assets.pause = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
//        Assets.gameOver = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);
//        Assets.click = game.getAudio().newSound("click.ogg");
//        Assets.eat = game.getAudio().newSound("eat.ogg");
//        Assets.bitten = game.getAudio().newSound("bitten.ogg");
//        Assets.playtext = g.newPixmap("playtext.png", PixmapFormat.ARGB4444);
//        Assets.suits = g.newPixmap("suits.png", PixmapFormat.ARGB4444);
//        Assets.redNumbers = g.newPixmap("rednumbers.png", PixmapFormat.ARGB4444);
//        Assets.blackNumbers = g.newPixmap("blacknumbers.png", PixmapFormat.ARGB4444);
//        Assets.play = g.newPixmap("play.png", PixmapFormat.ARGB4444);
//        Assets.winlost = g.newPixmap("winlost.png", PixmapFormat.ARGB4444);
        
        Settings.load(game.getFileIO());
        game.setScreen(new GameScreen(game));
    }

    @Override
    public void present(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}