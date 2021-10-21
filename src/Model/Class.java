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
public class Class {
    private String IdClass;
    private String ClassName;
    private String IdFaculty;
    
    public Class()
    {
        
    }

    public Class(String IdClass, String ClassName, String IdFaculty) {
        this.IdClass = IdClass;
        this.ClassName = ClassName;
        this.IdFaculty = IdFaculty;
    }

    public String getIdClass() {
        return IdClass;
    }

    public void setIdClass(String IdClass) {
        this.IdClass = IdClass;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getIdFaculty() {
        return IdFaculty;
    }

    public void setIdFaculty(String IdFaculty) {
        this.IdFaculty = IdFaculty;
    }
    
    
    
}
