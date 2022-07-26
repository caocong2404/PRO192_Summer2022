
package test3;

import data.MyInterface;
import data.firstClass;
import java.util.Scanner;


public class demoInterface {
    
    public static void main(String[] args) {
//        firstClass obj = new firstClass();
//        obj.m2();
//        
//        obj.m3();
//        
//        System.out.println(MyInterface.sqrt(10));
//        
//        MyInterface mi = new firstClass();
//        mi.m2();
//        mi.m3();
        Scanner scan = new Scanner(System.in);
        
        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
