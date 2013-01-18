package com.games.pianoApp;

import java.util.Random;

public class Deck {
	static final int TOTAL_NUMBERS = 14;
	static final int SUITS = 4;
	public boolean[][] cards = new boolean[SUITS][TOTAL_NUMBERS];
	int dealt = 0;
	
	public Deck()
	{
		shuffle();
	}
	
	public void shuffle()
	{
		for(int x =0; x < 14; x++)
		{
			for(int y=0; y<4;y++)
			{
				cards[y][x]= true;
			}
		}
		dealt = 0;
	}
	
	public void deal(Player player, boolean show)
	{
		Random rand = new Random();
		boolean found = false;
		while(!found)
		{
			int suit = rand.nextInt(4);
			int num = rand.nextInt(13) + 1;
			System.out.println("Deal number = "+num+" and suit = " + suit);
			if(cards[suit][num])
			{
				dealt++;
				Card card = new Card(suit,num, show);
				player.cards.add(card);
				cards[suit][num] = false;
				found = true;
			}
		}
	}
}
