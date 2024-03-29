

import java.util.*;

public class PancakeHouseMenuIterator implements Iterator 
{
	ArrayList<MenuItem> menuItems;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems)
	{
		this.menuItems = menuItems;
	}
	
	public Object next()
	{
		MenuItem menuItem = menuItems.get(position);
		position = position + 1;
		return menuItem;
	}
	
	public boolean hasNext()
	{
		if (position >= menuItems.size())
		{
			return false;
		}
		else
		{
			return true;
		}
	}		
	
}
