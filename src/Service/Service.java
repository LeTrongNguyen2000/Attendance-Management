/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.CheckinDAO;
import DAO.ClassSubjectDAO;
import DAO.StudentDAO;
import DAO.UserDAO;
import Model.Checkin;
import Model.ClassSubject;
import Model.Student;
import Model.User;
import java.util.List;

public class Service {

    UserDAO userdao;
    CheckinDAO checkindao;
    ClassSubjectDAO classsubjectdao;
    StudentDAO studentdao;

    public Service() {
        userdao = new UserDAO();
        studentdao = new StudentDAO();
        checkindao = new CheckinDAO();
        classsubjectdao = new ClassSubjectDAO();
    }

    public boolean login(String UserName, String PassWord) {
        if (userdao.login(UserName, PassWord)) {
            return true;
        }
        return false;
    }

    public void ChangePassword(String UserName, String PassWord) {
        userdao.ChangePassword(UserName, PassWord);
    }

    public List<User> findPassword(String UserName, String Password) {
        return userdao.findPassword(UserName, Password);
    }

    public List<User> ComparePassword(String UserName, String PassWord) {
        return userdao.ComparePassword(UserName, PassWord);
    }

    public List<User> setInfor(String UserName) {
        return userdao.setInfo(UserName);
    }

    public List<Student> SetNumberOfStudent(String Quantity) {
        return studentdao.SetNumberOfStudent(Quantity);
    }

    public List<Student> SetNumberOfLeader(String Quantity) {
        return studentdao.SetNumberOfLeader(Quantity);
    }

    public List<Checkin> SetNumberOfCheckin(String Quantity) {
        return checkindao.SetNumberOfCheckin(Quantity);
    }

    public List<ClassSubject> SetNumberOfClassSubject(String Quantity) {
        return classsubjectdao.SetNumberOfClassSubject(Quantity);
    }

    public List<User> getAllUser() {
        return userdao.getAllUser();
    }

    public void UpdateUser(String UserName, String UserNameChange, String FullName, String PassWord, String IdRole) {
        userdao.UpdateUser(UserName, UserNameChange, FullName, PassWord, IdRole);
    }

    public void DeleteUser(String UserName) {
        userdao.DeleteUser(UserName);
    }

    public List<User> Search(String UserName) {
        return userdao.Search(UserName);
    }
    
}
