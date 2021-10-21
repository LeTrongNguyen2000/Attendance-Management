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
public class Subject {
    
    private String IdSubject;
    private String SubjectCode;
    private String SubjecName;
    private String IdFaculty;
    
    public Subject()
    {
        
    }

    public Subject(String IdSubject, String SubjectCode, String SubjecName, String IdFaculty) {
        this.IdSubject = IdSubject;
        this.SubjectCode = SubjectCode;
        this.SubjecName = SubjecName;
        this.IdFaculty = IdFaculty;
    }

    public String getIdSubject() {
        return IdSubject;
    }

    public void setIdSubject(String IdSubject) {
        this.IdSubject = IdSubject;
    }

    public String getSubjectCode() {
        return SubjectCode;
    }

    public void setSubjectCode(String SubjectCode) {
        this.SubjectCode = SubjectCode;
    }

    public String getSubjecName() {
        return SubjecName;
    }

    public void setSubjecName(String SubjecName) {
        this.SubjecName = SubjecName;
    }

    public String getIdFaculty() {
        return IdFaculty;
    }

    public void setIdFaculty(String IdFaculty) {
        this.IdFaculty = IdFaculty;
    }
    
    
}
