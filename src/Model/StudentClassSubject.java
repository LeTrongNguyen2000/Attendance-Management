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
public class StudentClassSubject {
    private String IdClassSubject;
    private String IdStudent;
    
    public StudentClassSubject()
    {
        
    }

    public StudentClassSubject(String IdClassSubject, String IdStudent) {
        this.IdClassSubject = IdClassSubject;
        this.IdStudent = IdStudent;
    }

    public String getIdClassSubject() {
        return IdClassSubject;
    }

    public void setIdClassSubject(String IdClassSubject) {
        this.IdClassSubject = IdClassSubject;
    }

    public String getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(String IdStudent) {
        this.IdStudent = IdStudent;
    }
    
    
}
