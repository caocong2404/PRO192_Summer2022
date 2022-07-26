
package data;


public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c;
    //private double area;

    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    
    public double getArea(){
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
    public void paint(){
        System.out.printf("\nTRIANGLE    |%s|%s |a: %-4.1f|b: %-4.1f|c: %-4.1f|Area: %-4.1f|", 
                            owner, color, a, b, c, getArea());
    }
    
    
    
    
}
