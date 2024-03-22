
package Dao;

import Model.SignUpMODEL;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SignUpDao {

    public SignUpDao() {
    }
    //crud
     public void registerSignUp (SignUpMODEL signObj){
         try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(signObj);
            // commit
            tr.commit();
            // close session
            ss.close();
         }catch(Exception ex){
            ex.printStackTrace();
        }
     }
     
      public void updateSignUp (SignUpMODEL signObj){
         try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.update(signObj);
            // commit
            tr.commit();
            // close session
            ss.close();
         }catch(Exception ex){
            ex.printStackTrace();
        }
     }
      
       public void deleteSignUp (SignUpMODEL signObj){
         try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.delete(signObj);
            // commit
            tr.commit();
            // close session
            ss.close();
         }catch(Exception ex){
            ex.printStackTrace();
        }
     }
       public List<SignUpMODEL> retrieveAllSignUp(){
           try{
               // create session
                Session ss = HibernateUtil.getSessionFactory().openSession();
                List<SignUpMODEL> signupList = ss.createQuery("select signObj from SignUpMODEL signObj").list();
                ss.close();
                return signupList;
           }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
       }
       
       public SignUpMODEL searchById(SignUpMODEL signObj){
           try{
                // create session
                Session ss = HibernateUtil.getSessionFactory().openSession();
                SignUpMODEL sign = (SignUpMODEL)ss.get(SignUpMODEL.class, signObj.getUsId());
                ss.clear();
                return sign;
           }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
       }
       
       
}
