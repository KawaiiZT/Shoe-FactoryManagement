package main.javacode.database;

import java.sql.ResultSet;

public interface InterfaceData {
    public abstract ResultSet query(String table);
    public abstract void insertInto(ObjectWorker ow);
    public abstract void insertInto(ObjectExpense oe);
    public abstract void insertInto(ObjectWarehouse owh);
    public abstract void update(ObjectWorker ow, int i);
    public abstract void update(ObjectExpense oe, int i);
    public abstract void update(ObjectWarehouse owh, int i);
    public abstract void delete(ObjectWorker ow, int i);
    public abstract void delete(ObjectExpense oe, int i);
    public abstract void delete(ObjectWarehouse owh, int i);
}
