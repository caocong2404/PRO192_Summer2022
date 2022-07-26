package checkprime;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        int n;
        boolean result;
        String choice;
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("OUT: Y/N: ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.print("Input the number: ");
            }
            n = Integer.parseInt(sc.nextLine());
            result = checkPrime(n);
            checkPrime(result, n);

        }
    }

    public static void checkPrime(boolean result, int n) {
        if (result == true) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n == 3) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
