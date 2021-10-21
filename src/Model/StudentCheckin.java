/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dell
 */
public class StudentCheckin {
    private String IdCheckin;
    private String IdStudent;
    private String CheckIn;
    private String CheckOut;
    private String IdUser;
    
    public StudentCheckin()
    {
        
    }

    public StudentCheckin(String IdCheckin, String IdStudent, String CheckIn, String CheckOut, String IdUser) {
        this.IdCheckin = IdCheckin;
        this.IdStudent = IdStudent;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        this.IdUser = IdUser;
    }

    public String getIdCheckin() {
        return IdCheckin;
    }

    public void setIdCheckin(String IdCheckin) {
        this.IdCheckin = IdCheckin;
    }

    public String getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(String IdStudent) {
        this.IdStudent = IdStudent;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }

    public String getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(String CheckOut) {
        this.CheckOut = CheckOut;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }
    
    
}
