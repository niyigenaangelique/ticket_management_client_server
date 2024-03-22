
package Model;

import java.io.Serializable;



public class PassengersMODEL implements Serializable{
    
    private int PDID;
    private String PName;
    private String PNAT;
    private String PGen;
    private String PAdd;
    private String Pphone;
    
    private TicketMODEL ticket;

    public PassengersMODEL() {
    }

    public PassengersMODEL(int PDID) {
        this.PDID = PDID;
    }

    public PassengersMODEL(int PDID, String PName, String PNAT, String PGen, String PAdd, String Pphone, TicketMODEL ticket) {
        this.PDID = PDID;
        this.PName = PName;
        this.PNAT = PNAT;
        this.PGen = PGen;
        this.PAdd = PAdd;
        this.Pphone = Pphone;
        this.ticket = ticket;
    }

    public int getPDID() {
        return PDID;
    }

    public void setPDID(int PDID) {
        this.PDID = PDID;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPNAT() {
        return PNAT;
    }

    public void setPNAT(String PNAT) {
        this.PNAT = PNAT;
    }

    public String getPGen() {
        return PGen;
    }

    public void setPGen(String PGen) {
        this.PGen = PGen;
    }

    public String getPAdd() {
        return PAdd;
    }

    public void setPAdd(String PAdd) {
        this.PAdd = PAdd;
    }

    public String getPphone() {
        return Pphone;
    }

    public void setPphone(String Pphone) {
        this.Pphone = Pphone;
    }

    public TicketMODEL getTicket() {
        return ticket;
    }

    public void setTicket(TicketMODEL ticket) {
        this.ticket = ticket;
    }
    
}
