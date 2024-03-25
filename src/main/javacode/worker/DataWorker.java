package main.javacode.worker;

import java.sql.*;
public class DataWorker {
        private String url, user, password, sql;
        private Connection con;
        private Statement s;
        private ResultSet rec;

        public DataWorker() {
            url = "jdbc:mysql://localhost:3306/mydb";
            user = "root";
            password = "1234";
            sql = null;
            con = null;
            s = null;
            rec = null;
        }
        public void query() {
            sql = "SELECT * FROM mydb.worker";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                rec = s.executeQuery(sql);
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
            sql = "INSERT INTO mydb.worker(firstname, lastname, email, phonenumber, day, month, year, sex, occupation, citizen_id)"
                    + " VALUES('Kull', 'Su', 'kullan', '064', '25', '3', '2024', 'Female', 'null', '11300')";
            try {
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                s.executeUpdate(sql);
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
            sql = "UPDATE mydb.worker SET firstname = 'nat' WHERE idworker = 1";
            try {
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                s.executeUpdate(sql);
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
            sql = "DELETE FROM mydb.worker WHERE idworker = 1";
            try {
                con = DriverManager.getConnection(url, user, password);
                s = con.createStatement();
                s.executeUpdate(sql);
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
