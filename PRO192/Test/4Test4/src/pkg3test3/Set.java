package pkg3test3;

import data.*;
import java.util.SortedSet;
import java.util.Comparator;

public class Set {

    public static void main(String[] args) {
        SortedSet<String> fruits = new java.util.TreeSet<>(Comparator.reverseOrder());

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        System.out.println("Fruits set: \t\t\t" + fruits);

        fruits.add("Banana");//duplicated
        System.out.println("After duplicate element: \t" + fruits);
        
        fruits.add("banana"); //normal banana
        System.out.println("After add \"banana\" element: \t" + fruits);
        
        fruits.add("BaNAnana");//dif banana
        System.out.println("After add element: \t\t" + fruits);

    }

}
