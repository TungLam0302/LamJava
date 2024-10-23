
public class Tofu {
    String maker;
    int quantity;

    public Tofu() {
    }

    public Tofu(String maker, int quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }

    public String getMaker() {
        String s = maker.substring(0, 1).toUpperCase() + maker.substring(1, maker.length()-1).toLowerCase()+ maker.substring(maker.length()-1).toUpperCase();
        return s;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
