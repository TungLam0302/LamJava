
public class SpecTrain extends Train {

    private int load;

    public SpecTrain() {
    }

    public SpecTrain(String name, String type, int load) {
        super(name, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + this.load + ", " + super.getType();
    }

    public void setData() {
        super.setName(super.getName().substring(1));
    }

    public int getValue() {
        int count = 0;
        for (int i = 0; i < super.getType().length(); i++) {
            Character ch = super.getType().charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        if (count == 1) {
            return this.load * super.getName().length();
        } else {
            return this.load;
        }
    }
}
