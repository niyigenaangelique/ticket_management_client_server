
package Service.Implemantation;

import Dao.DepartureDao;
import Model.DepartureMODEL;
import Service.DepartureService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class DepartureServiceImpl extends UnicastRemoteObject implements DepartureService{
    // constructor should throw Remote Exception
    
    public DepartureServiceImpl() throws RemoteException{
        super();
    }
    private DepartureDao dao = new DepartureDao();
    @Override
    public String registerDeparture(DepartureMODEL depObj) throws RemoteException {
        try{
            dao.registerDeparture(depObj);
            return "Departure Saved Successful"; 
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Departure Not Saved";
    }

    @Override
    public String updateDeparture(DepartureMODEL depObj) throws RemoteException {
        try{
            dao.updateDeparture(depObj);
            return "Departure Updated Successful";
        }catch(Exception ex){
            ex.printStackTrace();
        }
         return "Departure Not Updated";
    }

    @Override
    public String deleteDeparture(DepartureMODEL depObj) throws RemoteException {
       try{
           dao.deleteDeparture(depObj);
           return "Departure Deleted Successful"; 
       }catch(Exception ex){
            ex.printStackTrace();
        }
       return "Departure Not Deleted";
    }

    @Override
    public List<DepartureMODEL> retrieveAllDeparture() throws RemoteException {
       try{
           return dao.retrieveAllDeparture();
       }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public DepartureMODEL searchById(DepartureMODEL depObj) throws RemoteException {
       try{
           return dao.searchById(depObj);
       }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
