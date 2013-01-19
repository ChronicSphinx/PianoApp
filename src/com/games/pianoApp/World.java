package com.games.pianoApp;

import java.util.HashMap;
import java.util.Map;


public class World {

	public Key keys[];
	public Map<String, Integer> keysDown;
	public Boolean keysDownArray[];
    float tickTime = 0;

    public World() 
    {
    	 int topOfKeyX = 0;  //x on the screen
         int topOfKeyY = 200; //y on the screen
         int whiteKeyWidth = 100;
         int whiteKeyHeight = 400;
         int whiteSrcX = 0;
         int whiteSrcY = 0;
         int whiteSrcWidth = 100;
         int whiteSrcHeight = 400;
         
         int blackKeyWidth = 50;
         int blackKeyHeight = 270;
         int blackSrcX = 0;
         int blackSrcY = 0;
         int blackSrcWidth = 50;
         int blackSrcHeight = 300;
         keysDownArray = new Boolean[17];
         for(int y = 0; y < keysDownArray.length; y++)
         {
        	 keysDownArray[y] = false;
         }
    	keys = new Key[17];
    	keys[0] = new Key("white", Assets.white0,Assets.key,Assets.keyDown,"right", topOfKeyX, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[1] = new Key("white", Assets.white1,Assets.key,Assets.keyDown,"both", topOfKeyX + 102, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[2] = new Key("white", Assets.white2,Assets.key,Assets.keyDown,"left", topOfKeyX + 102 * 2, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[3] = new Key("white", Assets.white3,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 3, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[4] = new Key("white", Assets.white4,Assets.key,Assets.keyDown,"both", topOfKeyX + 102 * 4, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[5] = new Key("white", Assets.white5,Assets.key,Assets.keyDown,"both", topOfKeyX + 102 * 5, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[6] = new Key("white", Assets.white6,Assets.key,Assets.keyDown,"left", topOfKeyX + 102 * 6, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[7] = new Key("white", Assets.white7,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 7, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[8] = new Key("white", Assets.white8,Assets.key,Assets.keyDown,"both", topOfKeyX + 102 * 8, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	keys[9] = new Key("white", Assets.white9,Assets.key,Assets.keyDown,"left", topOfKeyX + 102 * 9, topOfKeyY,whiteKeyWidth, whiteKeyHeight,whiteSrcX, whiteSrcY, whiteSrcWidth, whiteSrcHeight);
    	
    	keys[10] = new Key("black", Assets.black0,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 76, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	keys[11] = new Key("black", Assets.black1,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 102 + 76, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	keys[12] = new Key("black", Assets.black2,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 76 + 102 * 3, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	keys[13] = new Key("black", Assets.black3,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 76 + 102 * 4, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	keys[14] = new Key("black", Assets.black4,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 76 + 102 * 5, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	keys[15] = new Key("black", Assets.black5,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 76 + 102 * 7, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	keys[16] = new Key("black", Assets.black6,Assets.blackKeyUp,Assets.blackKeyDown,"", topOfKeyX + 76 + 102 * 8, topOfKeyY,blackKeyWidth, blackKeyHeight,blackSrcX, blackSrcY, blackSrcWidth, blackSrcHeight);
    	  
    	keysDown = new HashMap<String, Integer>();
    	  
    }


    public void update(float deltaTime) 
    {
    	   
    }

}
