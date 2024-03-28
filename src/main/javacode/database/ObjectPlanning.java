package main.javacode.database;

public class ObjectPlanning<T> {
    private String item;
    private String materials_name;
    private T quantity;
    private T ratio;
    private T materials_total;
    private T price;
    private T summary;
    private String check;
    public ObjectPlanning() {
        item = null;
        materials_name = null;
        quantity = null;
        ratio = null;
        materials_total = null;
        price = null;
        summary = null;
        check = null;
    }
    public ObjectPlanning(String item, String materials_name, T quantity, T ratio, T materials_total, T price, T summary, String check) {
        this.item = item;
        this.materials_name = materials_name;
        this.quantity = quantity;
        this.ratio = ratio;
        this.materials_total = materials_total;
        this.price = price;
        this.summary = summary;
        this.check = check;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getMaterials_name() {
        return materials_name;
    }
    public void setMaterials_name(String materials_name) {
        this.materials_name = materials_name;
    }
    public T getQuantity() {
        return quantity;
    }
    public void setQuantity(T quantity) {
        this.quantity = quantity;
    }
    public T getRatio() {
        return ratio;
    }
    public void setRatio(T ratio) {
        this.ratio = ratio;
    }
    public T getMaterials_total() {
        return materials_total;
    }
    public void setMaterials_total(T materials_total) {
        this.materials_total = materials_total;
    }
    public T getPrice() {
        return price;
    }
    public void setPrice(T price) {
        this.price = price;
    }
    public T getSummary() {
        return summary;
    }
    public void setSummary(T summary) {
        this.summary = summary;
    }
    public String getCheck() {
        return check;
    }
    public void setCheck(String check) {
        this.check = check;
    }
}
