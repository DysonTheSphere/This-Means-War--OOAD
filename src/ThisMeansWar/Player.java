package ThisMeansWar;

import java.util.ArrayList;

public class Player
{
	//Used as a queue as it is an implementation of Interface Queue<E>
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public Player(ArrayList<Card> hand)
	{
		this.hand = hand;
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
