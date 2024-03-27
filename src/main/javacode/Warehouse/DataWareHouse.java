package main.javacode.Warehouse;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataWareHouse implements InterfaceWarehouse {
    private String url, user, password, sql1, sql2;
    private Connection con;
    private PreparedStatement pre1, pre2;
    private ResultSet rec;
    private DateTimeFormatter dtf;
    private String time;

    public DataWareHouse() {
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
        sql1 = "SELECT * FROM mydb.warehouse";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            rec = pre1.executeQuery();
            while ((rec != null) && (rec.next())) {
                System.out.println(rec.getString("name"));
                System.out.println(rec.getString("quantity"));
                System.out.println(rec.getString("status"));
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
    public void insertInto(/*ObjectWarehouse owh*/) {
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
    @Override
    public void update(/*ObjectWarehouse owh, index*/) {
        sql1 = "UPDATE mydb.warehouse SET name = ? WHERE idwarehouse = ?"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, "Boots"); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.setInt(2, 1);
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
    @Override
    public void delete(/*ObjectWarehouse owh, index*/) {
        sql1 = "DELETE FROM mydb.warehouse WHERE idwarehouse = ?"; // value สามารถใส่ตัวแปรได้
        time = dtf.format(LocalDateTime.now());
        sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
        try {
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setInt(1, 0); // ตัวแปรใส่ตามตำแหน่ง parameter
            pre1.executeUpdate();
            pre2 = con.prepareStatement(sql2);
            pre2.setString(1, time + " - Warehouse had deleted."); // ตัวแปรใส่ตามตำแหน่ง parameter
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
        DataWareHouse dwh = new DataWareHouse();
        dwh.insertInto();
        dwh.delete();
        dwh.update();
        dwh.query();
    }
}
