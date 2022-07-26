
package inheritence;

import data.Box;
import data.Retangle;


public class Inheritence {

    
    public static void main(String[] args) {
        
        Retangle a = new Retangle(5, 4);
        a.output();
        System.out.println(a.getArea());
        
        Retangle b = new Box(4, 5, 6);
        b.output();
        System.out.println(b.getArea());
        
        Box c = new Box(3, 4, 5);
        c.output();
        System.out.println(c.getArea());
    }
    
}
