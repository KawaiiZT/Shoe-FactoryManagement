package main.javacode.worker;

import java.io.Serializable;

public class ObjectWorker implements Serializable {
    private String firstname;
    private String surname;
    private String email;
    private String phonenumber;
    private String centizenID;
    private String address;

    public ObjectWorker() {
        this.firstname = null;
        this.surname = null;
        this.email = null;
        this.phonenumber = null;
        this.centizenID = null;
        this.address = null;
    }
    public ObjectWorker(String firstname,String surname,String email,String phonenumber, String centizenID,String address) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.centizenID = centizenID;
        this.address = address;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCentizenID() {
        return centizenID;
    }

    public void setCentizenID(String centizenID) {
        this.centizenID = centizenID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
