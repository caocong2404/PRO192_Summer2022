
package baitap1;

import java.util.Scanner;

/**
 *
 * @author CONG
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n = getInput();
        boolean checkPrime = isPrime(n);
        if (checkPrime == false) 
            System.out.println("This is not prime number");
        else 
            System.out.println("This is prime number");
        printPrime();
        printFirst1000Prime();
        solveSolution();
    }
    
    public static int getInput(){
        int n;
        System.out.print("Input your number: ");
        Scanner myKeyBoard = new Scanner(System.in);
        n = myKeyBoard.nextInt();
        
        return n;
    }
    
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) return false;
        return true;
    }
    
    public static void printPrime(){
        System.out.println("------------------------------------");
        System.out.println("Prime at range 1..1000:");
        int i = 2;
        boolean check;
        while(i <= 1000){
            check = isPrime(i);
            if ( check == true) 
                System.out.print( i + " ");
            ++i;
        }            
        System.out.println("\n");
    }
    
    public static void printFirst1000Prime(){
        System.out.println("------------------------------------");
        int i = 0, count = 0;
        boolean check;
        System.out.println("First 1000 prime:");
        while (count <= 1000 ){
            check = isPrime(i);
            if ( check == true){
                System.out.print(i + " ");
                count++;
            }
            ++i;            
        }
        System.out.println("\n");
    }
    
    public static void solveSolution(){
        System.out.println("------------------------------------");
        double a, b, x;
        Scanner myKeyBoard = new Scanner(System.in);
        
        System.out.println("Equation ax + b = 0 ");
        
        System.out.print("Input a: ");
        a = myKeyBoard.nextDouble();
        
        System.out.print("Input b: ");
        b = myKeyBoard.nextDouble();
        
        System.out.println("The solution x is " + (-1*(b / a)));
        
    }
}

