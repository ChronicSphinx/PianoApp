package com.games.pianoApp;


public class World {
//    public Player player;
//    public Player dealer;
//    public Deck deck;
//
//    public boolean gameOver = false;
//    public boolean playerTurn = true;
//    public int score = 0;
//    boolean stand = false;
//    String win = "win";

	public Key keys[];
    float tickTime = 0;

    public World() 
    {
    	 int topOfKeyX = 0;  //x on the screen
         int topOfKeyY = 200; //y on the screen
         int whiteKeyWidth = 100;
         int whiteKeyHeight = 400;
         int srcX = 0;
         int srcY = 0;
         int srcWidth = 100;
         int srcHeight = 400;
    	
    	keys = new Key[16];
    	keys[0] = new Key("white", Assets.white0,Assets.key,Assets.keyDown,"right", topOfKeyX, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[1] = new Key("white", Assets.white1,Assets.key,Assets.keyDown,"right", topOfKeyX + 102, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[2] = new Key("white", Assets.white2,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 2, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[3] = new Key("white", Assets.white3,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 3, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[4] = new Key("white", Assets.white4,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 4, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[5] = new Key("white", Assets.white5,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 5, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[6] = new Key("white", Assets.white6,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 6, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[7] = new Key("white", Assets.white7,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 7, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[8] = new Key("white", Assets.white8,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 8, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	keys[9] = new Key("white", Assets.white9,Assets.key,Assets.keyDown,"right", topOfKeyX + 102 * 9, topOfKeyY,whiteKeyWidth, whiteKeyHeight,srcX, srcY, srcWidth, srcHeight);
    	  
//    	keys[x] = new Key("black");
    	  
    }


    public void update(float deltaTime) 
    {
    	
    	
//    	  int dealt = deck.dealt;
//    	  if (gameOver)
//        {
//    	  	if(dealt > 30)
//          {
//          	deck.shuffle();
//          }
//          return;            
//        }
//        
//        player.countCards();
//        dealer.countCards();
//        if(player.count > 21)
//        {
//        	lose();
//        	return;
//        }
//        else if(player.altcount == 21 && player.cards.size() == 2)
//        {
//        	dealer.cards.get(0).show = true;
//        	if(dealer.altcount != 21)
//        	{
//        		win();
//        	}
//        	else
//        	{
//        		win="push";
//        	}
//        	
//        	gameOver = true;
//        	return;
//        }
//        else if(dealer.altcount == 21 && dealer.cards.size() == 2)
//        {
//        	lose();
//        	dealer.cards.get(0).show = true;
//        	return;
//        }
//        if(dealer.count > 21)
//        {
//        	win();
//        	return;
//        }
//        if(stand)
//        {
//        	if(dealer.count < 17)
//        	{
//        		deck.deal(dealer, true);
//        	}
//        	else if(dealer.altcount != 0 && dealer.altcount <= 21)
//        	{
//        		if(player.altcount != 0 && player.altcount <= 21)
//        		{
//        			if(dealer.altcount < player.altcount)
//        			{
//        				win();
//        				return;
//        			}
//        			else if(dealer.altcount > player.altcount)
//        			{
//        				lose();
//        				return;
//        			}
//        			else
//        			{
//        				win="push";
//        				gameOver = true;
//        				return;
//        			}
//        		}
//        		else if(dealer.altcount < player.count)
//          	{
//        			win();
//            	return;
//          	}
//          	else if(dealer.altcount > player.count)
//          	{
//          		lose();
//            	return;
//          	}
//          	else
//          	{
//          		win="push";
//          		gameOver = true;
//            	return;
//          	}
//        	}
//        	else if(player.altcount != 0 && player.altcount <= 21)
//        	{
//        		if(dealer.count < player.altcount)
//          	{
//        			win();
//            	return;
//          	}
//          	else if(dealer.count > player.altcount)
//          	{
//          		lose();
//            	return;
//          	}
//          	else
//          	{
//          		win="push";
//          		gameOver = true;
//            	return;
//          	}
//        	}
//        	else if(dealer.count < player.count)
//        	{
//        		win();
//          	return;
//        	}
//        	else if(dealer.count > player.count)
//        	{
//        		lose();
//          	return;
//        	}
//        	else
//        	{
//        		win="push";
//        		gameOver = true;
//          	return;
//        	}
//        }     
    }
    
//    private void win()
//    {
//    	System.out.println("before " + score);
//    	win = "win";
//    	gameOver = true;
//    	score +=1;
//    	System.out.println("after " + score);
//    }
//    
//    private void lose()
//    {
//    	System.out.println("before " + score);
//    	win = "lost";
//    	gameOver = true;
//    	score -=1;
//    	System.out.println("after " + score);
//    }
}
