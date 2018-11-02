package persistence.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table( name = "role" )
public class RoleDBTO {

    @Id
    @GeneratedValue
    private Integer idRole;

    private String roleName;

    private List<GroupDBTO> groups;

    public Integer getIdRole() {
        return idRole;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName( final String roleName ) {
        this.roleName = roleName;
    }

    public List<GroupDBTO> getGroups() {
        return groups;
    }
    public void setGroups( final List<GroupDBTO> groups ) {
        this.groups = groups;
    }
}
