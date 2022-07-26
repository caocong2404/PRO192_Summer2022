
package bai1;

import java.util.Scanner;


public class Bai1 {


    public static void main(String[] args) {
        System.out.println("Input a: ");
        int a = getInteger();
        System.out.println("Input b: ");
        int b = getInteger();
        
        
                
    }
    
    public static int getInteger(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }
    
}
