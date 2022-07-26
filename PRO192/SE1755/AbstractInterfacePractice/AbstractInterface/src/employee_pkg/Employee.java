
package employee_pkg;

import general_pkg.IAction;
import general_pkg.User;


public class Employee extends User implements IAction{
    private String name;
    //constructor

    public Employee() {
    }
    
    public Employee(String id, String password, String name){
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void login() {
        System.out.printf("Employee logged in by name: %s and password: %s\n", name, password);
    }

    @Override
    public void showInfo() {
      System.out.printf("ID: %s, name: %s\n", id, name);
    }
    
    
    
}
