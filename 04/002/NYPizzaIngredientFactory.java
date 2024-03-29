

public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
	public Dough createDough()
	{
		return new ThinCrustDough();
	}
	
	public Sauce createSauce()
	{
		return new MarinaraSauce();
	}
	
	public Cheese createCheese()
	{
		return new ReggianoChese();
	}
	
	public Veggies[] createVeggies()
	{
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}
	
	public Pepperoni createPepperoni()
	{
		return new SlicePepperoni;
	}
	
	public Clams createClam()
	{
		return new FreshClams();
	}
}