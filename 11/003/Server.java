

import java.rmi.Naming;  

public class Server {  
    public static void main(String[] args) throws Exception
	{  
        GumballMachineRemote gumballMachine = null;
		int count;
		if (args.length < 2)
		{
			System.out.println("GumballMachine <name> <invenotory>");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);
			
			gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("rmi://localhost:1099/server", gumballMachine);  
            System.out.println("RMI is running...");  
		} catch (Exception e) {  
            e.printStackTrace();  
        } 
    }  
}