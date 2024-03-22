
package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class CancellationMODEL implements Serializable{
     @Id
     @Column(name="Cancellation_Id")
     private String CancId;
     @Column(name="ticket_Id")
     private int TicketId;
     @Column(name="dep_Id")
     private int Depcode;
     @Column(name="canc_date")
     private String CancDate;

    public CancellationMODEL() {
    }

    public CancellationMODEL(String CancId) {
        this.CancId = CancId;
    }

    public CancellationMODEL(String CancId, int TicketId, int Depcode, String CancDate) {
        this.CancId = CancId;
        this.TicketId = TicketId;
        this.Depcode = Depcode;
        this.CancDate = CancDate;
    }

    public String getCancId() {
        return CancId;
    }

    public void setCancId(String CancId) {
        this.CancId = CancId;
    }

    public int getTicketId() {
        return TicketId;
    }

    public void setTicketId(int TicketId) {
        this.TicketId = TicketId;
    }

    public int getDepcode() {
        return Depcode;
    }

    public void setDepcode(int Depcode) {
        this.Depcode = Depcode;
    }

    public String getCancDate() {
        return CancDate;
    }

    public void setCancDate(String CancDate) {
        this.CancDate = CancDate;
    }
     
}
