package labtreeset;

import data.Student;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class LabTreeSet {

    public static void main(String[] args) {
        Random r = new Random();
        TreeSet myset = new TreeSet();

        for (int i = 0; i < 10; i++) {
            int no = r.nextInt(100);
            int age = r.nextInt(60);
            Student st = new Student(i + 1, "Student " + no, age);

            myset.add(st);
        }
        
        myset.add(new Student(11, "TrungTenNe", 16));
        myset.add(new Student(12, "TrungTenNe", 13));
        myset.add(new Student(13, "TrungTenNe", 18));
        
        
        //Collections.sort(myset, Student.cs);
        
        //Using Iterrator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            Student st = (Student) iter.next();
            System.out.println(st);
        }
    }

}
