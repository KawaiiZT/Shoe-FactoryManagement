package main.javacode.Warehouse;

import java.time.format.DateTimeFormatter;

public abstract class AbstractObject implements InterfaceData{
    public static final String url = "jdbc:mysql://localhost:3306/mydb";
    public static final String user = "root";
    public static final String password = "1234";
    public static final String dtf = "HH:mm:ss - dd/MM/yyyy";
}


