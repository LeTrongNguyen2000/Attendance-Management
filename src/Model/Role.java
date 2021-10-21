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
public class Role {
    private String IdRole;
    private String RoleName;
    
    public Role()
    {
        
    }

    public Role(String IdRole, String RoleName) {
        this.IdRole = IdRole;
        this.RoleName = RoleName;
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
