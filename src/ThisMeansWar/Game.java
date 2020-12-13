package ThisMeansWar;

import java.util.ArrayList;

public class Game
{

	public static void main(String[] args)
	{
		//Create Player Factory
		PlayerListFactory playerFactory = new PlayerListFactory();
		//Create Two Players
		ArrayList<Player> players = playerFactory.getPlayerList(2);
		//Player curr = players.get(0);
		ArrayList<Card> round = new ArrayList<Card>();
		
		// reveal one card from each player
		round.add(players.get(0).getCard());
		round.add(players.get(1).getCard());
		System.out.println("Player 1 plays " + round.get(0) + "\nPlayer 2 plays " + round.get(1));
		
		int compare = (round.get(0).getRank().compareTo(round.get(1).getRank()));
		
		switch(compare)
		{
			case (0):
				//Draw again
				break;
			case (1):
				//Player 1 wins
				System.out.println("Player 1 wins");
				players.get(0).addCards(round);
				round.clear();
				break;
			case (-1):
				//Player 2 wins
				System.out.println("Player 2 wins");
				players.get(1).addCards(round);
				round.clear();
				break;
		}
		
	}

}
