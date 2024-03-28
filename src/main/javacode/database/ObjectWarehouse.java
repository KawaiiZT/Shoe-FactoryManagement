package main.javacode.database;

public class ObjectWarehouse<T> {
    private String name;
    private T quantity;
    private boolean status;
    public ObjectWarehouse() {
        this.name = null;
        this.quantity = null;
        this.status = false;
    }
    public ObjectWarehouse(String name, T quantity, boolean status) {
        this.name = name;
        this.quantity = quantity;
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public T getQuantity() {
        return quantity;
    }
    public void setQuantity(T quantity) {
        this.quantity = quantity;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
