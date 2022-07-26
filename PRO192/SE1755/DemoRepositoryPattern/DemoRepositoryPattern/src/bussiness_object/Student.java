
package bussiness_object;

public class Student extends Person {
    
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-7s | Email: %-20s", id, name, email);
    }
    
    

    
    
    
}
