package util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyToys {

    private static Scanner sc = new Scanner(System.in);

    public static String getChoose(String inputMsg, String opOne, String opTwo) {
        String choose;
        while (true) {
            System.out.print(inputMsg);
            choose = (sc.nextLine().trim());
            if (choose.equalsIgnoreCase(opOne)) {
                return opOne;
            } else if (choose.equalsIgnoreCase(opTwo)) {
                return opTwo;
            } else {
                System.err.println("Enter again!!\nChoose (" + opOne + "/" + opTwo + ")");
            }
        }
    }

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
                System.err.println(errorMsg);
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
                System.err.println(errorMsg);
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
                System.err.println(errorMsg);
            }
        }
    }

    public static String getStringbyFormat(String inputMsg, String errorMsg, String format) {
        String id;

        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            if (!id.matches(format)) {
                System.err.println(errorMsg);
            } else {
                return id;
            }
        }
    }

    public static String getMail(String inputMsg, String errorMsg){
        String mail = "";
        while (true) {            
            System.out.print(inputMsg);
            mail = sc.nextLine();
            //dau "+" chu va so dc viet nhieu lan
            Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]{2,}(\\.[a-zA-Z]+){1,3}$");
            if (p.matcher(mail).find()){
                break;
            } else {
                System.err.println(errorMsg);
            }
        }
        return mail;
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

    public static String toUpperFirstLetter(String input) {
        String result = "";
        String arr[] = input.split("\\s+");
        for (String x : arr) {
            result += toUpperOneFirstLetter(x) + " ";
        }
        return result.trim();
    }

    private static String toUpperOneFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    

}
