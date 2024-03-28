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
            pre1.setString(1, ow.getFirstname()); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setString(2, ow.getLastname());
            pre1.setString(3, ow.getEmail());
            pre1.setString(4, ow.getPhonenumber());
            pre1.setString(5, ow.getDay());
            pre1.setString(6, ow.getMonth());
            pre1.setString(7, ow.getYear());
            pre1.setString(8, ow.getSex());
            pre1.setString(9, ow.getOccupation());
            pre1.setString(10, ow.getCentizenID());
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
    public void insertInto(ObjectExpense<Integer> oe) {
        sql1 = "INSERT INTO mydb.`income-expense`(day, month, year, orders, income, expense, summary, note)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, oe.getDay()); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setString(2, oe.getMonth());
            pre1.setString(3, oe.getYear());
            pre1.setString(4, oe.getOrders());
            pre1.setInt(5,oe.getIncome());
            pre1.setInt(6, oe.getExpense());
            pre1.setInt(7, oe.getSummary());
            pre1.setString(8, oe.getNote());
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
    public void insertInto(ObjectWarehouse<Integer> owh) {
        sql1 = "INSERT INTO mydb.warehouse(name, quantity, status)"
                + " VALUES(?, ?, ?)"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, owh.getName()); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, owh.getQuantity());
            pre1.setBoolean(3, owh.getStatus());
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
    public void update(ObjectExpense<Integer> oe, int i) {}
    public void update(ObjectWarehouse<Integer> owh, int i) {}
    public void delete(ObjectWorker ow, int i) {}
    public void delete(ObjectExpense<Integer> oe, int i) {}
    public void delete(ObjectWarehouse<Integer> owh, int i) {}
}
