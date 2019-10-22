

import java.util.*;

public class MenuItem extends MenuComponent
{
	String name;
	String description;
	boolean vegeratian;
	double price;
	
	public MenuItem(String name, String description, boolean vegeratian, double price)
	{
		this.name = name;
		this.description = description;
		this.vegeratian = vegeratian;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public boolean isVegetarian()
	{
		return vegeratian;
	}
	
	public void print()
	{
		System.out.print(" " + getName());
		if (isVegetarian())
		{
			System.out.print("(v)");
		}
		System.out.print(", " + getPrice());
		System.out.println("   --" + getDescription());
	}
	
	public Iterator createIterator()
	{
		return new NullIterator();
	}
}