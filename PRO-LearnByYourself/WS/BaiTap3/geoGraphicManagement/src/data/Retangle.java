
package data;

public class Retangle {
    protected String name;
    protected double length;
    private double width;
    protected String color;
    
    public Retangle (String name, double length, double width, String color){
        this.name = name;
        this.length = length;
        this.width = width;
        this.color = color;
    }
    public double getArea(double length, double width){
        return length * width;
    }
    
    public void paint(){
        System.out.printf("\n%-8s|%4.1f x %4.1f |%-8s\n", name, length, width , color);
    }

    @Override
    public String toString() {
        return String.format("%-8s|%4.1f x %4.1f |%-8s", name, length, width , color);
    }
    
}
