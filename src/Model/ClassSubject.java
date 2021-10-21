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
public class ClassSubject {
    
    private String IdClassSubject;
    private String ClassSubjectName;
    private String DateStart;
    private String DateFinish;
    private String Quantity;
    private String Semester;
    private String IdSubject;
    
    public ClassSubject()
    {
        
    }

    public ClassSubject(String IdClassSubject, String ClassSubjectName, String DateStart, String DateFinish, String Quantity, String Semester, String IdSubject) {
        this.IdClassSubject = IdClassSubject;
        this.ClassSubjectName = ClassSubjectName;
        this.DateStart = DateStart;
        this.DateFinish = DateFinish;
        this.Quantity = Quantity;
        this.Semester = Semester;
        this.IdSubject = IdSubject;
    }

    public String getIdClassSubject() {
        return IdClassSubject;
    }

    public void setIdClassSubject(String IdClassSubject) {
        this.IdClassSubject = IdClassSubject;
    }

    public String getClassSubjectName() {
        return ClassSubjectName;
    }

    public void setClassSubjectName(String ClassSubjectName) {
        this.ClassSubjectName = ClassSubjectName;
    }

    public String getDateStart() {
        return DateStart;
    }

    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    public String getDateFinish() {
        return DateFinish;
    }

    public void setDateFinish(String DateFinish) {
        this.DateFinish = DateFinish;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getIdSubject() {
        return IdSubject;
    }

    public void setIdSubject(String IdSubject) {
        this.IdSubject = IdSubject;
    }
    
    
}
