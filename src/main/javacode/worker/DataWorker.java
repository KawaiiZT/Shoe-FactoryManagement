package main.javacode.worker;

import java.sql.*;
public class DataWorker {
    public static void main(String[] args) {
        // set parameter
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "1234";
        // create
        Connection connection = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            // test
            /*String sql1 = "Insert Into mydb.worker(firstname, lastname, email, phonenumber, day, month, year, sex, occupation, citizen_id) " +
                    "VALUES('Kull', 'Su', 'kull', '064', '25', '3', '2024', 'Female', 'null', '113')";*/
            String sql2 = "SELECT * FROM mydb.worker";
            s = connection.createStatement();
            //s.executeUpdate(sql1);
            ResultSet rec = s.executeQuery(sql2);
            // check collum
            while ((rec != null) && (rec.next())) {
                // check roll
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
            e.printStackTrace();
        }
        // ตรวจการเข้าถึงฐานข้อมูล
        try {
            // ถ้ามีการเข้าถึงฐานข้อมูลให้ปิดการเชื่อมต่อ
            if (connection != null) {
                s.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
