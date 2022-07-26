
package action_service;

import java.util.List;
import bussiness_object.Student;

public interface IService {
    
    void deleteStudent(Student student);
    List<Student> getAllStudents();
    Student getStudent(int id);
    void updateStudent(Student student);
}
