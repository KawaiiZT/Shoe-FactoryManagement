package main.javacode.expense;

import main.javacode.Warehouse.AbstractObject;
import main.javacode.Warehouse.InterfaceData;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataExpense extends AbstractObject{
    private String url, user, password, sql1, sql2;
    private Connection con;
    private PreparedStatement pre1, pre2;
    private ResultSet rec;
    private DateTimeFormatter dtf;
    private String time;

    public DataExpense() {
        url = "jdbc:mysql://localhost:3306/mydb";
        user = "root";
        password = "1234";
        sql1 = null;
        sql2 = null;
        con = null;
        pre1 = null;
        pre2 = null;
        rec = null;
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy");
        time = null;
    }
    // return ResultSet
    @Override
    public void query() {
        sql1 = "SELECT * FROM mydb.`income-expense`";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            rec = pre1.executeQuery();
            while ((rec != null) && (rec.next())) {
                System.out.println(rec.getString("day"));
                System.out.println(rec.getString("month"));
                System.out.println(rec.getString("year"));
                System.out.println(rec.getString("orders"));
                System.out.println(rec.getString("income"));
                System.out.println(rec.getString("expense"));
                System.out.println(rec.getString("summary"));
                System.out.println(rec.getString("note"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if (con != null) {
                pre1.close();
                con.close();
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    @Override
    public void insertInto(/*ObjectExpense oe*/) {
        sql1 = "INSERT INTO mydb.`income-expense`(day, month, year, orders, income, expense, summary, note)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "10"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setString(2, "3");
            pre1.setString(3, "2024");
            pre1.setString(4, "Lec");
            pre1.setInt(5,0);
            pre1.setInt(6, 50);
            pre1.setInt(7, -50);
            pre1.setString(8, "test");
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Expense had added."); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre2.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if (con != null) {
                pre1.close();
                con.close();
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    @Override
    public void update(/*ObjectExpense oe, index*/) {
        sql1 = "UPDATE mydb.`income-expense` SET note = ? WHERE idexpense = ?"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Test  eiei"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, 1);
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Expense had updated."); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre2.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if (con != null) {
                pre1.close();
                pre2.close();
                con.close();
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    @Override
    public void delete(/*ObjectExpense oe, index*/) {
        sql1 = "DELETE FROM mydb.`income-expense` WHERE idexpense = ?"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setInt(1, 0); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Expense had deleted."); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre2.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if (con != null) {
                pre1.close();
                pre2.close();
                con.close();
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    public String getUrl() {
        return url;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static void main(String[] args) {
        DataExpense de = new DataExpense();
        de.insertInto();
        de.delete();
        de.update();
        de.query();
    }
}
