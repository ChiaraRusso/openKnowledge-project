package persistence.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "user" )
public class UserDBTO {

    @Id
    @GeneratedValue
    private Integer idUser;

    private String firstnameUser;

    private String lastNameUser;

    private String email;

    private String address;

    private String cap;

    private String phoneNumber;

    private String cityOfBirth;

    private String cityOfResidence;

    private GroupDBTO group;


    public Integer getIdUser() {
        return idUser;
    }
    public String getFirstnameUser() {
        return firstnameUser;
    }
    public void setFirstnameUser( final String firstnameUser ) {
        this.firstnameUser = firstnameUser;
    }
    public String getLastNameUser() {
        return lastNameUser;
    }
    public void setLastNameUser( final String lastNameUser ) {
        this.lastNameUser = lastNameUser;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail( final String email ) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress( final String address ) {
        this.address = address;
    }
    public String getCap() {
        return cap;
    }
    public void setCap( final String cap ) {
        this.cap = cap;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber( final String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }
    public String getCityOfBirth() {
        return cityOfBirth;
    }
    public void setCityOfBirth( final String cityOfBirth ) {
        this.cityOfBirth = cityOfBirth;
    }
    public String getCityOfResidence() {
        return cityOfResidence;
    }
    public void setCityOfResidence( final String cityOfResidence ) {
        this.cityOfResidence = cityOfResidence;
    }

    public GroupDBTO getGroupDBTO() {
        return group;
    }
    public void setGroupDBTO( final GroupDBTO groupDBTO ) {
        this.group = groupDBTO;
    }
}
