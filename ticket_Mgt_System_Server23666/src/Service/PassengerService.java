/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.PassengersMODEL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author rugwi
 */
public interface PassengerService extends Remote{
    // method signature
    String registerPassenger(PassengersMODEL passObj)throws RemoteException;
    String updatePassenger(PassengersMODEL passObj)throws RemoteException;
    String deletePassenger(PassengersMODEL passObj)throws RemoteException;
    List <PassengersMODEL> retrieveAllPassengers()throws RemoteException;
    PassengersMODEL searchById(PassengersMODEL passObj)throws RemoteException;
}
