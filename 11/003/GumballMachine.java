

import java.rmi.RemoteException;  
import java.rmi.server.UnicastRemoteObject;  

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote
{
	private static final long serialVersionUID = 1L;  

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	String location;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(String location, int numberGumballs) throws RemoteException
	{
		super();
		
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		this.location = location;
		
		if (numberGumballs > 0)
		{
			state = noQuarterState;
		}
	}
	
	public void insertQuarter()
	{
		state.insertQuarter();
	}
	
	public void ejectQuarter()
	{
		state.ejectQuarter();
	}
	
	public void turnCrank()
	{
		state.turnCrank();
		state.dispense();
	}
	
	 void refill(int count)
	 {
		this.count = count;
		state = noQuarterState;
	 }
	
	void setState(State state)
	{
		this.state = state;
	}
	
	public State getState() throws RemoteException
	{
		return state;
	}
	
	void releaseBall()
	{
		System.out.println("A gumball comes rolling out the slot...\n");
		if (count != 0)
		{
			count = count - 1;
		}
	}
	
	public State getNoQuarterState()
	{
		return noQuarterState;
	}
	
	public State getHasQuarterState()
	{
		return hasQuarterState;
	}
	
	public State getSoldState()
	{
		return soldState;
	}
	
	public State getSoldOutState()
	{
		return soldOutState;
	}
	
	public State getWinnerState()
	{
		return winnerState;
	}
	
	public int getCount() throws RemoteException
	{
		return count;
	}
	
	public String getLocation() throws RemoteException
	{
		return location;
	}
	

}