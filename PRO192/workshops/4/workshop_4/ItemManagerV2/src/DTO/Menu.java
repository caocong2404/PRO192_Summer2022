package DTO;

import GUI.ItemList;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static String options[] = {"Add a new vase", "Add a new statue", "Add a new panting", "Display all items", "Find the item by creator", "Find the item by its index", "Remove the tem by its index",
        "Display the list of vase items", "Sort item in ascending order based on their values", "Exit"};
    
    ItemList list = new ItemList();

    
    public void printMenu() {
        int choice = 0;
        do {
//            System.out.println("1. Add a new vase");
//            System.out.println("2. Add a new statue");
//            System.out.println("3. Add a new painting");
//            System.out.println("4. Display all items");
//            System.out.println("5. Find the items by the creator ");
//            System.out.println("6. Update the item by its index");
//            System.out.println("7. Remove the item by its index");
//            System.out.println("8. display the list of vase items ");
//            System.out.println("9. Sorts items in ascending order based on their values ");
//            System.out.println("10. Exit");
//            System.out.print("input your choice:");
            choice = Menu.getChoice(options);

            switch (choice) {
                case 1:
                    Item tmp = new Vase();
                    tmp.input();
                    if (list.addItem(tmp)) {
                        System.out.println("Added successfully!!\n");
                    }
                    break;
                case 2:
                    tmp = new Statue();
                    tmp.input();
                    if (list.addItem(tmp)) {
                        System.out.println("Added successfully!!\n");
                    }
                    break;
                case 3:
                    tmp = new Painting();
                    tmp.input();
                    if (list.addItem(tmp)) {
                        System.out.println("Added successfully!!\n");
                    }
                    break;
                case 4:
                    list.displayAll();
                    break;
            }
        } while (choice <= 9);
    }

    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }
        System.out.print("Choose 1.." + options.length + ": ");
        return Integer.parseInt(sc.nextLine());
    }

}
