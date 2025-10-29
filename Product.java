package Abstract;

public abstract class Product {
private String name;
private  double price;
//--------***
public abstract double getDiscount();
public  abstract String toString();
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
