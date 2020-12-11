package ThisMeansWar;
import java.util.ArrayList;

public class Deck 
{
	//Singleton Pattern
	private static Deck deck = new Deck();
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	//Instantiates a Deck ordered by Rank for each suit
	private Deck()
	{
		for (Suit s : Suit.values())
			for(Rank r : Rank.values())
				cards.add(new Card(s,r));
	}
	
	public void reset()
	{
		deck = new Deck();
	}
	
	public static Deck getInstance()
	{
		return deck;
	}
	
	public Card deal()
	{
		//Generate a random index to pull a random card from the ordered deck
		int rand = (int) (Math.random() * cards.size());
		Card dealt = cards.get(rand);
		//Remove the pulled card from the deck
		cards.remove(rand);
		
		return dealt;
	}
	
}
