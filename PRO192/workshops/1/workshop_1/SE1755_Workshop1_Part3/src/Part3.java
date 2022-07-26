
import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number student: ");
        int count = sc.nextInt();
        //int count = Integer.parseInt(sc.nextLine());
        System.out.println("Number student is " + count);
        String name[] = new String[count];
        sc.nextLine();
        for (int i = 0; i < name.length; i++) {
            System.out.print("Input student #" + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
        System.out.println("");
        for (String x : name) {
            System.out.println(x.toUpperCase());
        }
    }
}
