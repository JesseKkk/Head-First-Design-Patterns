

public class MenuTestDrive
{
	public static void main(String[] args)
	{
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent desserMenu = new Menu("DESSER MENU", "Dessert of course");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		pancakeHouseMenu.add(new MenuItem(
			"Pasta", "Spaghetti with Marinara Sauce", true, 3.89));
		pancakeHouseMenu.add(desserMenu);
		
		desserMenu.add(new MenuItem(
			"Apple Pie", "Apple pie with a flakey crust", true, 1.59));
			
			
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}