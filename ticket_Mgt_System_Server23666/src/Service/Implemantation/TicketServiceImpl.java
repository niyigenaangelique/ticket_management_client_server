
package Service.Implemantation;

import Dao.TicketDao;
import Model.TicketMODEL;
import Service.TicketService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class TicketServiceImpl extends UnicastRemoteObject implements TicketService{
    // constructor should throw Remote Exception
    
    public TicketServiceImpl() throws RemoteException{
        super();
    }
    private TicketDao dao = new TicketDao();
    @Override
    public String registerTicket(TicketMODEL tickObj) throws RemoteException {
        try{
            dao.registerTicket(tickObj);
            return "Ticket Saved Successful";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Ticket Not Saved";
    }

    @Override
    public String updateTicket(TicketMODEL tickObj) throws RemoteException {
        try{
            dao.updateTicket(tickObj);
            return "Ticket Updated Successful";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Ticket Not Updated";
    }

    @Override
    public String deleteTicket(TicketMODEL tickObj) throws RemoteException {
        try{
            dao.deleteTicket(tickObj);
            return "Ticket Deleted Successful";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Ticket Not Deleted";
    }

    @Override
    public List<TicketMODEL> retrieveAllTicket() throws RemoteException {
        try{
            return dao.retrieveAllTicket();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public TicketMODEL searchById(TicketMODEL tickObj) throws RemoteException {
        try{
            return dao.searchById(tickObj);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   
}
