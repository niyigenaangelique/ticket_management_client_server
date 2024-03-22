/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.SignUpDao;
import Model.SignUpMODEL;
import Service.SignUpService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author rugwi
 */
public class SignUpServiceImpl extends UnicastRemoteObject implements SignUpService{
    // constructor should throw Remote Exception
    
    public SignUpServiceImpl() throws RemoteException{
        super();
    }
    private SignUpDao dao = new SignUpDao();
    @Override
    public String registerSignUp(SignUpMODEL signObj) throws RemoteException {
        try{
            dao.registerSignUp(signObj);
            return "User Saved Successful";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "User Not Saved";
    }

    @Override
    public String updateSignUp(SignUpMODEL signObj) throws RemoteException {
       try{
           dao.updateSignUp(signObj);
           return "User Updated Successful";
       }catch(Exception ex){
            ex.printStackTrace();
        }
        return "User Not Updated";
    }

    @Override
    public String deleteSignUp(SignUpMODEL signObj) throws RemoteException {
       try{
           dao.deleteSignUp(signObj);
           return "User Deleted Successful";
       }catch(Exception ex){
            ex.printStackTrace();
        }
        return "User Not Deleted";
    }

    @Override
    public List<SignUpMODEL> retrieveAllSignUp() throws RemoteException {
        try{
            return dao.retrieveAllSignUp();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public SignUpMODEL searchById(SignUpMODEL signObj) throws RemoteException {
       try{
           return dao.searchById(signObj);
       }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
