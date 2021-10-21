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
public class User {
    
    private String IdUser;
    private String FullName;
    private String UserName;
    private String PassWord;
    private String IsLocked;
    private String IdRole;
    private String RoleName;
    
    public User()
    {
        
    }

    public User(String IdUser, String FullName, String UserName, String PassWord, String IsLocked, String IdRole, String RoleName) {
        this.IdUser = IdUser;
        this.FullName = FullName;
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.IsLocked = IsLocked;
        this.IdRole = IdRole;
        this.RoleName = RoleName;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getIsLocked() {
        return IsLocked;
    }

    public void setIsLocked(String IsLocked) {
        this.IsLocked = IsLocked;
    }

    public String getIdRole() {
        return IdRole;
    }

    public void setIdRole(String IdRole) {
        this.IdRole = IdRole;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    
         
}
