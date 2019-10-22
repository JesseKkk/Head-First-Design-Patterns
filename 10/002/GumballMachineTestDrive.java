

public class GumballMachineTestDrive
{
	public static void main(String[] args)
	{
		GumballMachine gumballMachine = new GumballMachine(5);
		
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();	
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();		
		
	}
}