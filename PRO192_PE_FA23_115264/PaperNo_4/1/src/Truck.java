
public class Truck {

    private String name;
    private int weight;

    public Truck() {
    }

    public Truck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        String s = ""+this.name.charAt(2)+ this.name.charAt(1);
        return s;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight + name.length();
    }
    
}
