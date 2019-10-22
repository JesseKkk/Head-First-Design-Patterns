

import java.util.*;

public class PancakeHouseMenu
{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu()
	{
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
			true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
			false, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator()
	{
		return new PancakeHouseMenuIterator(menuItems);
	}
}