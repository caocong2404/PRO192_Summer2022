package StudentManage;

import data.StudentList;
import ui.Menu;
import util.MyToys;

public class StudentManagement {

    public static void main(String[] args) {
        Menu menu = new Menu("Student Management");
        menu.addOption("1. Create");
        menu.addOption("2. Find and Sort");
        menu.addOption("3. Update/Delete");
        menu.addOption("4. Report");
        menu.addOption("5. Exit");

        StudentList studentList = new StudentList();
        int choice = 0;
        do {
            menu.printMenu();
            choice = menu.getChoice();
            
            switch (choice) {

                case 1:
                    
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.printStudentList();
                    studentList.findStudent();
                    break;
                case 3:
                    String updateID, choiceU;
                    
                    
                    updateID = MyToys.getStringbyFormat("Input student ID you want to update: ", "Student ID must be in format SAxxx", "SA\\d{3}");
                    
                    int pos = studentList.findStudentByID(updateID);
                    if (pos >= 0){
                        System.out.print((pos + 1) + ". ");
                        studentList.get(pos).showProfile();
                        System.out.println("Do you want to update(U) or delete(D)");
                        while(true) {
                        choiceU = MyToys.getString("Input your choice (U/D): ", "Your choice do not empty!!").toUpperCase();
                        if (choiceU.equalsIgnoreCase("U") || choiceU.equalsIgnoreCase("D") && !choiceU.isEmpty())
                            break;
                        else System.out.println("Your choice (U or D) !!!");
                        }
                        if (choiceU.equalsIgnoreCase("U")) studentList.updateStudent(pos);
                        else studentList.removeStudent(pos);
                    } else System.out.println("NOT FOUND!!");
                    break;
                case 4:
                    if (studentList.saveToFile("D:\\Dev\\Project\\Java\\LAB211\\Lab01\\Lab.J1.L.P0021\\src\\file\\student.txt") == true)
                        System.out.println("Save successfully!!");
                    else System.err.println("ERROR");
                    break;
                case 5:
                    System.out.println("Goodbye!!");
                    break;
            }
        } while (choice != 5);

    }
}
