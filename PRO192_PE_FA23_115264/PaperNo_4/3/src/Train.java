
public class Train {
    private String name;
    private int load;

    public Train() {
    }

    public Train(String name, int load) {
        this.name = name;
        this.load = load;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
    
}
