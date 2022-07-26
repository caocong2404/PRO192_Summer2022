package DTO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;
    
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    
    public Vase() {
        super();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        
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

        System.out.print("Input the material: ");
        this.material = sc.nextLine();

    }

    @Override
    public void output() {
        System.out.printf("|%-10s|%4d|%-8s|%4d|%-10s|\n"
                ,"VASE", value, creator, height, material);
    }

}
