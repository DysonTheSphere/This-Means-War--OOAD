package ThisMeansWar;

import java.util.ArrayList;

public class PlayerListFactory
{
	private ArrayList<Player> playerList;
	private PlayerFactory factory = null;
	
	public ArrayList<Player> getPlayerList(int numPlayers)
	{
		if (numPlayers == 2)
			{
				factory = new TwoPlayerFactory();
				playerList = factory.createPlayers();
			}
		return playerList;
	}
}
