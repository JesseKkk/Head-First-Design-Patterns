

public class DinerMenu
{
	static final int MAX_ITEMS = 2;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu()
	{
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat",
		true, 2.99);
		addItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS)
		{
			System.err.println("Sorry, menu is full! Can't add item to menu");
		}
		else
		{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator createIterator()
	{
		return new DinerMenuIterator(menuItems);
	}
}