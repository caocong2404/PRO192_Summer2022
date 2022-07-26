package DTO;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting() {
        super();
    }
    
    
    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
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

        while (true) {
            try {
                do {
                    System.out.print("Input the width: ");
                    width = Integer.parseInt(sc.nextLine());
                    if (width <= 0) {
                        System.out.println("Enter again!! (width > 0)");
                    }
                } while (width <= 0);
                break;
            } catch (Exception e) {
                System.out.println("Enter again!! width does not contain WORD!!");
            }
        }

    }

    @Override
    public void output() {
        System.out.printf("|%-10s|%4d|%-10s|%4d|%4d|%b|%b|\n",
                "PAINTING", value, creator, height, width, isWatercolour, isFramed);
    }

}
