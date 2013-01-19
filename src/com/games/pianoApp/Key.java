package com.games.pianoApp;

import android.util.Log;

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
    boolean playSound = false;
	
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
		int eventY = event.y;
		int eventX = event.x;
		int blackHalfWidth = 22;
		if(event.y >= 200)
		{
			if(eventX >= this.x && eventX <= this.x + this.width)
			{
				if(!"".equals(this.blackKeys))
				{
					if(eventY > (200 + 270))
					{
						if(!playSound && !this.keyDown)
						{
							this.playSound = true;
						}
						else
						{
							this.playSound = false;
						}
						this.keyDown = true;
						Log.d("Key Pressed", "white key");
						return true;
					}
				}
				if("both".equals(this.blackKeys))
				{
					if(eventX < (this.x + this.width - blackHalfWidth) && eventX > (this.x + blackHalfWidth))
					{
						if(!playSound && !this.keyDown)
						{
							this.playSound = true;
						}
						else
						{
							this.playSound = false;
						}
						this.keyDown = true;
						Log.d("Key Pressed both", "white key");
						return true;
					}
				}
				else if("right".equals(this.blackKeys))
				{
					if(eventX < (this.x + this.width - blackHalfWidth))
					{
						if(!playSound && !this.keyDown)
						{
							this.playSound = true;
						}
						else
						{
							this.playSound = false;
						}
						this.keyDown = true;
						Log.d("Key Pressed right", "white key");
						return true;
					}
				}
				else if("left".equals(this.blackKeys))
				{
					if(eventX > (this.x + blackHalfWidth))
					{
						if(!playSound && !this.keyDown)
						{
							this.playSound = true;
						}
						else
						{
							this.playSound = false;
						}
						this.keyDown = true;
						Log.d("Key Pressed left", "white key");
						return true;
					}
				}
				else
				{
					if(!playSound && !this.keyDown)
					{
						this.playSound = true;
					}
					else
					{
						this.playSound = false;
					}
					this.keyDown = true;						
					return true;
				}
			}
		}
		this.keyDown = false;
		this.playSound = false;
		return false;
	}
	
	public void resetKey()
	{
		this.keyDown = false;
		this.playSound = false;
	}
}
