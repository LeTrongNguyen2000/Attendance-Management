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
public class Student {
    
    private String IdStudent;
    private String StudentCode;
    private String StudentName;
    private String Email;
    private String Phone;
    private String IDFacebook;
    private String IdUser;
    private String IdClass;
    private String Quantity;
    
    public Student()
    {
        
    }

    public Student(String IdStudent, String StudentCode, String StudentName, String Email, String Phone, String IDFacebook, String IdUser, String IdClass, String Quantity) {
        this.IdStudent = IdStudent;
        this.StudentCode = StudentCode;
        this.StudentName = StudentName;
        this.Email = Email;
        this.Phone = Phone;
        this.IDFacebook = IDFacebook;
        this.IdUser = IdUser;
        this.IdClass = IdClass;
        this.Quantity = Quantity;
    }

    public String getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(String IdStudent) {
        this.IdStudent = IdStudent;
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String StudentCode) {
        this.StudentCode = StudentCode;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getIDFacebook() {
        return IDFacebook;
    }

    public void setIDFacebook(String IDFacebook) {
        this.IDFacebook = IDFacebook;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getIdClass() {
        return IdClass;
    }

    public void setIdClass(String IdClass) {
        this.IdClass = IdClass;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

   
    
    
}
