
public class Cake {
    String maker;
    int price;

    public Cake() {
    }

    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        String s = maker.substring(0, maker.length() - 1) + maker.substring(maker.length()-1).toUpperCase();
        return s;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
