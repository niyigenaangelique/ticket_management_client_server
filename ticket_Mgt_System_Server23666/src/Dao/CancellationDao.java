
package Dao;

import Model.CancellationMODEL;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CancellationDao {

    public CancellationDao() {
    }
    //crud
    public void registerCancellation(CancellationMODEL canObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(canObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List <CancellationMODEL> retrieveAllCancellation(){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List <CancellationMODEL> cancList = ss.createQuery("select canObj from CancellationMODEL canObj").list();
            ss.close();
            return cancList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
