package sty;

import java.util.*;

public class Deck {
	
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void print() {
		for(Card card : cards) {
			System.out.println(card.toString());
		}
	}
}
