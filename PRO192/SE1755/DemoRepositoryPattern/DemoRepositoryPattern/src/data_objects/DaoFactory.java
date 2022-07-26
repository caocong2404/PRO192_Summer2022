
package data_objects;


public class DaoFactory implements IDaoFactory {

    @Override
    public IStudentDao studentDao() {
        return new StudentDao();
    }
    
}
