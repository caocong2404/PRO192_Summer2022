package data;

import java.util.Scanner;

public class Mytoys {

    private static Scanner sc = new Scanner(System.in);

    public static int getAnInterger() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Input your choice: ");
                //n = sc.nextInt() troi lenh
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Enter again!!");
            }
        } while (true);

    }

    public static int getAnInterger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
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

    public static double getDouble(String inputMsg, String errorMsg) {
        double n;

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static double getDouble(String inputMsg, String errorMsg, double minValue, double maxValue) {
        double n;
        if (minValue > maxValue) {
            double t = minValue;
            minValue = maxValue;
            maxValue = t;
        }

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
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

    public static String getString(String inputMsg, String errorMsg) {
        String id;

        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().toUpperCase().trim();
            if (id.length() == 0 || id.isEmpty()) {
                System.out.println(errorMsg);
            } else {
                return id;
            }
        }
    }

}
