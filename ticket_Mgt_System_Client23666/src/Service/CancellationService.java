/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.CancellationMODEL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author rugwi
 */
public interface CancellationService extends Remote{
    // method signature
    String registerCancellation(CancellationMODEL canObj) throws RemoteException;
    List <CancellationMODEL> retrieveAllCancellation() throws RemoteException;
}
