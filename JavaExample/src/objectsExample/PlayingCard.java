package objectsExample;

public class PlayingCard {
	private int rank;
	private String suit;
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public PlayingCard(int rank, String suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

}
