
package Service;

import Model.TicketMODEL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface TicketService extends Remote{
    // method signature
    String registerTicket(TicketMODEL tickObj)throws RemoteException;
    String updateTicket(TicketMODEL tickObj)throws RemoteException;
    String deleteTicket(TicketMODEL tickObj)throws RemoteException;
    List<TicketMODEL> retrieveAllTicket()throws RemoteException;
    TicketMODEL searchById(TicketMODEL tickObj) throws RemoteException;
}
