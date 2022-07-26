
package data;


public class Student implements Comparable{
    private int id;
    private String name;
    
    public Student() {
    }

    public Student(int id, String name) {
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
        return "Student{" + "id = " + id + ", name = " + name + '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        
        if(name.compareToIgnoreCase(s.getName()) > 0)
            return 1;
        else if (name.compareToIgnoreCase(s.getName()) == 0)
            if (id > s.getId()) return 1;
        return -1;
    }
    
    
    
    
}
