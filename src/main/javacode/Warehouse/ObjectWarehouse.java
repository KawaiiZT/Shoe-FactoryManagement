package main.javacode.Warehouse;

public class ObjectWarehouse<T> {
    private String ID;
    private String name;
    private T quantity;
    private boolean status;
    public ObjectWarehouse() {
        this.ID = null;
        this.name = null;
        this.quantity = null;
        this.status = false;
    }
    public ObjectWarehouse(String ID, String name, T quantity, boolean status) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.status = status;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
