package persistence.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table( name = "group" )
public class GroupDBTO {

    @Id
    @GeneratedValue
    private Integer idGroup;

    private String description;

    private List<UserDBTO> users;
    private List<RoleDBTO> roles;


    public Integer getIdGroup() {
        return idGroup;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription( final String description ) {
        this.description = description;
    }

    public List<UserDBTO> getUsers() {
        return users;
    }
    public void setUsers( final List<UserDBTO> users ) {
        this.users = users;
    }
    public List<RoleDBTO> getRoles() {
        return roles;
    }
    public void setRoles( final List<RoleDBTO> roles ) {
        this.roles = roles;
    }
}
