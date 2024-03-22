package main.javacode.expense;

import java.io.Serializable;
public class ObjectExpense implements Serializable{
    private String day;
    private String month;
    private String year;
    private String order;
    private double expense;
    private double income;
    private String note;
    public ObjectExpense(){
        this.day = null;
        this.month = null;
        this.year = null;
        this.order = null;
        this.expense = 0.0;
        this.income = 0.0;
        this.note = null;
    }
    public ObjectExpense(String date, String order, double expense, double income, String note){
        this.day = date;
        this.month = date;
        this.year = date;
        this.order = order;
        this.expense = expense;
        this.income = income;
        this.note = note;
    }
    public String getDate(){
        return day;
    }

    public void setDate(String date) {
        this.day = date;
    }
    public String getMonth(){
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public String getYear(){
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
