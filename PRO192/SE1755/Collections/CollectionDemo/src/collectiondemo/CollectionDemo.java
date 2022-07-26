package collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Vector v = new Vector();
        Random rd = new Random();

        for (int i = 0; i <= 10; i++) { //1-50
            ar.add(rd.nextInt(50) + 1);
            v.add(rd.nextInt(50) + 1);
        }

        System.out.println("ar = " + ar);
        System.out.println("v = " + v);
        System.out.println();

//        ar.add(8);
//        v.add(8);
        //2 tap hop co giao nhau hay khong
        boolean dis = Collections.disjoint(ar, v);
        System.out.println("ar and v disjunct: " + dis);
        System.out.println();

        Collections.addAll(v, ar.toArray());
        System.out.println("Add All , v[v +ar] = " + v);
        System.out.println();

        //min max
        int minVal = (int) Collections.min(v);
        int maxVal = (int) Collections.max(v);
        System.out.println("Min = " + minVal + "; Max = " + maxVal);
        System.out.println();

        //su xuat hien
        int fre = Collections.frequency(v, 8);
        System.out.println("Occurences of 8: " + fre);
        System.out.println();

        Collections.sort(v);
        System.out.println("After sorting: " + v);
        System.out.println();

        //vi tri
        int pos = Collections.binarySearch(v, 8);
        if (pos < 0) {
            System.out.println("Postion of 8: NOT FOUND!!");
        } else {
            System.out.println("Postion of 8: " + (pos + 1));
        }
        System.out.println();

        //xao tron
        Collections.shuffle(v);
        System.out.println("After shuffling, v = " + v);
        System.out.println();

        //thay the
        Collections.fill(v, 9);
        System.out.println("After replacing, v = " + v);

        ArrayList list = new ArrayList<>();
        for (int i = 101; i <= 110; i++) {
            list.add(i);
        }

        System.out.println("------------!NEW!-------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("CUTTTTTTT");
        //using Iterator
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
