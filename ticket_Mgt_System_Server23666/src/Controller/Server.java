
package Controller;


import Service.Implemantation.CancellationServiceImpl;
import Service.Implemantation.DepartureServiceImpl;
import Service.Implemantation.PassengerServiceImpl;
import Service.Implemantation.SignUpServiceImpl;
import Service.Implemantation.TicketServiceImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String[] args){
        try{
             // enable RMI class loader
             System.setProperty("java.rmi.server.useCodebaseOnly", "false");
             // register the property
             System.setProperty("java.rmi.server.hostname", "127.0.0.1");
             Registry registry = LocateRegistry.createRegistry(6000);
             registry.rebind("signup", new SignUpServiceImpl());
             registry.rebind("departure", new DepartureServiceImpl());
             registry.rebind("passenger", new PassengerServiceImpl());
             registry.rebind("ticket", new TicketServiceImpl());
             registry.rebind("cancellation", new CancellationServiceImpl());
             System.out.println("Server is running on Port 6000");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
