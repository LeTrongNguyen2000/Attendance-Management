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
public class Faculty {

    private String IdFaculty;
    private String FacultyCode;
    private String FacultyName;

    public Faculty() {

    }

    public Faculty(String IdFaculty, String FacultyCode, String FacultyName) {
        this.IdFaculty = IdFaculty;
        this.FacultyCode = FacultyCode;
        this.FacultyName = FacultyName;
    }

    public String getIdFaculty() {
        return IdFaculty;
    }

    public void setIdFaculty(String IdFaculty) {
        this.IdFaculty = IdFaculty;
    }

    public String getFacultyCode() {
        return FacultyCode;
    }

    public void setFacultyCode(String FacultyCode) {
        this.FacultyCode = FacultyCode;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String FacultyName) {
        this.FacultyName = FacultyName;
    }
    
    
}
