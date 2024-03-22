
package Service;

import Model.SignUpMODEL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface SignUpService extends Remote{
    // method signature
    String registerSignUp (SignUpMODEL signObj) throws RemoteException;
    String updateSignUp (SignUpMODEL signObj) throws RemoteException;
    String deleteSignUp (SignUpMODEL signObj) throws RemoteException;
    List<SignUpMODEL> retrieveAllSignUp() throws RemoteException;
    SignUpMODEL searchById(SignUpMODEL signObj) throws RemoteException;
    //List<SignUpMODEL> Login(String first_name, String password)throws RemoteException;
}
