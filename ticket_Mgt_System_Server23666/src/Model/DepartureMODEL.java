
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class DepartureMODEL implements Serializable{
    @Id
    @Column(name="dep_id")
    private int Depcode;
    @Column(name="source")
    private String Source;
    @Column(name="destination")
    private String Destination;
    @Column(name="take_off_date")
    private String TakeoffDate;
    @Column(name="seats")
    private int Seats;
    
    @OneToMany(mappedBy = "depcode")
    private List<TicketMODEL> tickets = new ArrayList<>();

    public DepartureMODEL() {
    }

    public DepartureMODEL(int Depcode) {
        this.Depcode = Depcode;
    }

    public DepartureMODEL(int Depcode, String Source, String Destination, String TakeoffDate, int Seats) {
        this.Depcode = Depcode;
        this.Source = Source;
        this.Destination = Destination;
        this.TakeoffDate = TakeoffDate;
        this.Seats = Seats;
    }

    public int getDepcode() {
        return Depcode;
    }

    public void setDepcode(int Depcode) {
        this.Depcode = Depcode;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getTakeoffDate() {
        return TakeoffDate;
    }

    public void setTakeoffDate(String TakeoffDate) {
        this.TakeoffDate = TakeoffDate;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }

    public List<TicketMODEL> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketMODEL> tickets) {
        this.tickets = tickets;
    }
    

}
