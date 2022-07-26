
package data;

import java.util.Scanner;


public class Box extends Retangle {
    
    private double height;

    public Box() {
        super();
    }

    public Box(double width, double length, double height) {
        super(length, width);
        this.height = height;
    }
    
    public void input(){
        super.input();
        double height;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input height: ");
        height = Double.parseDouble(sc.nextLine());
    }
    
    public void output(){
        System.out.printf("|%-8s|%4.1f|%4.1f|%4.1f|\n", "BOX", width, length, height);
    }
    
    public double getArea(){
        return width * length * height;
    }
    
}
