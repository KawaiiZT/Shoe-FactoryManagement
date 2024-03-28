package main.javacode.database;

import java.sql.ResultSet;

public interface InterfaceData {
    public abstract ResultSet query(String table);
    public abstract void insertInto(ObjectWorker ow);
    public abstract void insertInto(ObjectExpense<Integer> oe);
    public abstract void insertInto(ObjectWarehouse<Integer> owh);
    public abstract void update(ObjectWorker ow, int i);
    public abstract void update(ObjectExpense<Integer> oe, int i);
    public abstract void update(ObjectWarehouse<Integer> owh, int i);
    public abstract void delete(ObjectWorker ow, int i);
    public abstract void delete(ObjectExpense<Integer> oe, int i);
    public abstract void delete(ObjectWarehouse<Integer> owh, int i);
}
