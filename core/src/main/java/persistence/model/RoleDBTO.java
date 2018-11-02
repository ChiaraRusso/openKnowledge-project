package persistence.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class RoleDBTO {
    
    @Id
    private Integer idRole;

    private String roleName;

    public Integer getIdRole() {
        return idRole;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName( final String roleName ) {
        this.roleName = roleName;
    }
}
