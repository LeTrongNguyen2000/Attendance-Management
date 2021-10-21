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
public class Checkin {
    private String IdCheckin;
    private String IdClassSubject;
    private String IdUser;
    private String CheckinDate;
    private String CheckinRoom;
    private String Quantity;
    
    public Checkin()
    {
        
    }

    public Checkin(String IdCheckin, String IdClassSubject, String IdUser, String CheckinDate, String CheckinRoom, String Quantity) {
        this.IdCheckin = IdCheckin;
        this.IdClassSubject = IdClassSubject;
        this.IdUser = IdUser;
        this.CheckinDate = CheckinDate;
        this.CheckinRoom = CheckinRoom;
        this.Quantity = Quantity;
    }

    public String getIdCheckin() {
        return IdCheckin;
    }

    public void setIdCheckin(String IdCheckin) {
        this.IdCheckin = IdCheckin;
    }

    public String getIdClassSubject() {
        return IdClassSubject;
    }

    public void setIdClassSubject(String IdClassSubject) {
        this.IdClassSubject = IdClassSubject;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getCheckinDate() {
        return CheckinDate;
    }

    public void setCheckinDate(String CheckinDate) {
        this.CheckinDate = CheckinDate;
    }

    public String getCheckinRoom() {
        return CheckinRoom;
    }

    public void setCheckinRoom(String CheckinRoom) {
        this.CheckinRoom = CheckinRoom;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    
    
    
}
