

public class DuckTestDrive
{
	public static void main(String[] args)
	{
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey Says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkAdapter);
	}
	
	static void testDuck(Duck duck)
	{
		duck.quack();
		duck.fly();
	}
}