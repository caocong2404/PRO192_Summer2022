package demohashsetwithobject;

import data.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class DemoComparator {

    public static void main(String[] args) {
        ArrayList<Employee> arl = new ArrayList<>();
        arl.add(new Employee("ID004", "Chaitanya", 25));
        arl.add(new Employee("ID003", "Rahul", 28));
        arl.add(new Employee("ID001", "Ajeet", 25));
        System.out.println("Sorting on IDs ascending");
        Collections.sort(arl);
        
        for (Employee str : arl) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("Sorting on descending Salary then ascending IDs");
        Collections.sort(arl, new Comparator<Employee> () {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() - o2.getSalary() == 0)
                    return o1.getId().compareTo(o2.getId());
                return (-1)*(o1.getSalary() - o2.getSalary());
            }
        });
        
        for (Employee x : arl) {
            System.out.println(x);
        }
    }

}
