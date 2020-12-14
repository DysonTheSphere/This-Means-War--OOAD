package ThisMeansWar;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Player
{
	//Observable
	private PropertyChangeSupport support;
	
	//Used as a queue as it is an implementation of Interface Queue<E>
	private ArrayList<Card> hand;
	
	public Player(List<Card> hand)
	{
		this.hand = new ArrayList<Card>(hand);
		support = new PropertyChangeSupport(this);
	}
	
	//Get/Dequeue
	public Card getCard(boolean hidden)
	{
		//Out of cards, player has lost
		if (hand.isEmpty())
			return null;
		
		//Dequeue
		Card temp = hand.get(0);
		hand.remove(0);
		if (!hidden)
			support.firePropertyChange("played", null, temp);
		return temp;
	}
	
	// Set/Enqueue
	public void addCards(ArrayList<Card> won)
	{
		//Add won cards to the end of the queue
		for (Card c : won)
			hand.add(c);
	}
	
	public void addObserver(PropertyChangeListener pcl)
	{support.addPropertyChangeListener(pcl);}
}
