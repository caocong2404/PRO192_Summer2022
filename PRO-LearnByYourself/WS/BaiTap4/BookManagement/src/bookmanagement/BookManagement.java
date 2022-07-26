package bookmanagement;

import data.Cabinet;
import java.util.Scanner;

public class BookManagement {

    private int countS = 0;
    private Cabinet x;

    public static void main(String[] args) {
        int choice;
        int outMenu = 0;
        do {
            choice = printMenu();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                default:
                    if (choice == 4) {
                        System.out.println("Have a nice day!");
                        outMenu = 1;
                    } else {
                        System.out.println("Enter again!!");
                        System.out.println("-----------------\n");
                    }
            }
        } while (outMenu == 0);
    }

    public static int printMenu() {
        System.out.println("Wellcome to BOOKSTORE");
        System.out.println("1 - CREATE A BOOKSHELF");
        System.out.println("2 - ADD BOOK IN BOOKSHELF");
        System.out.println("3 - SHOW BOOK IN BOOK SHELF");
        System.out.println("4 - OUT MENU");
        System.out.println("Choose (1..4)");
        System.out.print("Your choice is: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println("Enter a number in range 1..4:");
            }
        } while (true);

        
    }

    public void inputAShelf() {
        String color;
        String label;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input BookShelf color:");
        color = sc.nextLine();
        System.out.print("Input BookShelf label:");
        label = sc.nextLine();

        x = new Cabinet(color, label);

    }

    public void printBookShelf() {
        for (int i = 0; i < countS; i++) {
            x.showProfile();
        }
    }

}
