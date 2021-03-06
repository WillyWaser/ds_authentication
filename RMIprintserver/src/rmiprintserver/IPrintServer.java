package rmiprintserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPrintServer extends Remote {

    //Generic methods required by the assignment paper
    String start(String username) throws RemoteException;

    String stop(String username) throws RemoteException;

    String print(String filename, String printer, String username) throws RemoteException;

    String queue(String username) throws RemoteException;

    String topQueue(int job, String username) throws RemoteException;

    String restart(String username) throws RemoteException;

    String status(String username) throws RemoteException;

    String readConfig(String parameter, String username) throws RemoteException;

    String setConfig(String parameter, String value, String username) throws RemoteException;

    //Simple user logging and to register user as logged
    boolean login(String username, String password) throws RemoteException;

    //Needed for session management
    boolean logout(String username) throws RemoteException;

}
