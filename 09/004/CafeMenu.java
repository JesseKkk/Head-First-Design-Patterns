

import java.util.*;

public class CafeMenu implements Menu
{
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
	
	public CafeMenu()
	{
		addIem("Vegiie Burger and Air Fries",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 3.99);
		addIem("Soup of the day",
			"a cup of the soup of the day, with a side salad",
			false, 3.69);
	}
	
	public void addIem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	public Iterator createIterator()
	{
		return menuItems.values().iterator();
	}
}