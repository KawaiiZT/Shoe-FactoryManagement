package main.javacode.database;

import java.sql.*;

public class Query extends AbstractData {
    private String sql1;
    private Connection con;
    private PreparedStatement pre1;
    private ResultSet rec;

    public Query() {
        sql1 = null;
        con = null;
        pre1 = null;
        rec = null;
    }
    @Override
    public ResultSet query(String table) {
        sql1 = "SELECT * FROM ?"; // mydb.worker, mydb.`income-expense`, mydb.`income-expense`
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            pre1 = con.prepareStatement(sql1);
            pre1.setString(1, table);
            rec = pre1.executeQuery();
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
        return rec;
    }
    public void insertInto(ObjectWorker ow) {}
    public void insertInto(ObjectExpense oe) {}
    public void insertInto(ObjectWarehouse owh) {}
    public void update(ObjectWorker ow, int i) {}
    public void update(ObjectExpense oe, int i) {}
    public void update(ObjectWarehouse owh, int i) {}
    public void delete(ObjectWorker ow, int i) {}
    public void delete(ObjectExpense oe, int i) {}
    public void delete(ObjectWarehouse owh, int i) {}
}
