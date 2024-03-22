
package Service.Implemantation;

import Dao.CancellationDao;
import Model.CancellationMODEL;
import Service.CancellationService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class CancellationServiceImpl extends UnicastRemoteObject implements CancellationService{
    // constructor should throw Remote Exception
    
    public CancellationServiceImpl() throws RemoteException{
        super();
    }
    private CancellationDao dao = new CancellationDao();
    @Override
    public String registerCancellation(CancellationMODEL canObj) throws RemoteException {
       try{
           dao.registerCancellation(canObj);
           return "Cancellation Saved Successful"; 
       }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Cancellation Not Saved";
    }

    @Override
    public List<CancellationMODEL> retrieveAllCancellation() throws RemoteException {
        try{
            return dao.retrieveAllCancellation();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
