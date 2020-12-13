package ThisMeansWar;

import java.util.ArrayList;
import java.util.List;

public class Player
{
	//Used as a queue as it is an implementation of Interface Queue<E>
	private ArrayList<Card> hand;
	
	public Player(List<Card> hand)
	{
		this.hand = new ArrayList<Card>(hand);
	}
	
	//Get/Dequeue
	public Card getCard()
	{
		//Out of cards, player has lost
		if (hand.isEmpty())
			return null;
		
		//Dequeue
		Card temp = hand.get(0);
		hand.remove(0);
		return temp;
	}
	
	// Set/Enqueue
	public void addCards(ArrayList<Card> won)
	{
		//Add won cards to the end of the queue
		for (Card c : won)
			hand.add(c);
	}
}
