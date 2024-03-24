package main.javacode.worker;

import java.io.*;

public class ObjectWorker implements Serializable {
    private String firstname, lastname, email, phonenumber, day, month, year, sex, occupation, centizenID;
    public ObjectWorker() {
        this.firstname = null;
        this.lastname = null;
        this.email = null;
        this.phonenumber = null;
        this.day = null;
        this.month = null;
        this.year = null;
        this.sex = null;
        this.occupation = null;
        this.centizenID = null;

    }
    public ObjectWorker(String firstname,String lastname,String email,String phonenumber,String day,String month,String year,String sex, String occupation, String centizenID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.day = day;
        this.month = month;
        this.year = year;
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
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
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
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
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
