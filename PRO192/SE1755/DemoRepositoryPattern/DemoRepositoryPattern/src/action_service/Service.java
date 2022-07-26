
package action_service;

import bussiness_object.Student;
import data_objects.DaoFactory;
import data_objects.IDaoFactory;
import data_objects.IStudentDao;
import java.util.List;


public class Service implements IService {
    
    static final IDaoFactory factory = new DaoFactory();
    static final IStudentDao studentDao = factory.studentDao();
    
    //Student
    @Override
    public void deleteStudent(Student student) {
        studentDao.deleteStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
    
}
