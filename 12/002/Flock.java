

import java.util.*;

public class Flock implements Quackable
{
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker)
	{
		quackers.add(quacker);
	}
	
	public void quack()
	{
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext())
		{
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();
		}
	}
}