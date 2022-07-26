package data;

import java.util.Objects;

public class Employee implements Comparable {

    private String name;
    private int id;

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + '}';
    }
    
    //Dung 2 ham nay thi se khong nhan id trung
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee emp = (Employee) obj;
        return emp.getId() == id
                && emp.getName().equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Object o) {
        Employee s = (Employee) o;
       return id - s.getId();
    }

}
