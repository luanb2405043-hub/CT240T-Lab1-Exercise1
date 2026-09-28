import java.util.*;
public abstract class Product {
    private String id;
    private String name;
    private double price;
    public Product() {
        this.id = new String("");
        this.name = new String("name");
        this.price = 0;
    }
    public Product(String id, String name, double price) {
        this.id = new String(id);
        this.name = new String(name);
        this.price = price;
    }
    public abstract double calculateFinalPrice(

    );
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setId(String id) {
        this.id = new String(id);
    }
    public void setName(String name) {
        this.name = new String(name);
    }
    public void setPrice(double price) {
        this.price = price;
    }

}