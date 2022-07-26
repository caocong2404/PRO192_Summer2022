package assignment;

import java.util.Scanner;

public class Inputter {

    private static Scanner sc = new Scanner(System.in);


    public static int getAnInterger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.err.println(errorMsg);
            }
        }
    }
    
    public static int getAnInteger(String inputMsg, String errorMsg, int minValue, int maxValue) {
        int n;
        //swap
        if (minValue > maxValue) {
            int t = minValue;
            minValue = maxValue;
            maxValue = t;
        }

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < minValue || n > maxValue) {
                    throw new Exception();
                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.println(errorMsg);
            }

        }
    }

    public static String getString(String inputMsg, String errorMsg) {
        String id;

        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();
            if (id.length() == 0 || id.isEmpty()) {
                System.err.println(errorMsg);
            } else {
                return id;
            }
        }
    }

}
