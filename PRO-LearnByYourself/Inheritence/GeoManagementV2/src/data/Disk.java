
package data;


public class Disk extends Shape {
    
    private double radius;
    private String smile;
    public final double PI = 3.14;

    public Disk(String owner, String color, String borderColor, String smile, double radius ) {
        super(owner, color, borderColor);
        this.radius = radius;
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }
    
    @Override
    public double getArea(){
        return PI * Math.pow(radius, 2);
    }
    
    @Override
    public double getPerimeter(){
        return 2 * PI * radius;
    }
    
    @Override
    public void paint(){
        System.out.printf("%-10s|%-10s|%-10s|%-10s|%4.1f|%3s |%7.2f|\n"
                            , "DISK", owner, color, borderColor, radius, smile, getArea());
    }
    
    
}
