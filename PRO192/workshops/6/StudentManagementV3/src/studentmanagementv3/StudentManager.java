package studentmanagementv3;

import data.*;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String option[] = {"1-Add new student", "2-Search a student",
            "3-Update name and mark", "4-Remove a student ",
            "5-List all", "Other-Quit"};

        int choice = 0;
        StudentList list = new StudentList();
        
        do {
            System.out.println("-----------------------------");
            System.out.println("Student managing Program");
            System.out.println("-----------------------------");
            choice = Menu.getChoice(option);
            switch (choice) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.addsStudent();
                    list.printAll();
                    list.searchByPartOfName();
                    break;
                case 3:
                    list.updateStudent();
                    break;
                case 4:
                    list.removeStudent();
                    break;
                case 5:
                    list.printAll();
                    break;
                default:
                    System.out.println("Bye");
            }

        } while (choice > 0 && choice < 6);
    }
}
