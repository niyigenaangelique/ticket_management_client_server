
package Dao;

import Model.DepartureMODEL;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DepartureDao {

    public DepartureDao() {
    }
   //crud
     public void registerDeparture(DepartureMODEL depObj){
         try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(depObj);
            // commit
            tr.commit();
            // close session
            ss.close();
         }catch(Exception ex){
            ex.printStackTrace();
        }
     }
     
      public void updateDeparture(DepartureMODEL depObj){
         try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.update(depObj);
            // commit
            tr.commit();
            // close session
            ss.close();
         }catch(Exception ex){
            ex.printStackTrace();
        }
     }
      
       public void deleteDeparture(DepartureMODEL depObj){
         try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.delete(depObj);
            // commit
            tr.commit();
            // close session
            ss.close();
         }catch(Exception ex){
            ex.printStackTrace();
        }
     }
       
       public List <DepartureMODEL> retrieveAllDeparture(){
           try{
               // create session
                Session ss = HibernateUtil.getSessionFactory().openSession();
                List <DepartureMODEL> departureList = ss.createQuery("select depObj from DepartureMODEL depObj").list();
                ss.close();
                return departureList;
           }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
       }
       
       public DepartureMODEL searchById(DepartureMODEL depObj){
           try{
                // create session
                Session ss = HibernateUtil.getSessionFactory().openSession();
                DepartureMODEL thedep = (DepartureMODEL)ss.get(DepartureMODEL.class,depObj.getDepcode());
                ss.clear();
                return thedep;
           }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
       }
}
