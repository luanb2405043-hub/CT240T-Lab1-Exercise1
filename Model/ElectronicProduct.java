import java.util.*;
public class ElectronicProduct extends Product implements Discountable {
    private int warrantyMonths;
    public ElectronicProduct() {
        super();
        warrantyMonths = 0;
    }
    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    public double calculateFinalPrice() {
        return getPrice()*1.1;
    }
    public void applyDiscount(double percent) {
        setPrice(super.getPrice()*(1-percent));
    }

}