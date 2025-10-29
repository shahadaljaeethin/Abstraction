package Abstract;

public class Book extends Product{
private String author;

    public Book(String name, double price  ,String author) {
        super.setName(name); super.setPrice(price);
        this.author = author;
    }

    public double getDiscount(){
    //all Books have 10% Discount
        return (super.getPrice()-(super.getPrice()*0.1));
    }
    @Override
    public String toString() {
        return "Movie{" +"price: "+super.getPrice() +", Name: "+super.getName()+"author:" + author+'}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
