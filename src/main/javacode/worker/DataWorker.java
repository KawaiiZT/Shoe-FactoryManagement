package main.javacode.worker;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DataWorker {
        private String url, user, password, sql1, sql2;
        private Connection con;
        private PreparedStatement pre1, pre2;
        private ResultSet rec;
        private DateTimeFormatter dtf;
        private String time;

        public DataWorker() {
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
        public void query() {
            sql1 = "SELECT * FROM mydb.worker";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
                pre1 = con.prepareStatement(sql1);
                rec = pre1.executeQuery();
                while ((rec != null) && (rec.next())) {
                    System.out.println(rec.getString("firstname"));
                    System.out.println(rec.getString("lastname"));
                    System.out.println(rec.getString("email"));
                    System.out.println(rec.getString("phonenumber"));
                    System.out.println(rec.getString("day"));
                    System.out.println(rec.getString("month"));
                    System.out.println(rec.getString("year"));
                    System.out.println(rec.getString("sex"));
                    System.out.println(rec.getString("occupation"));
                    System.out.println(rec.getString("citizen_id"));
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
        public void insertInto(/*ObjectWorker ow*/) {
            sql1 = "INSERT INTO mydb.worker(firstname, lastname, email, phonenumber, day, month, year, sex, occupation, citizen_id)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // value สามารถใส่ตัวแปรได้
            time = dtf.format(LocalDateTime.now());
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
        public void update(/*ObjectWorker ow, index*/) {
            sql1 = "UPDATE mydb.worker SET firstname = ? WHERE idworker = ?"; // value สามารถใส่ตัวแปรได้
            time = dtf.format(LocalDateTime.now());
            sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
            try {
                con = DriverManager.getConnection(url, user, password);
                pre1 = con.prepareStatement(sql1);
                pre1.setString(1, "Natpaphat"); // ตัวแปรใส่ตามตำแหน่ง parameter
                pre1.setInt(2, 1);
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
        public void delete(/*ObjectWorker ow, index*/) {
            sql1 = "DELETE FROM mydb.worker WHERE idworker = ?"; // value สามารถใส่ตัวแปรได้
            time = dtf.format(LocalDateTime.now());
            sql2 = "INSERT INTO mydb.logging(text) VALUES(?)"; // value สามารถใส่ตัวแปรได้
            try {
                con = DriverManager.getConnection(url, user, password);
                pre1 = con.prepareStatement(sql1);
                pre1.setInt(1, 1); // ตัวแปรใส่ตามตำแหน่ง parameter
                pre1.executeUpdate();
                pre2 = con.prepareStatement(sql2);
                pre2.setString(1, time + " - Worker had deleted."); // ตัวแปรใส่ตามตำแหน่ง parameter
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
            DataWorker dw = new DataWorker();
            dw.insertInto();
            dw.delete();
            dw.update();
            dw.query();
        }
}
