package ThisMeansWar;
import java.util.ArrayList;

//Implementing to a Factory Interface allows further customization of the number of players
public interface PlayerFactory
{
	ArrayList<Player> createPlayers();
}
