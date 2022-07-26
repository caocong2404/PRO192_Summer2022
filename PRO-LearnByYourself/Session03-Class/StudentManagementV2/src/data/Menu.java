package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    
    public void showMenu() {
        int choice;
        
        Cabinet list = new Cabinet();
        do {
            System.out.println("1. Add new student.");
            System.out.println("2. Search student by StudentID.");
            System.out.println("3. Update name and mark student by StudentID.");
            System.out.println("4. Remove studentID.");
            System.out.println("5. Show all student.");
            System.out.println("0. Exit.");
            choice = getChoice();
            switch (choice) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.searchStudent();
                    break;
                case 3:
                    list.updateStudent();
                    break;
                case 4:
                    list.removeStudent();
                    break;
                case 5:
                    list.printStudent();
                    break;
            }
        } while (choice != 0);

    }

    public int getChoice() {
        int chose;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter option: ");
                chose = Integer.parseInt(scanner.nextLine());
                if (chose < 0 || chose > 5) {
                    System.out.println("Invalid chose!");
                    continue;
                }
                break;
            } catch (Exception exception) {
                System.out.println("Invalid.");
            }
        } while (true);
        return chose;
    }
}
