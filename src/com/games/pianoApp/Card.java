package com.games.pianoApp;

public class Card {
	public static final int SPADE = 0;
	public static final int HEART = 1;
	public static final int DIAMOND = 2;
	public static final int CLUB = 3;
  public int number;
  public int suit;
  public boolean show;
  public int x, y;
  
  public Card()
  {
  	
  }
  
  public Card(int suit, int number, boolean show)
  {
  	this.suit = suit;
  	this.number = number;
  	this.show = show;
  }
}
