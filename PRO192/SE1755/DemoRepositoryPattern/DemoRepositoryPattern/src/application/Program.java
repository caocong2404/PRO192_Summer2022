
package application;

import java.util.List;
import action_service.Service;
import bussiness_object.Student;


public class Program {
    
    static void printList(List<Student> list){
        for (Student student : list) {
            System.out.println(student);
        }
    }
    
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println("********Student List********");
        printList(service.getAllStudents());
        System.out.println("********Update Student********");
        Student student = service.getStudent(1);
        student.setName("David");
        service.updateStudent(student);
        printList(service.getAllStudents());
        System.out.println("********Delete Student********");
        service.deleteStudent(student);
        printList(service.getAllStudents());
    }
}
