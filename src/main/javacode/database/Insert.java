package main.javacode.database;

import java.sql.*;
import java.time.LocalDateTime;

public class Insert extends AbstractData {
    private String sql1, sql2;
    private Connection con;
    private PreparedStatement pre1, pre2;
    private String time;
    public Insert() {
        sql1 = null;
        sql2 = null;
        con = null;
        pre1 = null;
        pre2 = null;
        time = null;
    }

    @Override
    public void insertInto(ObjectWorker ow) {
        sql1 = "INSERT INTO mydb.worker(firstname, lastname, email, phonenumber, day, month, year, sex, occupation, citizen_id)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // value สามารถใส่ตัวแปรได้
        time = getDtf().format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Nat"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setString(2, "Akk");
            pre1.setString(3, "nam");
            pre1.setString(4, "084");
            pre1.setString(5, "3");
            pre1.setString(6, "23");
            pre1.setString(7, "2024");
            pre1.setString(8, "Male");
            pre1.setString(9, "Student");
            pre1.setString(10, "113");
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Worker had added."); // ตัวแปรใส่ตามตำแหน่ง parameter
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
    public void insertInto(ObjectExpense oe) {
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
    public void insertInto(ObjectWarehouse owh) {
        sql1 = "INSERT INTO mydb.warehouse(name, quantity, status)"
                + " VALUES(?, ?, ?)"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Shoe"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, 99);
            pre1.setString(3, "Have");
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - WareHouse had added."); // ตัวแปรใส่ตามตำแหน่ง parameter
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
    public ResultSet query(String table) {
        ResultSet rec = null;
        return rec;
    }
    public void update(ObjectWorker ow, int i) {}
    public void update(ObjectExpense oe, int i) {}
    public void update(ObjectWarehouse owh, int i) {}
    public void delete(ObjectWorker ow, int i) {}
    public void delete(ObjectExpense oe, int i) {}
    public void delete(ObjectWarehouse owh, int i) {}
}
