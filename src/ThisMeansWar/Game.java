package ThisMeansWar;
public class Game
{
	//Singleton Pattern
	private static Deck deck;

	public static void main(String[] args)
	{
		//get Singleton Deck Instance
		deck = Deck.getInstance();
		//refill deck 
		System.out.println(deck.deal());
		// Deal half the deck to each player 
		// one at a time face down
		
		// reveal one card from each player
		
		// check if one is greater than the other, winner
			//else they are equal, draw again same conditional
	}

}
