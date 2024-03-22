package main.javacode.worker;

import java.io.Serializable;

public class ObjectWorker implements Serializable {
    private String firstname;
    private String surname;
    private String email;
    private String phonenumber;
    private String bday;
    private String bmonth;
    private String byear;
    private String sex;
    private String occupation;
    private String centizenID;


    public ObjectWorker() {
        this.firstname = null;
        this.surname = null;
        this.email = null;
        this.phonenumber = null;
        this.bday = null;
        this.bmonth = null;
        this.byear = null;
        this.sex = null;
        this.occupation = null;
        this.centizenID = null;

    }
    public ObjectWorker(String firstname,String surname,String email,String phonenumber,String bday,String bmonth,String byear,String sex, String occupation, String centizenID,String address) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.sex = sex;
        this.occupation = occupation;
        this.centizenID = centizenID;

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

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public void setBmonth(String bmonth) {
        this.bmonth = bmonth;
    }

    public String getByear() {
        return byear;
    }

    public void setByear(String byear) {
        this.byear = byear;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
