package ThisMeansWar;

import java.util.ArrayList;

public class Game
{
	//Singleton Pattern
	private static Deck deck;

	public static void main(String[] args)
	{
		//Create Player Factory
		PlayerListFactory playerFactory = new PlayerListFactory();
		//Create Two Players
		ArrayList<Player> players = playerFactory.getPlayerList(2);
		Player curr = players.get(0);
		for (int s = 0; s < 27; s++)
			System.out.println(curr.getCard());
		// reveal one card from each player
		
		// check if one is greater than the other, winner
			//else they are equal, draw again same conditional
	}

}
