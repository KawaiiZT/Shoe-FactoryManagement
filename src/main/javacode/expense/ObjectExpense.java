package main.javacode.expense;

public class ObjectExpense {
    private String order;
    private double income;
    private double expense;
    private String day;
    private String month;
    private String year;
    private String note;
    public ObjectExpense() {
        this.order = null;
        this.income = 0.0;
        this.expense = 0.0;
        this.day = null;
        this.month = null;
        this.year = null;
        this.note = null;
    }
    public ObjectExpense(String order, double income, double expense, String day, String mount, String year, String note){
        this.order = order;
        this.income = income;
        this.expense = expense;
        this.day = day;
        this.month = mount;
        this.year = year;
        this.note = note;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public double getExpense() {
        return expense;
    }
    public void setExpense(double expense) {
        this.expense = expense;
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
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
