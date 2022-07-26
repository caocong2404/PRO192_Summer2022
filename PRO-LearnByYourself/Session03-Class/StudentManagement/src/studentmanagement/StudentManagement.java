
package studentmanagement;

import data.Student;
import java.util.Scanner;


public class StudentManagement {


    public static void main(String[] args) {
        saveAStudent();
        //inputAStudent();
    }
    
    public static void inputAStudent(){
        String id, name;
        int yob;
        double gpa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        
        //x.setId nguy hiem. vi ID khong the trung. lam anh huong
    }
    public static void saveAStudent(){
        Student an = new Student("SE161860", "Thai An",2002 , 8.9);
        an.showProfile();
    }
}
