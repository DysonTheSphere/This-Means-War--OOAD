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
	
	public Integer getRank()
	{
		//enum.ordinal() returns index of suit in Suit.java, starts at 0 so I add 1
			// Integer wrapper cast so that compareTo() functions
		return (Integer) r.ordinal() + 1;
	}

	@Override
	public String toString()
	{
		return r + " of " + s;
	}
}
