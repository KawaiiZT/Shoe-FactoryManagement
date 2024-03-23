package main.javacode.worker;
import java.sql.*;
public class DataWorker {
    public static void main(String[] args) {
        // set parameter
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "1234";
        Connection connection = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
            // test
            String sql = "SELECT * From mydb.worker";
            s = connection.createStatement();
            ResultSet rec = s.executeQuery(sql);
            // check collum
            while ((rec != null) && (rec.next())) {
                // check roll
                System.out.println(rec.getString("firstname"));
                System.out.println(rec.getString("lastname"));
                System.out.println(rec.getString("email"));
                System.out.println(rec.getString("phonenumber"));
                System.out.println(rec.getDate("date"));
                System.out.println(rec.getString("sex"));
                System.out.println(rec.getString("occupation"));
                System.out.println(rec.getString("citizen_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                s.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
