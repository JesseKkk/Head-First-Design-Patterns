

import java.rmi.RemoteException;  
import java.rmi.server.UnicastRemoteObject;  

public class TestRemoteImpl extends UnicastRemoteObject implements TestRemote {  
    private static final long serialVersionUID = 1L;  
    public TestRemoteImpl() throws RemoteException {  
        super();  
    }  
  
    public String add(String a, String b) throws RemoteException {  
        return a + b;  
    }  
  
    public String add() throws RemoteException {  
        return "Hello Word";  
    }  
}