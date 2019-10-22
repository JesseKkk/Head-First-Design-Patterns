

private static ChocolateBoiler uniqueInstance;

private 

public static ChocolateBoiler getInstance()
{
	if (uniqueInstance == null)
		uniqueInstance = new ChocolateBoiler();
	return uniqueInstance;
}