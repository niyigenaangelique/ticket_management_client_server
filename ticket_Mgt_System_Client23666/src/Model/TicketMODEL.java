
package Model;

import java.io.Serializable;



public class TicketMODEL implements Serializable{

     private int TicketId;
     private PassengersMODEL passid;
     private String PName;
     private DepartureMODEL depcode;
     private String PGen;
     private String PNAT;
     private double Amount;

    public TicketMODEL() {
    }

    public TicketMODEL(int TicketId) {
        this.TicketId = TicketId;
    }

    public TicketMODEL(int TicketId, PassengersMODEL passid, String PName, DepartureMODEL depcode, String PGen, String PNAT, double Amount) {
        this.TicketId = TicketId;
        this.passid = passid;
        this.PName = PName;
        this.depcode = depcode;
        this.PGen = PGen;
        this.PNAT = PNAT;
        this.Amount = Amount;
    }

    public int getTicketId() {
        return TicketId;
    }

    public void setTicketId(int TicketId) {
        this.TicketId = TicketId;
    }

    public PassengersMODEL getPassid() {
        return passid;
    }

    public void setPassid(PassengersMODEL passid) {
        this.passid = passid;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public DepartureMODEL getDepcode() {
        return depcode;
    }

    public void setDepcode(DepartureMODEL depcode) {
        this.depcode = depcode;
    }

    public String getPGen() {
        return PGen;
    }

    public void setPGen(String PGen) {
        this.PGen = PGen;
    }

    public String getPNAT() {
        return PNAT;
    }

    public void setPNAT(String PNAT) {
        this.PNAT = PNAT;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
     
}
