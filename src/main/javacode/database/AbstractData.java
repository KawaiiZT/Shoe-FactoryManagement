package main.javacode.database;
import java.time.format.DateTimeFormatter;

public abstract class AbstractData implements InterfaceData {
    public static final String url = "jdbc:mysql://localhost:3306/mydb";;
    public static final String user = "root";
    public static final String password = "1234";
    public DateTimeFormatter dtf;
    public AbstractData() {
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy");
    }
    public DateTimeFormatter getDtf() {
        return dtf;
    }
    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }
}
