
package data;


public class Student {
    
    private String id, name, course;
    private int semester;

    public Student() {
    }

    public Student(String id, String name, String course, int semester) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return String.format("|%-8s|%-20s|%-8s|%-3d|\n", id, name, course, semester);
    }
    
    public void showProfile(){
        System.out.printf("|%-8s|%-20s|%-8s|%-3d|\n", id, name, course, semester);
    }
    
    
    
    
    
    
    
}
