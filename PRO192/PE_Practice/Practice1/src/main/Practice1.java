package main;

import data.Test1;
import data.Test2;
import data.Test3;
import data.Test4;


public class Practice1 {
    
    public static void main(String[] args) {
        System.out.println("F1");
       Test1 test1 = new Test1();
       System.out.println(test1.F1("xin chao cac ban"));
       
        System.out.println("\nF2");
        Test2 test2 = new Test2(); 
        test2.F2("xin chao cac ban");
        
        System.out.println("\nF3");
        Test3 test3 = new Test3(); 
        test3.F3("xin chao ban an");
        
        System.out.println("\nF4");
        Test4 test4 = new Test4(); 
        System.out.println(test4.F4("1hUH21KK35"));
        
        
    }
}
