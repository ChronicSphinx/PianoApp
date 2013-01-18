package com.games.pianoApp;

import java.util.List;

import android.graphics.Color;

import com.games.framework.Game;
import com.games.framework.Graphics;
import com.games.framework.Input.TouchEvent;
import com.games.framework.Screen;

public class GameScreen extends Screen {
    enum GameState {
        Ready,
        Running,
        Paused,
        GameOver
    }
    
    GameState state = GameState.Ready;
    World world;
   // boolean drawn = false;
    //int oldScore = 0;
    //String score = "0";
    
    
    public GameScreen(Game game) {
        super(game);
        world = new World();
    }

    @Override
    public void update(float deltaTime) {
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();
        
        if(state == GameState.Ready)
            updateReady(touchEvents);
        if(state == GameState.Running)
            updateRunning(touchEvents, deltaTime);
        if(state == GameState.Paused)
            updatePaused(touchEvents);
        if(state == GameState.GameOver)
            updateGameOver(touchEvents);        
    }
    
    private void updateReady(List<TouchEvent> touchEvents) 
    {
        if(touchEvents.size() > 0)
            state = GameState.Running;
    }
    
    private void updateRunning(List<TouchEvent> touchEvents, float deltaTime)
    {        
        int len = touchEvents.size();
        for(int i = 0; i < len; i++) 
        {
            TouchEvent event = touchEvents.get(i);
            if(event.type == TouchEvent.TOUCH_UP) {
                if(event.x < 64 && event.y < 64) {
                    if(Settings.soundEnabled)
                        Assets.click.play(1);
                    state = GameState.Paused;
                    return;
                }
            }
            if(event.type == TouchEvent.TOUCH_DOWN)            
            {
            	//check what keys are pressed there are 10 keys across
            	
            	if(event.x <= 124)
            	{
            		
            	}
            	
            	
            	System.out.println("Running touch");
//            	world.player.countCards();
//            	int count = world.player.count;            	
//            	if(count == 0)
//            	{
//            		world.deck.deal(world.player, true);
//            		world.deck.deal(world.player, true);            		
//            		world.deck.deal(world.dealer, false);
//            		world.deck.deal(world.dealer, true);
//            		world.player.countCards();
//            		world.dealer.countCards();
//            	}
//            	else if(event.x > 764 && event.y > 520) 
//            	{
////            		g.drawPixmap(Assets.playtext, 764, 520, 340, 0, 260, 70);
//                world.stand = true;
//              }
//            	else if(!world.stand)
//            	{
//            		world.deck.deal(world.player, true);
////            		for(int x=0; x< world.player.cards.size(); x++)
////            		{
////            			System.out.println(world.player.cards.get(x).number);
////            		}
//            		world.player.countCards();
//            	}
            	
            	
                
//                if(event.x > 256 && event.y > 416) {
//                    world.snake.turnRight();
//                }
            }            
        }        
        
        world.update(deltaTime);
//        if(world.gameOver) {
//            if(Settings.soundEnabled)
//                Assets.bitten.play(1);
//            state = GameState.GameOver;
//        }
//        if(oldScore != world.score) {
//            oldScore = world.score;
//            score = "" + oldScore;
//            if(Settings.soundEnabled)
//                Assets.eat.play(1);
//        }
    }
    
    private void updatePaused(List<TouchEvent> touchEvents) {
//        int len = touchEvents.size();
//        for(int i = 0; i < len; i++) {
//            TouchEvent event = touchEvents.get(i);
//            if(event.type == TouchEvent.TOUCH_UP) {
//                if(event.x > 80 && event.x <= 240) {
//                    if(event.y > 100 && event.y <= 148) {
//                        if(Settings.soundEnabled)
//                            Assets.click.play(1);
//                        state = GameState.Running;
//                        return;
//                    }                    
//                    if(event.y > 148 && event.y < 196) {
//                        if(Settings.soundEnabled)
//                            Assets.click.play(1);
//                        game.setScreen(new MainMenuScreen(game));                        
//                        return;
//                    }
//                }
//            }
//        }
    }
    
    private void updateGameOver(List<TouchEvent> touchEvents) {
//        int len = touchEvents.size();
//        for(int i = 0; i < len; i++) {
//            TouchEvent event = touchEvents.get(i);
//            if(event.type == TouchEvent.TOUCH_UP) {
//                if(event.x >= 400 && event.x <= 600 && event.y >= 300 && event.y <= 370) 
//                {
//                    if(Settings.soundEnabled)
//                        Assets.click.play(1);
//                    resetGame();
//                    touchEvents.clear();
//                    return;
//                }
//            }
//        }
    }
    
