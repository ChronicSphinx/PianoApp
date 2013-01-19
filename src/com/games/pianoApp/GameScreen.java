package com.games.pianoApp;

import java.util.List;
import java.util.Map;

import android.graphics.Color;
import android.util.Log;

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
    	Map<String, Integer> keysDown = this.world.keysDown;
    	Boolean keysDownArray[] = this.world.keysDownArray;
    	Key keys[] = world.keys;
        int len = touchEvents.size();
        for(int i = 0; i < len; i++) 
        {
            TouchEvent event = touchEvents.get(i);
            if(event.type == TouchEvent.TOUCH_UP) 
            {   
                String pointer = String.valueOf(event.pointer); 
                keysDown.remove(pointer);                
            }
            if(event.type == TouchEvent.TOUCH_DOWN)            
            {
            	//check what keys are pressed there are 10 keys across            	
            	
                for(int x = 0; x < keys.length; x++)
                {
                	if(keys[x].keyPressed(event))
                	{
                		String pointer = String.valueOf(event.pointer);
                		keysDown.put(pointer, x);
                		keysDownArray[x] = true;
                		break;
                	}
                }
            }
            
        }
        Log.d("KeysDown Length", String.valueOf(keysDown.size()));
        for(int y = 0; y < keysDownArray.length; y++)
        {
        	if(!keysDown.containsValue(y))
        	{
        		keysDownArray[y] = false;
        		keys[y].resetKey();
        	}
        }
        
        
        world.update(deltaTime);

    }
    
    private void updatePaused(List<TouchEvent> touchEvents) {

    }
    
    private void updateGameOver(List<TouchEvent> touchEvents) {

    }
    
    private void resetGame()
    {
    }
    

    @Override
    public void present(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawPixmap(Assets.background, 0, 0);
        Key keys[] = world.keys;

        for(int x = 0; x < keys.length; x++)
        {  
        	if(keys[x].keyDown)
        	{
        		g.drawPixmap(keys[x].keyDownGraph, keys[x].x, keys[x].y, keys[x].width, keys[x].height, keys[x].srcX, keys[x].srcY, keys[x].srcWidth, keys[x].srcHeight);
        		if(keys[x].playSound)
        		{
        			keys[x].sound.play(1);
        			keys[x].playSound = false;
        		}
        	}
        	else
        	{
        		g.drawPixmap(keys[x].keyUpGraph, keys[x].x, keys[x].y, keys[x].width, keys[x].height, keys[x].srcX, keys[x].srcY, keys[x].srcWidth, keys[x].srcHeight);
        	}
      	
        }              
    }
    
    
  
    
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