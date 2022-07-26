
package data_objects;

import java.util.List;
import bussiness_object.Student;


public interface IStudentDao {
    
    public List<Student> getAllStudents();
    public Student getStudent(int id);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
    
}
