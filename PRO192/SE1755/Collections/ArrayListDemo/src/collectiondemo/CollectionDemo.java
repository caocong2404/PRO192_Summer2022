package collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

class Point {

    int x, y;

    Point() {
        x = 0;
        y = 0;
    }
    
    Point(int xx, int yy){
        x = xx; y = yy;
    }
    
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
}

public class CollectionDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(15);
        v.add("Hello");
        v.add(new Point());
        v.add(new Point(5, -7));
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
        
        v.parallelStream().forEach(System.out::println);
        
        Integer b = new Integer(0);
        Integer c = new Integer(0);
        System.out.println(b==c); 
//        System.out.println();
//        for (int i = 0; i < v.size(); i++) {
//            if (i == (v.size() - 1))
//                System.out.println(v.get(i));
//            else
//                System.out.println(v.get(i) + ", ");
//        }
    }

}
