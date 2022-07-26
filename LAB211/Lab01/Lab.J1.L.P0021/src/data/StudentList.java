package data;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import ui.Menu;
import util.MyToys;

public class StudentList extends ArrayList<Student> {

    /*  add
    check duplicated
    search and sort
    Update/delete
    report/save 
     */
    private static Scanner sc = new Scanner(System.in);

    public boolean saveToFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < this.size(); i++) {
                pw.println(this.get(i));
                System.out.println();
            }
            pw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public void inputStudent() {
        String id, name, course;
        int semester;
//        Random r = new Random();
//        int rand1 = r.nextInt(999) + 1;
//        int rand2 = r.nextInt(999) + 1;
//        int rand3 = r.nextInt(999) + 1;
//
//        Student s1 = new Student("SA" + rand1, "CONG", "JAVA", 1);
//        Student s2 = new Student("SA" + rand2, "TRE", "PYTHON", 2);
//        Student s3 = new Student("SA" + rand3, "TRAU", "SQL", 3);
        System.out.println("Input student number " + (this.size() + 1));
        //^[E|e]\\d{5}$
        id = MyToys.getStringbyFormat("Input student ID: ", "ID must be format SAxxx", "SA\\d{3}");
        name = MyToys.getString("Input student name: ", "Student name do not empty!!");
        name = MyToys.toUpperFirstLetter(name);

        course = MyToys.getString("Input a course: ", "Course do not empty!!");
        course = MyToys.toUpperFirstLetter(course);

        semester = MyToys.getAnInterger("Input semester: ", "Semester is a number!!");
        this.add(new Student(id, name, course, semester));
//        this.add(s1);
//        this.add(s2);
//        this.add(s3);
        System.out.println();

    }

    public void addStudent() {

        String choice = "Y";

        do {
            if (this.size() >= 3) {
                while (true) {

                    System.out.print("Do you want to continue (Y/N): ");
                    choice = sc.nextLine().trim().toUpperCase();
                    if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N") && !choice.isEmpty()) {
                        break;
                    } else {
                        System.out.println("INPUT YOUR CHOICE!!! (Y or N)");
                    }
                }
                System.out.println("Total student " + this.size());
                if (choice.equals("N")) {
                    System.out.println("Exit!!\n");
                } else {
                    inputStudent();
                }
            } else {
                inputStudent();
            }

        } while (choice.equals("Y"));

    }

    public void printStudentList() {
        System.out.println("Total student " + this.size());
        for (int i = 0; i < this.size(); i++) {
            System.out.print((i + 1) + ". ");
            this.get(i).showProfile();
        }
    }

    public int findStudentByName(String searchName) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public int findStudentByID(String searchID) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId().equalsIgnoreCase(searchID)) {
                return i;
            }
        }
        return -1;
    }

    public boolean findStudent() {
        String searchName;

        System.out.print("Input student name you want to search: ");
        searchName = sc.nextLine();
        int pos = findStudentByName(searchName);

        if (pos >= 0) {
            System.out.println("-==(FIND STUDENT)==-");
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getName().equalsIgnoreCase(searchName)) {
                    this.get(i).showProfile();
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public void sortStudentList() {
        Collections.sort(this, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    public boolean updateStudent(int pos) {
        String updateName, updateCourse;
        int updateSemester;

        if (pos >= 0) {

            updateName = MyToys.getString("Old name: " + this.get(pos).getName() + " | New name: ", "Student name do not empty!!");
            updateName = MyToys.toUpperFirstLetter(updateName);

            updateCourse = MyToys.getString("Old course: " + this.get(pos).getCourse() + " | New course: ", "The course do not empty!!");
            updateCourse = MyToys.toUpperFirstLetter(updateCourse);

            updateSemester = MyToys.getAnInterger("Old semester: " + this.get(pos).getSemester() + " | New semester: ", "Semester is number!!");

            this.get(pos).setName(updateName);
            this.get(pos).setCourse(updateCourse);
            this.get(pos).setSemester(updateSemester);
        }

        return true;
    }

    public void removeStudent(int pos) {
        this.remove(pos);
        System.out.println("Remove successfully!!");
    }

}
