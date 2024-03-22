
package Service;


import Model.DepartureMODEL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DepartureService extends Remote{
    // method signature
    String registerDeparture(DepartureMODEL depObj) throws RemoteException;
    String updateDeparture(DepartureMODEL depObj) throws RemoteException;
    String deleteDeparture(DepartureMODEL depObj) throws RemoteException;
    List <DepartureMODEL> retrieveAllDeparture() throws RemoteException;
    DepartureMODEL searchById(DepartureMODEL depObj) throws RemoteException;
}
