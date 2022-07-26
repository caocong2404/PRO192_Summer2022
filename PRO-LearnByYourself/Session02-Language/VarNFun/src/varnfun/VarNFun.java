
package varnfun;

import java.util.Scanner;
//#include <stdio.h>

/**
 **      @author CONG
 **/
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithVariable();
        playWithInteger();
        playWithDouble();
        playWithCharacter();
        playWithBoolean();
        printIntegerList();
        
        int n = getAPositiveInteger();
        System.out.println("Your number is = " + n);
    }
    
    public static int getAPositiveInteger(){
        System.out.println("------------------------------------");
        int n;
        Scanner banPhimCuaTui = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        
        return n;
    }
    
    public static void printIntegerList(int n){
        System.out.println("------------------------------------");
        System.out.println("The list of " + n + " first integers");
        for (int i = 1; i <= n; i++) {
            //System.out.printf("%d ", i);
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    //in ra cac con so 1 --> 100
    public static void printIntegerList(){
        System.out.println("------------------------------------");
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++)
            System.out.print(i + " ");
    }
    
    public static void playWithBoolean(){
        System.out.println("------------------------------------");
        //C: true 1,    > 0
        //   false 0,   < 0 -> boolean
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("Nice xu");
        else 
            System.out.println("Huhu");
    }
    
    public static void playWithCharacter(){
        System.out.println("------------------------------------");
        char m = '$';
        System.out.println("char m = " + m);
        //tên thì nhieu kí tu phuc tap
        // char name[] = "Ahihi"; 
        
        String name = "Son Tung MTP"; //loai datatype moi hoàn toàn
                                      //phuc tap, do gom n thu khác
                                      //it call "object data type" 
        System.out.println("My idol name: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
        //string.h -> strlwr()...
    }
    
    public static void playWithDouble(){
        System.out.println("------------------------------------");
        double pi = 3.14;
        System.out.println("pi = " + pi);
        System.out.printf("pi = %f\n", pi);//không duoc dùng %lf
        
        float  vat = 0.1F;
        System.out.println("vat = " + vat);
        
    }
    
    public static void playWithInteger(){
        System.out.println("------------------------------------");
        int n = 39; //moi con so, kí tu xuat hien trong code
                    //duoc goi la literal value
                    //so nguyen xuat hien trong code mac dinh la int
        System.out.println("n = " + n);
        
        long m = 3_000_000_000L; // '_' phan cach literal trong code cho de doc
        System.out.println("m = " + m);
        
        int status = 0xFA; //hex FA = 250
        System.out.println("status = " + status);
        
        int octal = 010; //oct 010 = 8
        System.out.println("Octal = " + octal);
    }
    //static thi chi choi voi static - OOP 
    public static void playWithVariable(){
        System.out.println("------------------------------------");
        /*bien la 1 vung RAM chua 1 so byte nhat dinh tuy loai
        du lieu/thong tin no chua ben trong */
        //bien la cach dat ten cho mot dai luong 
        int age = 20;
        int a = 10, b;
        b = 100;
        //ton 12 byte trong RAM. 3 bien age, a, b/ 4 bytes
        //'+' ghep chuoi~
        System.out.println("age: " + age);
        //~printf("age: %d", age);
        int yob = 2001; //year of birth
        age = 2021 - yob;
        System.out.println("age again #1: " + age);
        
        System.out.println("age again #2: " + (2021 - yob));
        
        //code nhu C
        System.out.printf("age printed by using %% as in C: %d\n", (2021 - yob));
        
    }
}
