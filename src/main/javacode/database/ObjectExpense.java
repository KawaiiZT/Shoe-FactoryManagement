package main.javacode.database;

public class ObjectExpense<T> {
    private String day;
    private String month;
    private String year;
    private String orders;
    private T income;
    private T expense;
    private String summary;
    private String note;
    public ObjectExpense() {
        this.day = null;
        this.month = null;
        this.year = null;
        this.orders = null;
        this.income = null;
        this.expense = null;
        this.summary = null;
        this.note = null;
    }
    public ObjectExpense(String day, String mount, String year, String orders, T income, T expense, String summary, String note) {
        this.day = day;
        this.month = mount;
        this.year = year;
        this.orders = orders;
        this.income = income;
        this.expense = expense;
        this.summary = summary;
        this.note = note;
    }
    public String getOrder() {
        return orders;
    }
    public void setOrder(String orders) {
        this.orders = orders;
    }
    public T getIncome() {
        return income;
    }
    public void setIncome(T income) {
        this.income = income;
    }
    public T getExpense() {
        return expense;
    }
    public void setExpense(T expense) {
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
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
}
