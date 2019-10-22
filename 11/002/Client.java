

import java.rmi.Naming;  

public class Client {  
    public static void main(String args[]) {  
            try {  
                TestRemote s = (TestRemote) Naming.lookup("rmi://localhost:1099/server");  
                System.out.println(s.add());  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            System.exit(0);  
    } 
}  
