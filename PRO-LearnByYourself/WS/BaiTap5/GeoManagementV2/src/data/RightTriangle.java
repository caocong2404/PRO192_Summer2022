
package data;

public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    
    @Override
    public void paint(){
        System.out.printf("\nRIGHT TRIANGLE    |%s|%s |a: %-4.1f|b: %-4.1f|c: %-4.1f|Area: %-4.1f|", 
                            owner, color, a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)), getArea());
    }
    
    
}
