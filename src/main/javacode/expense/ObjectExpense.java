package main.javacode.expense;

import java.io.Serializable;
public class ObjectExpense implements Serializable{
    private String date;
    private String order;
    private double expense;
    private double income;
    private String note;
    public ObjectExpense(){
        this.date = null;
        this.order = null;
        this.expense = 0.0;
        this.income = 0.0;
        this.note = null;
    }
    public ObjectExpense(String date, String order, double expense, double income, String note){
        this.date = date;
        this.order = order;
        this.expense = expense;
        this.income = income;
        this.note = note;
    }
    public String getDate(){
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
