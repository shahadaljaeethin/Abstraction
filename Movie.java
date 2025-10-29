package Abstract;

public class Movie extends Product{
private String director;
public double getDiscount(){
//all Movies have 25% Discount
return (super.getPrice()-(super.getPrice()*0.25));
}
//----


    @Override
    public String toString() {
        return "Movie{" +
                 "price: "+super.getPrice() +", Name: "+super.getName()+"director: " + director+
                '}';
    }

    public Movie(String name, double price  , String director) {
        super.setName(name); super.setPrice(price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
