package Com;

public class Car{

    String carID;
    Brand brand;    
    String color;
    String frameID;
    String engineID;
    public String patternF = "F\\d{4}";
    public String patternE = "F\\d{4}";

    public Car() {
    }

    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = patternF;
        this.engineID = patternE;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameID() {
        return frameID;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return "Car{" + "carID=" + carID + ", brand=" + brand + ", color=" + color + ", frameID=" + frameID + ", engineID=" + engineID + '}';
    }
   
}
