package samurai;

import java.util.Scanner;

public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputProfile();
    }

    public static void inputProfile() {
        //ko OOP, chi can hieu ve viec nhap info truoc da, ko choi class student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter again!!");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("");
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("yob: " + yob);
        System.out.println("Address: " + address);

    }
}
