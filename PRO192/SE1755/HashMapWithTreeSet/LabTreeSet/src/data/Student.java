package data;

import java.util.Comparator;

public class Student implements Comparable<Object>{

    private int studentID;
    String studentName;
    private int age;

    public Student() {
    }

    public Student(int studentID, String studentName, int age) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("StudentID = %-2d | StudentName = %-10s | Age = %-2d", studentID, studentName, age);
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student)o;
        int result = studentID - st.getStudentID();
        if (result > 0)
            return 1;
        else if (result == 0)
        { 
            if (studentName.equalsIgnoreCase(st.studentName) == true)
                return age - st.getAge();
            else
                return studentName.compareTo(st.studentName);
        }
            else return -1;
    }
//    public static Comparator cs = new Comparator() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            Student s1 = (Student) o1;
//            Student s2 = (Student) o2;
//            return s1.getStudentName().compareToIgnoreCase(s2.studentName);
//        }
//    };
    
    
}
