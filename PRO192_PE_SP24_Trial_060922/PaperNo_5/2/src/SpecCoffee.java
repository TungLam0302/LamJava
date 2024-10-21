
public class SpecCoffee extends Coffee {

    int price;

    public SpecCoffee() {
    }

    public SpecCoffee(String name,int size, int price ) {
        super(name, size);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + super.getSize() + ", " + price;
    }
    
    public void setData(){
        super.setName("CF" + super.getName());
    }
    public int getValue(){
        int x;
        if(super.getSize() > 10){
            x = 0;
        }else{
            x = 5;
        }
        return this.price + x;
    }
}
