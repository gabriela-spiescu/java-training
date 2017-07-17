package objectsExample;

public class PlayingCardByInterface implements Card {
	private Card.Suit suit;

	public PlayingCardByInterface(Card.Suit suit) {
		this.suit = suit;
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		PlayingCardByInterface pCard = new PlayingCardByInterface(Suit.CLUBS);
		
		pCard.getSuit().value();
		pCard.getSuit().text();
		// TODO Auto-generated method stub

	}

	@Override
	public Suit getSuit() {
		return suit;
	}

}
