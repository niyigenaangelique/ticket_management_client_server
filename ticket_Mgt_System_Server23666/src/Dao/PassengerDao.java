
package Dao;

import Model.PassengersMODEL;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class PassengerDao {

    public PassengerDao() {
    }
    //crud
    public void registerPassenger(PassengersMODEL passObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(passObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void updatePassenger(PassengersMODEL passObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.update(passObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void deletePassenger(PassengersMODEL passObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.delete(passObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List <PassengersMODEL> retrieveAllPassengers(){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List <PassengersMODEL> passengerList = ss.createQuery("select passObj from PassengersMODEL passObj").list();
            ss.close();
            return passengerList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public PassengersMODEL searchById(PassengersMODEL passObj){
        try{
             // create session
             Session ss = HibernateUtil.getSessionFactory().openSession();
             PassengersMODEL thepass = (PassengersMODEL)ss.get(PassengersMODEL.class,passObj.getPDID());
             ss.clear();
             return thepass;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
