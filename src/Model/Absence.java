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
public class Absence {
    private String IdAbsence;
    private String IdStudent;
    private String IdClassSubjet;
    private String IdSubject;
    private String IdUser;
    private String Content;
    
    public Absence()
    {
        
    }

    public Absence(String IdAbsence, String IdStudent, String IdClassSubjet, String IdSubject, String IdUser, String Content) {
        this.IdAbsence = IdAbsence;
        this.IdStudent = IdStudent;
        this.IdClassSubjet = IdClassSubjet;
        this.IdSubject = IdSubject;
        this.IdUser = IdUser;
        this.Content = Content;
    }

    public String getIdAbsence() {
        return IdAbsence;
    }

    public void setIdAbsence(String IdAbsence) {
        this.IdAbsence = IdAbsence;
    }

    public String getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(String IdStudent) {
        this.IdStudent = IdStudent;
    }

    public String getIdClassSubjet() {
        return IdClassSubjet;
    }

    public void setIdClassSubjet(String IdClassSubjet) {
        this.IdClassSubjet = IdClassSubjet;
    }

    public String getIdSubject() {
        return IdSubject;
    }

    public void setIdSubject(String IdSubject) {
        this.IdSubject = IdSubject;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
    
    
}
