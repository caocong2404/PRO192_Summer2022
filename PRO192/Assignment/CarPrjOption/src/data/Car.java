package data;

public class Car implements Comparable<Car> {

    String carID;
    Brand brand;
    String color;
    String frameID;
    String engineID;

    public Car() {
    }

    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
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

    public void screenString() {
        System.out.printf("|%-5s|%-6s|%-5s|%-5s|-%5s|\n", carID, brand.getBrandID(), color, frameID, engineID);
    }

    @Override
    public String toString() {
        return "CarID = " + carID + "\n" + brand + "\nColor = " + color + "\nFrameID = " + frameID + "\nEngineID = " + engineID;
    }

    @Override
    public int compareTo(Car o) {
        int result = this.getBrand().getBrandName().compareTo(o.getBrand().getBrandName());
        if (result == 0) {
            result = this.getCarID().compareTo(o.getCarID());
        }
        return result;
    }

}
