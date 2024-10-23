
public class SpecSpeaker extends Speaker {

    String sound;

    public SpecSpeaker() {
    }

    public SpecSpeaker(String name, int power, String sound) {
        super(name, power);
        this.sound = sound;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + this.power + ", " + super.getPower();
    }

    public void setData() {
        super.setName(super.getName().substring(1));
    }

    public String getValue() {
        if (super.getPower() > 10) {
            return sound + super.getPower();
        } else {
            return sound;
        }

    }
}
