
package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class SignUpMODEL implements Serializable{
    @Id
    @Column(name="user_id")
    private int UsId;
    @Column(name="first_name")
    private String FName;
    @Column(name="last_name")
    private String LName;
    @Column(name="address_1")
    private String ADD1;
    @Column(name="address_2")
    private String ADD2;
    @Column(name = "password")
    private String Password;

    public SignUpMODEL() {
    }

    public SignUpMODEL(int UsId) {
        this.UsId = UsId;
    }

    public SignUpMODEL(int UsId, String FName, String LName, String ADD1, String ADD2, String Password) {
        this.UsId = UsId;
        this.FName = FName;
        this.LName = LName;
        this.ADD1 = ADD1;
        this.ADD2 = ADD2;
        this.Password = Password;
    }

    public int getUsId() {
        return UsId;
    }

    public void setUsId(int UsId) {
        this.UsId = UsId;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getADD1() {
        return ADD1;
    }

    public void setADD1(String ADD1) {
        this.ADD1 = ADD1;
    }

    public String getADD2() {
        return ADD2;
    }

    public void setADD2(String ADD2) {
        this.ADD2 = ADD2;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
