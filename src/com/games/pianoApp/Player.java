package com.games.pianoApp;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public List<Card> cards = new ArrayList<Card>();
	int x,y;
	int count = 0, altcount = 0;
	
	public void countCards()
	{
		count = 0;
		altcount = 0;
		for(int x=0; x < cards.size(); x++)
		{
			Card card = cards.get(x);			
			if(card.number == 1)
			{
				altcount += 11;
				count += card.number;				
			}
			else if(card.number > 10)
			{
				altcount += 10;
				count += 10;
			}
			else
			{
				altcount += card.number;
				count += card.number;
			}
		}
	}
}
