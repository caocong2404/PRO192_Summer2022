package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static int getChoice(ArrayList options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i));
        }
        System.out.print("Choose 1.." + options.size() + ":");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public static int getChoice(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
        
        System.out.print("Choose 1.." + options.length + ":");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

}
