package main;

import data.Circle;
import data.Retangle;
import data.Square;
import java.util.Scanner;

public class GeoGraphicManagement {

    public static void main(String[] args) {
        // TODO code application logic here
//        Retangle arrRec[] = new Retangle[3];
//        arrRec[0] = new Retangle("CHA", 5, 5, "BLUE");
//        arrRec[1] = new Square(name, 0, color);

        int exit = 1;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Choose in range [1..4]");
            System.out.println("1. Retangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            Scanner c = new Scanner(System.in);
            int choice = c.nextInt();
            
            switch (choice) {
                case 1:
                    inputRetangle();
                    break;

                case 2:
                    inputSquare();
                    break;

                case 3:
                    inputCircle();
                    break;

                default:
                    exit = 3;
                    System.out.println("See you next time!!");
                    break;
            }
        } while (exit != 3);

    }

    public static void inputRetangle() {
        String name, color;
        double length, width;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input length: ");
                length = Double.parseDouble(sc.nextLine());

                System.out.print("Input width: ");
                width = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter again!!");
            }
        }

        System.out.print("Input color: ");
        color = sc.nextLine().toUpperCase();

        Retangle scz = new Retangle(name, length, width, color);
        System.out.println("This is profile Retangle: \n" + scz.toString());
    }

    public static void inputSquare() {
        String name, color;
        double size;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input size: ");
                size = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter again!!");
            }
        }

        System.out.print("Input color: ");
        color = sc.nextLine().toUpperCase();

        Square scz = new Square(name, size, color);
        System.out.println("This is profile Square: \n" + scz.toString());
    }

    public static void inputCircle() {
        String name, color;
        double radius;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input radius: ");
                radius = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter again!!");
            }
        }

        System.out.print("Input color: ");
        color = sc.nextLine().toUpperCase();

        Circle scz = new Circle(name, radius, color);
        System.out.println("This is profile Circle: \n" + scz.toString());
    }
}
