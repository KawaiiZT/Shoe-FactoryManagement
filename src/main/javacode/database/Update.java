package main.javacode.database;

import java.sql.*;
import java.time.LocalDateTime;

public class Update extends AbstractData {
        private String sql1, sql2;
        private Connection con;
        private PreparedStatement pre1, pre2;
        private String time;
        public Update() {
            sql1 = null;
            sql2 = null;
            con = null;
            pre1 = null;
            pre2 = null;
            time = null;
        }
    @Override
    public void update(ObjectWorker ow, int i) {
        sql1 = "UPDATE mydb.worker SET firstname = ? WHERE idworker = ?"; // value สามารถใส่ตัวแปรได้
        time = getDtf().format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Natpaphat"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, i);
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Worker had updated."); // ตัวแปรใส่ตามตำแหน่ง parameter
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
    public void update(ObjectExpense oe, int i) {
        sql1 = "UPDATE mydb.`income-expense` SET note = ? WHERE idexpense = ?"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Test  eiei"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, i);
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
    public void update(ObjectWarehouse owh, int i) {
        sql1 = "UPDATE mydb.warehouse SET name = ? WHERE idwarehouse = ?"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Boots"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, i);
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Warehouse had updated."); // ตัวแปรใส่ตามตำแหน่ง parameter
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
    public void insertInto(ObjectWorker ow) {}
    public void insertInto(ObjectExpense oe) {}
    public void insertInto(ObjectWarehouse owh) {}
    public void delete(ObjectWorker ow, int i) {}
    public void delete(ObjectExpense oe, int i) {}
    public void delete(ObjectWarehouse owh, int i) {}
}
