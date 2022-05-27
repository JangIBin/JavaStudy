package sty;

public class Card {

	public final int suitNumber;
	public final int rankNumber;
	
	public Card(int suitNumber, int rankNumber) {
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
	}

	public String getSuit() {
		switch (suitNumber) {
		case 1:
			return "클럽";
		case 2:
			return "다이아몬드";
		case 3:
			return "하트";
		case 4:	
			return "스페이드";
		default:
			return "";
		}
	}
	
	public String getBank() {
		switch (rankNumber) {
		case 1:
			return "Ace";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return String.valueOf(rankNumber);
		}
	}
	
	public String toString() {
		return getSuit() + " "+ getBank();
	}
	
}
