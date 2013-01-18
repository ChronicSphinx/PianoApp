package com.games.pianoApp;

import com.games.framework.Input.TouchEvent;
import com.games.framework.Pixmap;
import com.games.framework.Sound;

public class Key 
{

	boolean selected = false;
	String type = null;
	int x, y, width, height;
	boolean keyDown = false;
	Sound sound = null;
	Pixmap keyUpGraph = null;
	Pixmap keyDownGraph = null;
	String blackKeys = null;
	int srcX;
    int srcY;
    int srcWidth;
    int srcHeight;
	
	public Key()
	{
		
	}
	
	public Key(String type, Sound sound, Pixmap keyUp, Pixmap keyDown, String blackKeys, int x, int y, int width, int height, int srcX, int srcY, int srcWidth, int srcHeight)
	{
		this.type = type;
		this.sound = sound;
		this.keyUpGraph = keyUp;
		this.keyDownGraph = keyDown;
		this.blackKeys = blackKeys;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.srcX = srcX;
		this.srcY = srcY;
		this.srcWidth = srcWidth;
		this.srcHeight = srcHeight;
	}
	
	public boolean keyPressed(TouchEvent event)
	{
		if(event.x >= this.x && event.x <= this.x + this.width)
		{
			return true;
		}
		return false;
	}
}
