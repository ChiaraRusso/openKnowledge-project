package persistence.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class GroupDBTO {

    @Id
    private Integer idGroup;

    private String description;


    public Integer getIdGroup() {
        return idGroup;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription( final String description ) {
        this.description = description;
    }
}
