
public class SpecCar extends Car {
    int type;

    public SpecCar() {
    }

    public SpecCar(String maker,  int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.getMaker()+ ", "+ super.getPrice()+ ", "+ this.type;
    }
    
    public void setData(){
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(super.getPrice() + 20);
    }
    public int getValue(){
        int inc;
        if(this.type<7){
            inc = 10;
        }else{
            inc = 15;
        }
        return super.getPrice() + inc;
    }
}
