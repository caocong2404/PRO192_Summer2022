package DTO;

import java.util.Scanner;

public class Item {

    protected int value;
    protected String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void inputItem() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                do {
                    System.out.print("Input the value: ");
                    value = Integer.parseInt(sc.nextLine());
                    if (value <= 0) {
                        System.out.println("Enter again!! (value > 0)");
                    }
                } while (value <= 0);
                break;
            } catch (Exception e) {
                System.out.println("Enter again!! Value does not contain WORD!!");
            }
        }

        System.out.print("Input the creator: ");
        creator = sc.nextLine();
    }

    public void outputItem() {
        System.out.printf("|%-10s|%4d|%-8s|", "ITEM", value, creator);
    }

}
