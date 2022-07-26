package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {

    private List<Student> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Cabinet() {
    }
    
    public List<Cabinet> createACabinet(){
        List<Cabinet> list = new ArrayList<>();
        return list;
    }
    
    public void inputStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.print("Input id: ");
        id = sc.nextLine().trim().toUpperCase();

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
    }

    public List<Student> initData() {
        String id, name;
        int yob;
        double gpa;

        List<Student> arr = new ArrayList<>();

        System.out.print("Input id: ");
        id = sc.nextLine().trim().toUpperCase();

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));

        return arr;
    }

    public void addStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" + (arr.size() + 1) + ": ");

        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();
            Student xxx = searchStudent(id);
            if (xxx == null) {
                break;
            } else {
                System.out.println("Duplicated ID. Try with another one!!!\n");
            }
        }

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully!!");

    }

    public void printStudent() {
        if (arr.isEmpty()) {
            System.out.println("The student is empty!!");
            return;
        }

        System.out.println("There is/are " + (arr.size()) + " student(s) in a list:");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public Student searchStudent(String id) {

        if (arr.isEmpty()) {
            return null;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (id.equalsIgnoreCase(arr.get(i).getId())) {
                return arr.get(i);
            }
        }
        return null;
    }

    public void searchStudent() {
        String keyword;
        System.out.print("Input the id to search: ");
        keyword = sc.nextLine();
        Student xxx = searchStudent(keyword);
        if (xxx == null) {
            System.out.println("NOT FOUND!!");
        } else {
            System.out.println("Here he/she is: ");
            xxx.showProfile();
        }

    }

    public void updateStudent() {
        
        System.out.print("Input the student ID you want to update info: ");
        String keyword = sc.nextLine();
        
        Student xxx = searchStudent(keyword);

        if (xxx == null) {
            System.out.println("NOT FOUND!");
        } else {
            System.out.println("FOUND. The student profile before updating: ");
            xxx.showProfile();
            System.out.print("Input a new GPA: ");
            xxx.setGpa(Double.parseDouble(sc.nextLine()));
            System.out.println("Update successful!!\n");
            
            System.out.println("The student profile after updating: ");
            xxx.showProfile();
        }
        
        
    }

    public void removeStudent() {
        
        
        System.out.print("Input the student id you want to remove: ");
        String keyword = sc.nextLine();
        Student xxx = searchStudent(keyword);
        
        if (xxx == null ) System.out.println("NOT FOUND!!");
            else {
            System.out.println("Here, the student you want to remove");
            xxx.showProfile();
            System.out.println("Do you want to remove this student");
            System.out.println("YES press 1 \nNO press 0");
            
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Thanks for your choice");
                return;
            }
            else {
                arr.remove(xxx);
                System.out.println("Remove successfully!!");
            }
            
    }
        
    }

}
