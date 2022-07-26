
package data;

public class Circle {
    private String name;
    private double radius;
    private String color;
    
    public Circle (String name, double radius, String color){
        this.name = name;
        this.radius = radius;
        this.color = color;
    }
    
    public double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public void paint(){
        System.out.printf("\n%-8s|%4.1fcm|%-8s\n", name, radius, color);
    }

    @Override
    public String toString() {
        return String.format("%-8s|%4.1fcm|%-8s", name, radius, color);
    }
    
}
