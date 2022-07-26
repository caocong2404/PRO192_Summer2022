
package data;

import java.util.Scanner;


public class Retangle {
    
    protected double length;
    protected double width;

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Retangle() {
    }
    
    public void input(){
        double width, length;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input width: ");
        width = Double.parseDouble(sc.nextLine());
        
        System.out.print("Input length: ");
        length = Double.parseDouble(sc.nextLine());
    }
    
    public void output(){
        System.out.printf("|%-8s|%4.1f|%4.1f\n", "RETANGLE", width, length);
    }
    
    public double getArea(){
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
    
}
