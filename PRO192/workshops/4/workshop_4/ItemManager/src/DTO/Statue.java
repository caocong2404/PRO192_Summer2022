
package DTO;

import java.util.Scanner;


public class Statue extends Item {
    
    private int height;
    private String color;

    
    
    public Statue(int value, String creator, int height, String color) {
        super(value, creator);
        this.height = height;
        this.color = color;
    }

    public Statue() {
        super();
    }
    
    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        super.inputItem();
        
        //input height
        while (true) {
            try {
                do {
                    System.out.print("Input the height: ");
                    height = Integer.parseInt(sc.nextLine());
                    if (height <= 0) {
                        System.out.println("Enter again!! (height > 0)");
                    }
                } while (height <= 0);
                break;
            } catch (Exception e) {
                System.out.println("Enter again!! Height does not contain WORD!!");
            }
        }

        System.out.print("Input the color: ");
        color = sc.nextLine();

    }
    
    
    public void outputStatue(){
        System.out.printf("|%-10s|%4d|%-10s|%4d|%-10s|\n", 
                              "STATUS", value, creator, height, color);
    }
    
}
