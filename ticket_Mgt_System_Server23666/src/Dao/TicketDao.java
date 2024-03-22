/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.TicketMODEL;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rugwi
 */
public class TicketDao {

    public TicketDao() {
    }
    //crud
    public void registerTicket(TicketMODEL tickObj){
        try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(tickObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void updateTicket(TicketMODEL tickObj){
        try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.update(tickObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void deleteTicket(TicketMODEL tickObj){
        try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.delete(tickObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List<TicketMODEL> retrieveAllTicket(){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List <TicketMODEL> ticketList =ss.createQuery("select tickObj from TicketMODEL tickObj").list();
            ss.close();
            return ticketList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public TicketMODEL searchById(TicketMODEL tickObj){
        try{
             // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            TicketMODEL theticket = (TicketMODEL)ss.get(TicketMODEL.class, tickObj.getTicketId());
            ss.clear();
            return theticket;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
