package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    
    
    public static List<String> menuOption() {

        List<String> list = new ArrayList<>();
        //1
        list.add("List all brands");
        //2
        list.add("Add a new brand");
        //3
        list.add("Search a brand based on its ID");
        //4
        list.add("Update a brand");
        //5
        list.add("Save brands to the file, named brands.txt");
        //6
        list.add("List all cars in ascending order of brand names");
        //7
        list.add("List cars based on a part of an input brand name");
        //8
        list.add("Add a car");
        //9
        list.add("Remove a car based on its ID");
        //10
        list.add("Update a car based on its ID");
        //11
        list.add("Save cars to file, named cars.txt");

        return list;
    }
    
    public static int int_getChoice(List<String> options) {
        int response;
        for (int i = 0; i < options.size(); i++) {
            //System.out.println((i + 1) + "-" + options.get(i));
            System.out.printf("%-2d  -  %s\n", (i + 1), (options.get(i)));
        }

        while (true)
           try {
            System.out.print("Please choose an option 1..." + options.size() + ": ");
            response = Integer.parseInt(sc.nextLine());
            break;
        } catch (Exception e) {
            System.out.println("Option is number. Please enter again!!");
        }
        return response;
    }

    public static int int_getChoice(BrandList options) {
        int response;
        for (int i = 0; i < options.size(); i++) {
            System.out.println("-----(" + (i + 1) + ")-----\n"+ options.get(i));
            System.out.println();
        }
       
        while (true)
           try {
               System.out.println("Choose Brand ID");
               System.out.print("Please choose 1..." + options.size() + ": ");
               response = Integer.parseInt(sc.nextLine());
            break;
        } catch (Exception e) {
            System.out.println("Option is number. Please enter again!!");
        }
        return response;
    }

    public static Brand ref_getChoice(BrandList options) {
        int choice;
        System.out.println("Here the brand list: ");
        do {
            //choose the brand
            choice = int_getChoice(options);
        } while (choice <= 0 || choice > options.size());

        return options.get(choice - 1);
    }

}
