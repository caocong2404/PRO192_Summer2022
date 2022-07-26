package program_pkg;

import customer_pkg.Customer;
import manager_pkg.Manager;
import employee_pkg.Employee;

public class Program {

    public static void main(String[] args) {
        Manager admin = new Manager();
        //create an Employee
        Employee tom = new Employee("Emp001", "123", "Tom");
        admin.addUserToList(tom);
        //create a customer
        Customer david = new Customer("Cus100", "456", "david@gmail.com");
        admin.addUserToList(david);
        //view user list
        System.out.println("*****USER LIST******");
        admin.printList();
        System.out.println("*****LOGIN INFO******");
        admin.showLoginStatus();
    }

}
