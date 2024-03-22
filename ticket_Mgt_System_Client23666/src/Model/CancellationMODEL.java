
package Model;

import java.io.Serializable;
import java.util.logging.Logger;

public class CancellationMODEL implements Serializable{

     private String CancId;
     private int TicketId;
     private int Depcode;
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
