package ThisMeansWar;
import java.util.ArrayList;

public class TwoPlayerFactory implements PlayerFactory
{
	
	//Singleton Pattern
	private static Deck deck;
	
	
	
	@Override
	public ArrayList<Player> createPlayers()
	{
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Card> randomDeck = new ArrayList<Card>();
		//ensures only one deck is ever created
		deck = Deck.getInstance();
		//randomize deck by calling Deck.deal() 52 times - Not the best way to do this but FINALS
		for (int i = 0; i < 52; i++)
			randomDeck.add(deck.deal());
		
		Player one = new Player(randomDeck.subList(0, 26));
		Player two = new Player(randomDeck.subList(26, 52));
		Announcer announcer = new Announcer();
		one.addObserver(announcer);
		two.addObserver(announcer);
		players.add(one);
		players.add(two);
		
		return players;
	}

}
