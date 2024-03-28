package main.javacode.database;

public class ObjectExpense<T> {
    private String day;
    private String month;
    private String year;
    private String orders;
    private T income;
    private T expense;
    private T summary;
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

    public ObjectExpense(String day, String month, String year, String orders, T income, T expense, T summary, String note) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.orders = orders;
        this.income = income;
        this.expense = expense;
        this.summary = summary;
        this.note = note;
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
    public String getOrders() {
        return orders;
    }
    public void setOrders(String orders) {
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
    public T getSummary() {
        return summary;
    }
    public void setSummary(T summary) {
        this.summary = summary;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
