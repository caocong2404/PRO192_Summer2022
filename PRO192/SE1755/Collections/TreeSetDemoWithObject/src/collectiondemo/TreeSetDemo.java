package collectiondemo;

import data.Customer;
import data.Student;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Customer> list = new TreeSet<>();
        list.add(new Customer(3, "A"));
        list.add(new Customer(1, "B"));
        list.add(new Customer(5, "C"));
        list.add(new Customer(4, "D"));
        list.add(new Customer(2, "C"));
        list.add(new Customer(3, "C"));
        
        for (Customer s : list) {
            System.out.println(s);
        }
        
        Iterator iter = list.iterator();
        System.out.println("\nITERATOR!!!!");
        while (iter.hasNext()) {
            Customer cus = (Customer)iter.next();
            System.out.println("ID = " + cus.getId() + ", Name = " + cus.getName());
        }
        
        System.out.println("-------------------TREESET SORT-------------------------\n");
        int id;
        Random r = new Random();
        TreeSet myset = new TreeSet();
        for (int i = 0; i < 10; i++) {
            id = r.nextInt(50);
            Student st = new Student(id, "Nguyen Van " + (i + r.nextInt(20)));
            myset.add(st);
        }
        
        iter = myset.iterator();
        while (iter.hasNext()) {
            Student st = (Student)iter.next();
            System.out.println("ID = " + st.getId() + ", Name = " + st.getName());
        }
        

    }

}
