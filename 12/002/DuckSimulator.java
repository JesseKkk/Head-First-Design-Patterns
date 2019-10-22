

public class DuckSimulator
{
	public static void main(String[] args)
	{
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory)
	{
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		System.out.println("\nDuck Simulator: With Composite - Flocks");
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		
		Flock flockMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallarDuck();
		Quackable mallardTwo = duckFactory.createMallarDuck();
		Quackable mallardThree = duckFactory.createMallarDuck();
		Quackable mallardFour = duckFactory.createMallarDuck();
	
		flockMallards.add(mallardOne);
		flockMallards.add(mallardTwo);
		flockMallards.add(mallardThree);
		flockMallards.add(mallardFour);
		
		flockOfDucks.add(flockMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockMallards);	

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	void simulate(Quackable duck)
	{
		duck.quack();
	}
}

