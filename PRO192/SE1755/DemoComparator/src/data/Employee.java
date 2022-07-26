package data;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable {
    
    private String id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }

    

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Employee)o).id);
    }
    
//    public static Comparator cpEmployee = new Comparator() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            Employee e1 = (Employee)o1;
//            Employee e2 = (Employee)o2;
//            if (e1.salary - e2.salary == 0)
//                return e1.id.compareTo(e2.id);
//            else  return (-1)*(e1.salary - e2.salary);
//        }
//    };   
    


}