    private void resetGame()
    {
//    	System.out.println("resetting game");
//    	if(world.deck.dealt > 30)
//      {
//      	world.deck.shuffle();
//      }
//    	world.stand = false;
//    	world.player.cards.clear();
//    	world.dealer.cards.clear();
//    	world.player.countCards();
//    	world.dealer.countCards();
//    	state = GameState.Running;
//      world.gameOver = false;
//      world.deck.deal(world.player, true);
//  		world.deck.deal(world.player, true);            		
//  		world.deck.deal(world.dealer, false);
//  		world.deck.deal(world.dealer, true);
//  		world.player.countCards();
//  		world.dealer.countCards();
    }
    

    @Override
    public void present(float deltaTime) {
        Graphics g = game.getGraphics();
//        int topOfKeyX = 0;  //x on the screen
//        int topOfKeyY = 200; //y on the screen
//        int whiteKeyWidth = 100;
//        int whiteKeyHeight = 400;
//        int srcX = 0;
//        int srcY = 0;
//        int srcWidth = 100;
//        int srcHeight = 400;
        g.drawPixmap(Assets.background, 0, 0);
        Key keys[] = world.keys;
        //draw keys to screen
//        int y = 0;
        for(int x = 0; x <= 9; x++)
        {  
        	if(keys[x].keyDown)
        	{
        		g.drawPixmap(keys[x].keyDownGraph, keys[x].x, keys[x].y, keys[x].width, keys[x].height, keys[x].srcX, keys[x].srcY, keys[x].srcWidth, keys[x].srcHeight);
        	}
        	else
        	{
        		g.drawPixmap(keys[x].keyUpGraph, keys[x].x, keys[x].y, keys[x].width, keys[x].height, keys[x].srcX, keys[x].srcY, keys[x].srcWidth, keys[x].srcHeight);
        	}
//        	g.drawPixmap(keys[x].keyUpGraph, topOfKeyX + x, topOfKeyY,whiteKeyWidth, whiteKeyHeight, srcX, srcY, srcWidth, srcHeight);        	
        }
        
        
	      
        
        
        
        
//        drawWorld(world);
//        if(state == GameState.Ready) 
//            drawReadyUI();
//        if(state == GameState.Running)
//            drawRunningUI();
//        if(state == GameState.Paused)
//            drawPausedUI();
//        if(state == GameState.GameOver)
//            drawGameOverUI();
//        
//        drawText(g, score, (g.getWidth() - score.length()*30 / 2)-50, 42);                
    }
    
    private void drawWorld(World world) {
        Graphics g = game.getGraphics();
//        Player player = world.player;
//        Player dealer = world.dealer;
//        drawPlayerCards(player, g);
//        drawDealerCards(dealer, g);
    }
    
    private void drawPlayerCards(Player player, Graphics g)
    {
    	int cardCount = player.cards.size();
      player.x = (425 + 20*cardCount)-cardCount*40;
      player.y = 380;
      int cardWidth = 30;
      int cardHeight = 35;
      int cardWidth10 = 60;
      int suitWidth = 24;
    	int suitHeight = 28;
      for(int x = 0; x < cardCount; x++)
      {
      	int topOfCardx = player.x + 40*x + 5;
      	int suitx = player.x + 40*x + 7;
      	int topOfCardy = player.y + 2;
      	int bottomCardy = player.y + 175;
      	int suitTopy = player.y + 37;
      	int suitBottomy =  300;//player.y + 145;
      	
      	Card card = player.cards.get(x);
//      	System.out.println(card.number);
      	g.drawPixmap(Assets.card, player.x + 40*x, player.y);
      	if(card.suit == 0 || card.suit == 3)
      	{        		
      		if(card.number < 10)
      		{
      			g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
      			//g.drawPixmap(Assets.blackNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
      		}
      		else if(card.number > 10)
      		{
      			if(card.number == 11)
      			{
      				g.drawPixmap(Assets.blackNumbers, topOfCardx + 2, topOfCardy,cardWidth, cardHeight, 430,10,25,60);
      			}
      			else if(card.number ==12)
      			{
      				g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 450,10,47,60);
      			}
      			else
      			{
      				g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 500,10,39,50);
      			}
      			//g.drawPixmap(Assets.blackNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number) * 39,10,39,50);
      		}
      		else
      		{
      			g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 355,10,78,50);
      			//g.drawPixmap(Assets.blackNumbers, topOfCardx, bottomCardy,cardWidth10, cardHeight, (card.number-1) * 39,10,78,50);
      		}
      		if(card.suit == 0)
      		{
      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 0,0,110,140);
      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 0,0,110,140,180);
      		}
      		else
      		{        			
      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 160,140,135,140);
      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 160,140,110,140,180);
      		}
      	}
      	else
      	{
      		if(card.number < 10)
      		{
      			g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
      			//g.drawPixmap(Assets.redNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
      		}
      		else if(card.number > 10)
      		{
      			if(card.number == 11)
      			{
      				g.drawPixmap(Assets.redNumbers, topOfCardx + 2, topOfCardy,cardWidth, cardHeight, 430,10,25,60);
      			}
      			else if(card.number ==12)
      			{
      				g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 450,10,47,60);
      			}
      			else
      			{
      				g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 500,10,39,50);
      			}
      			//g.drawPixmap(Assets.redNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number) * 39,10,39,50);
      		}
      		else
      		{
      			g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 355,10,78,50);
      			//g.drawPixmap(Assets.redNumbers, topOfCardx, bottomCardy,cardWidth10, cardHeight, (card.number-1) * 39,10,78,50);
      		}
      		if(card.suit == 1)
      		{
      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 165,0,125,140);
      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 165,0,110,140,180);
      		}
      		else
      		{        			
      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 0,160,110,140);
      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 0,165,110,140,180);
      		}
      	}
      }
    }
    
