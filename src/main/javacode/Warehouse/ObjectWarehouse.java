package main.javacode.Warehouse;

import java.io.Serializable;

public class ObjectWarehouse implements Serializable {
    private String ID;
    private String name;
    private double quantity;
    private boolean status;
    public ObjectWarehouse() {
        this.ID = null;
        this.name = null;
        this.quantity = 0.0;
        this.status = false;
    }
    public ObjectWarehouse(String ID, String name, double quantity, boolean status) {
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
