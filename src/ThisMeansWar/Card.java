package ThisMeansWar;

public class Card
{
	Suit s;
	Rank r;

	public Card(Suit s, Rank r)
	{
		this.s = s;
		this.r = r;
	}

	@Override
	public String toString()
	{
		return r + " of " + s;
	}
}
