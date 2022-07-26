package main;

import data.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class DemoHashSetWithObject {

    public static void main(String[] args) {
        Set<Employee> list = new HashSet();
        list.add(new Employee(3, "a"));
        list.add(new Employee(1, "b"));
        list.add(new Employee(2, "c"));
        list.add(new Employee(4, "d"));
        list.add(new Employee(2, "c"));
        
        for (Employee x : list) {
            System.out.println(x);
        }
        
        //Create ArrayList and store HashSet contents
        List<Employee> alEmp = new ArrayList<Employee>(list);
        System.out.println("********************");
        Collections.sort(alEmp);
        for (Object x : alEmp) {
            System.out.println(x);
        }
    }

}
