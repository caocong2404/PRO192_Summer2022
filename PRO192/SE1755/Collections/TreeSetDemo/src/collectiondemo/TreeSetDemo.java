package collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(5);
        t.add(2);
        t.add(9);
        t.add(30);
        t.add(9);
        System.out.println(t);
        t.remove(9);
        System.out.println(t);
        Iterator it = t.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

    }

}
