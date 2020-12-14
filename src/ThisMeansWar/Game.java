package ThisMeansWar;

import java.util.ArrayList;

public class Game
{
	//Create Player Factory
	static PlayerListFactory playerFactory = new PlayerListFactory();
	//Create Two Players
	static ArrayList<Player> players = playerFactory.getPlayerList(2);
	//Create stack of played cards on the table
	static ArrayList<Card> round = new ArrayList<Card>();

	public static void main(String[] args)
	{	
		
		int compare = war();
		
		switch(compare)
		{
			case (0):
				//Tie, both players draw 3 cards, then it's war() again!
				for (int i = 0; i < 3; i++)
				{
					Card pOne = players.get(0).getCard(true);
					Card pTwo = players.get(1).getCard(true);
					
					if (pOne == null)
					{
						gameEnd(1);
						break;
					}
					round.add(pOne);
					
					if (pTwo == null)
					{
						gameEnd(0);
						break;
					}
					round.add(pTwo);
					
				}
				//6 cards lie face down on the table if no one has busted out
				//loop sends players back to call war() with switch case logic
				break;
			case (1):
				//Player 1 wins
				players.get(0).addCards(round);
				round.clear();
				break;
			case (-1):
				//Player 2 wins
				players.get(1).addCards(round);
				round.clear();
				break;
		}
		
	}
	
	// This function is called when the game ends
	private static void gameEnd(int player)
	{
		System.out.println("Game ends");
	}
	// This function is called when two face-up cards are to be compared
	private static int war()
	{
		// reveal one card from each player
		round.add(players.get(0).getCard(false));
		round.add(players.get(1).getCard(false));
		int end = round.size() - 1;
		System.out.println("Player 1 plays " + round.get(0) + "\nPlayer 2 plays " + round.get(1));
		//Return comparison
		return (round.get(end - 1).getRank().compareTo(round.get(end).getRank()));
			
	}
	

}
