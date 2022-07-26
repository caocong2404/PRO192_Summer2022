
package data;


public class Customer implements Comparable<Object>{
    private String name;
    private int id;

    public Customer() {
    }

    public Customer(int id, String name) {
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
        return "Customer{" + "id = " + id + ", name = " + name  + '}';
    }

    @Override
    public int compareTo(Object o) {
        Customer a = (Customer)o;
        int result;
        result = this.getName().compareTo(a.getName());
        if (result == 0) 
            return this.getId() - a.getId();
        return result;
    }


    
    
    
    
}