//    private void drawDealerCards(Player dealer, Graphics g)
//    {
//    	int cardCount = dealer.cards.size();
//    	dealer.x = (425 + 20*cardCount)-cardCount*40;
//      dealer.y = 20;
//      int cardWidth = 30;
//      int cardHeight = 35;
//      int cardWidth10 = 60;
//      int suitWidth = 24;
//    	int suitHeight = 28;
//      for(int x = 0; x < cardCount; x++)
//      {
//      	int topOfCardx = dealer.x + 40*x + 5;
//      	int suitx = dealer.x + 40*x + 7;
//      	int topOfCardy = dealer.y + 2;
//      	int bottomCardy = dealer.y + 175;
//      	int suitTopy = dealer.y + 37;
//      	int suitBottomy =  300;//player.y + 145;
//      	
//      	Card card = dealer.cards.get(x);
////      	System.out.println(card.number);
//      	g.drawPixmap(Assets.card, dealer.x + 40*x, dealer.y);
//      	if(card.show || world.stand)
//      	{
//	      	if(card.suit == 0 || card.suit == 3)
//	      	{        		
//	      		if(card.number < 10)
//	      		{
//	      			g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
//	      			//g.drawPixmap(Assets.blackNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
//	      		}
//	      		else if(card.number > 10)
//	      		{
//	      			if(card.number == 11)
//	      			{
//	      				g.drawPixmap(Assets.blackNumbers, topOfCardx + 2, topOfCardy,cardWidth, cardHeight, 430,10,25,60);
//	      			}
//	      			else if(card.number ==12)
//	      			{
//	      				g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 450,10,47,60);
//	      			}
//	      			else
//	      			{
//	      				g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 500,10,39,50);
//	      			}
//	      			//g.drawPixmap(Assets.blackNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number) * 39,10,39,50);
//	      		}
//	      		else
//	      		{
//	      			g.drawPixmap(Assets.blackNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 355,10,78,50);
//	      			//g.drawPixmap(Assets.blackNumbers, topOfCardx, bottomCardy,cardWidth10, cardHeight, (card.number-1) * 39,10,78,50);
//	      		}
//	      		if(card.suit == 0)
//	      		{
//	      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 0,0,110,140);
//	      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 0,0,110,140,180);
//	      		}
//	      		else
//	      		{        			
//	      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 160,140,135,140);
//	      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 160,140,110,140,180);
//	      		}
//	      	}
//	      	else
//	      	{
//	      		if(card.number < 10)
//	      		{
//	      			g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
//	      			//g.drawPixmap(Assets.redNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number-1) * 39,10,39,50);
//	      		}
//	      		else if(card.number > 10)
//	      		{
//	      			if(card.number == 11)
//	      			{
//	      				g.drawPixmap(Assets.redNumbers, topOfCardx + 2, topOfCardy,cardWidth, cardHeight, 430,10,25,60);
//	      			}
//	      			else if(card.number ==12)
//	      			{
//	      				g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 450,10,47,60);
//	      			}
//	      			else
//	      			{
//	      				g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 500,10,39,50);
//	      			}
//	      			//g.drawPixmap(Assets.redNumbers, topOfCardx, bottomCardy,cardWidth, cardHeight, (card.number) * 39,10,39,50);
//	      		}
//	      		else
//	      		{
//	      			g.drawPixmap(Assets.redNumbers, topOfCardx, topOfCardy,cardWidth, cardHeight, 355,10,78,50);
//	      			//g.drawPixmap(Assets.redNumbers, topOfCardx, bottomCardy,cardWidth10, cardHeight, (card.number-1) * 39,10,78,50);
//	      		}
//	      		if(card.suit == 1)
//	      		{
//	      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 165,0,125,140);
//	      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 165,0,110,140,180);
//	      		}
//	      		else
//	      		{        			
//	      			g.drawPixmap(Assets.suits, suitx, suitTopy,suitWidth, suitHeight, 0,160,110,140);
//	      			g.drawPixmap(Assets.suits, topOfCardx, suitBottomy,suitWidth, suitHeight, 0,165,110,140,180);
//	      		}
//	      	}
//      	}
//	    }
//    }
    
    private void drawReadyUI() {
        Graphics g = game.getGraphics();
        g.drawPixmap(Assets.playtext, 400, 300, 0, 0, 200, 70);
        //g.drawPixmap(Assets.ready, 512, 200);
//        g.drawLine(0, 416, 480, 416, Color.BLACK);
    }
    
    private void drawRunningUI() {
        Graphics g = game.getGraphics();

        g.drawPixmap(Assets.buttons, 0, 0, 64, 128, 64, 64);
//        g.drawLine(0, 416, 480, 416, Color.BLACK);
        
        g.drawPixmap(Assets.playtext, 0, 520, 200, 0, 140, 70);
        g.drawPixmap(Assets.playtext, 764, 520, 340, 0, 260, 70);
    }
    
    private void drawPausedUI() {
        Graphics g = game.getGraphics();
        
        g.drawPixmap(Assets.pause, 80, 100);
        g.drawLine(0, 416, 480, 416, Color.BLACK);
    }

    private void drawGameOverUI() {
        Graphics g = game.getGraphics();
//        g.drawPixmap(Assets.playtext, 400, 300, 0, 0, 200, 70);
//        if("win".equals(world.win))
//        {
//        	g.drawPixmap(Assets.winlost, 400, 230, 0, 0, 140, 70);
//        }
//        else if("lost".equals(world.win))
//        {
//        	g.drawPixmap(Assets.winlost, 400, 230, 165, 0, 200, 70);
//        }
//        else
//        {
//        	g.drawPixmap(Assets.winlost, 400, 230, 365, 0, 180, 70);
//        }
//        g.drawPixmap(Assets.gameOver, 62, 100);
//        g.drawPixmap(Assets.buttons, 128, 200, 0, 128, 64, 64);
//        g.drawLine(0, 416, 480, 416, Color.BLACK);
    }
    
    public void drawText(Graphics g, String line, int x, int y) {
        int len = line.length();
        int num = 0;
        int srcX = 0;
        int srcY = 10;
        int width = 30;
        int height = 35;
        int srcHeight = 50;
        int srcWidth = 39;
        int newY = y;
        for (int i = 0; i < len; i++) {
            char character = line.charAt(i);
            System.out.println(character);
            if (character == ' ') {
                x += 30;
                continue;
            }
            else if(character == '-')
            {
            	System.out.println();
            	srcX = 532;
            	srcY = 33;
            	height = 15;
            	newY = y + 10;
            	srcHeight = 13;
            	srcWidth= 20;
            }
            else
            {
            	newY = y;
            	width = 30;
              height = 35;
              srcY = 10;
              srcHeight = 50;
              srcWidth = 40;
	            num = (character - '0');
	            srcX = (num-1) * 39;
	            if(num==1)
	            {
	            	srcX = 355;	            	
	            }
	            else if(num == 0)
	            {
	            	srcX = 390;
	            }
            }
//            srcWidth += 30;
            
            g.drawPixmap(Assets.blackNumbers, x, newY,width,height,srcX, srcY, srcWidth,srcHeight);
            //g.drawPixmap(Assets.blackNumbers, x, y, srcX, 0, srcWidth, 32);
//            x += srcWidth;
            x+= width;
        }
    }
    
    @Override
    public void pause() {
        if(state == GameState.Running)
            state = GameState.Paused;
        
//        if(world.gameOver) {
//            Settings.addScore(world.score);
//            Settings.save(game.getFileIO());
//        }
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void dispose() {
        
    }
}