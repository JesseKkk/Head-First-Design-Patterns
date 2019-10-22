

import java.rmi.Naming;  

public class Server {  
    public static void main(String[] args) throws Exception {  
        try { 
		
            TestRemote testRemote = new TestRemoteImpl();  
			
            Naming.rebind("rmi://localhost:1099/server", testRemote);  
            System.out.println("RMI is running...");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}