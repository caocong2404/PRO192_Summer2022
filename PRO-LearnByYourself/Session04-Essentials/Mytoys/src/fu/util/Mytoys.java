
package fu.util;

import java.util.Scanner;

public class Mytoys {
    
    public static final double PI = 3.1234567;
    public static final double VAT = 0.1;
    //pulic cho thien ha dung
    
    //DI: Dependency Injection
    public static int getAnInterger(){
        int n; // bien trung gian hung tu ban phim go gi
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
        } while(true);
        
    }
    
    private static Scanner sc = new Scanner(System.in);//CASE 2
    //private cho nhu cau dung ben trong 
    
    
    public static int getAnInterger(String inputMsg){
        
        int n; // bien trung gian hung tu ban phim go gi
        //Scanner sc = new Scanner(System.in); CASE 1!
        do {
            try {
                System.out.print(inputMsg);
                //n = sc.nextInt() troi lenh
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Enter again!!");
            }
        } while(true);
        
    }
}
   