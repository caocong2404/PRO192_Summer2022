package collectiondemo;

import data.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        HashSet hs = new HashSet();
        TreeSet ts = new TreeSet();
        Vector v = new Vector();
        Random rd = new Random();

//        for (int i = 0; i <= 10; i++) { //1-50
//            ar.add(rd.nextInt(50) + 1);
//            v.add(rd.nextInt(50) + 1);
//        }
        ts.add(new Student("111", "A", 0));
        ts.add(new Student("222", "B", 0));
        ts.add(new Student("333", "C", 0));
        ts.add(new Student("444", "D", 0));

        System.out.println("hs = " + hs);
        System.out.println("v = " + v);
        System.out.println();

        Collections.sort(ts, new Comparable<Object> {
            
        @Override
            public int compareTo(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        System.out.println("After sorting: " + hs);
        System.out.println();

        System.out.println("------------!NEW!-------------");

    }

}
