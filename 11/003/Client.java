

import java.rmi.Naming;  

public class Client {  
    public static void main(String args[]) 
	{  
            try {  
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://localhost:1099/server");  
                GumballMonitor monitor = new GumballMonitor(machine);
				monitor.report();
				
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            System.exit(0);  
    } 
}