package main.javacode.worker;

import java.sql.*;
public class DataWorker {
        private String url, user, password, sql1, sql2;
        private Connection con;
        private Statement s;
        private ResultSet rec;

        public DataWorker() {
            url = "jdbc:mysql://localhost:3306/mydb";
            user = "root";
            password = "1234";
            sql1 = null;
            sql2 = null;
            con = null;
            s = null;
            rec = null;
        }
        // return ResultSet
        public void query() {
            sql1 = "SELECT * FROM mydb.worker";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                rec = s.executeQuery(sql1);
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
                    s.close();
                    con.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
        }
        public void insertInto(/*ObjectWorker ow*/) {
            sql1 = "INSERT INTO mydb.worker(firstname, lastname, email, phonenumber, day, month, year, sex, occupation, citizen_id)"
                    + " VALUES('Kull', 'Su', 'kullan', '064', '25', '3', '2024', 'Female', 'null', '11300')";
            sql2 = "INSERT INTO mydb.logging(text) VALUES('Worker had added.')";
            try {
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                s.executeUpdate(sql1);
                s.executeUpdate(sql2);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                if (con != null) {
                    s.close();
                    con.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
        }
        public void update(/*ObjectWorker ow, index*/) {
            sql1 = "UPDATE mydb.worker SET firstname = 'nat' WHERE idworker = 1";
            sql2 = "INSERT INTO mydb.logging(text) VALUES('Worker had updated.')";
            try {
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                s.executeUpdate(sql1);
                s.executeUpdate(sql2);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                if (con != null) {
                    s.close();
                    con.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
        }
        public void delete(/*ObjectWorker ow, index*/) {
            sql1 = "DELETE FROM mydb.worker WHERE idworker = 1";
            sql2 = "INSERT INTO mydb.logging(text) VALUES('Worker had deleted.')";
            try {
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                s.executeUpdate(sql1);
                s.executeUpdate(sql2);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                if (con != null) {
                    s.close();
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
            DataWorker d = new DataWorker();
            d.insertInto();
            d.delete();
            d.update();
            d.query();
        }
}
