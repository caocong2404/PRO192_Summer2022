
package studentmanagement;

import data.Cabinet;



public class StudentManagement {


    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        Cabinet ai = new Cabinet();
        
        se.addStudent();
        se.printStudent();
        se.removeStudent();
    }
    
}
