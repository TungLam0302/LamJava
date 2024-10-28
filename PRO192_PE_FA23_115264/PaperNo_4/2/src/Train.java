
public class Train {

    private String name;
    private String type;

    public Train() {
    }

    public Train(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.type;
    }

}
