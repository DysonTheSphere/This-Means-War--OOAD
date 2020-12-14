package ThisMeansWar;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Announcer implements PropertyChangeListener
{
	private boolean p1 = true;
	
	@Override
	public void propertyChange(PropertyChangeEvent event)
	{
		//System.out.println(event.getNewValue());
		if (p1)
			System.out.print("Player 1 plays ");
		if (!p1)
			System.out.print("Player 2 plays ");
		
		p1 = !p1;
		System.out.println(event.getNewValue());
	}
	
}
