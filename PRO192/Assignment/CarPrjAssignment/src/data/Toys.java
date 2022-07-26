package data;

import java.util.Scanner;

public class Toys {

    private static Scanner sc = new Scanner(System.in);


    public static String getStringbyFormat(String inputMsg, String errorMsg, String format) {
        String id;

        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            if (!id.matches(format)) {
                System.out.println(errorMsg);
            } else {
                return id;
            }
        }
    }

}
