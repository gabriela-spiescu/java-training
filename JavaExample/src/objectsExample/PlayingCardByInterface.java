package objectsExample;

public class PlayingCardByInterface implements Card {
	private Card.Suit suit;
	private Card.Rank rank;

	public PlayingCardByInterface(Card.Suit suit, Card.Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public int hashCode() {
	    return ((suit.value()-1)*4)+rank.value();
	}


	@Override
	public int compareTo(Card o) {
		return this.hashCode() - o.hashCode();
	}

	@Override
	public Suit getSuit() {
		return suit;
	}

	public String toString() {
		return (this.suit.value() + " "+ this.suit.text());
	}

	@Override
	public Rank getRank() {
		return rank;
	}
	
	public static void main(String[] args) {
		PlayingCardByInterface pCard = new PlayingCardByInterface(Suit.CLUBS, Rank.DEUCE);
		PlayingCardByInterface mCard = new PlayingCardByInterface(Suit.DIAMONDS, Rank.DEUCE);
		System.out.println("Compare" + pCard.compareTo(mCard));
		System.out.println("Test Playing Card suit: " + pCard.toString());

	}
}
