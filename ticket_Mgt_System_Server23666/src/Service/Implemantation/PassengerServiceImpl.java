/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.PassengerDao;
import Model.PassengersMODEL;
import Service.PassengerService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author rugwi
 */
public class PassengerServiceImpl extends UnicastRemoteObject implements PassengerService{
     // constructor should throw Remote Exception
     
    public PassengerServiceImpl() throws RemoteException{
        super();
    }
    private PassengerDao dao = new PassengerDao();

    @Override
    public String registerPassenger(PassengersMODEL passObj) throws RemoteException {
        try{
            dao.registerPassenger(passObj);
            return "Passenger saved Successfuly";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Passenger Not Saved";
    }

    @Override
    public String updatePassenger(PassengersMODEL passObj) throws RemoteException {
        try{
            dao.updatePassenger(passObj);
            return "Passenger Updated Successfuly";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Passenger Not Updated";
    }

    @Override
    public String deletePassenger(PassengersMODEL passObj) throws RemoteException {
        try{
            dao.deletePassenger(passObj);
            return "Passenger Deleted Successfuly";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Passenger Not Deleted";
    }

    @Override
    public List<PassengersMODEL> retrieveAllPassengers() throws RemoteException {
        try{
            return dao.retrieveAllPassengers();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PassengersMODEL searchById(PassengersMODEL passObj) throws RemoteException {
        try{
            return dao.searchById(passObj);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
