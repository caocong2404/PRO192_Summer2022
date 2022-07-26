package pkg3test3;

import data.*;
import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void Execute(int a, int b, Activity m){
        System.out.println(m.calc(a, b));
    }
    
    public static void main(String[] args) {
        
        Execute(5, 9, (x, y) ->  x * y);
        Execute(2, 10, (x, y) -> {
            int s = 0;
            for (int i = x; i <= y; i++) {
                s += i;
            } return s;
        });
//        Activity obj = new Activity() {
//            public void M1() {
//                System.out.println("M1");
//            }
//
//            public void M2() {
//                System.out.println("M2");
//            }
//        };
//        
//        obj.M1();
//        obj.M2();
    }
}
