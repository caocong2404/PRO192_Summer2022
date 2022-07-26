package data;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    private List<Student> listStudent = new ArrayList<>();
    
    public StudentList() {
    }
    
    public void addsStudent(){
        listStudent.add(new Student("S111", "teo", 3));
        listStudent.add(new Student("S222", "tan", 2));
        listStudent.add(new Student("S333", "cog", 6));
    }
    
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < listStudent.size(); i++)
            if (listStudent.get(i).getCode().equals(code)) return listStudent.get(i);
        return null;
    }
    
    public void searchByPartOfName(){
        String part = Inputter.inputNonBlankStr("Input part of name: ");
        for (int i = 0; i < listStudent.size(); i++) {
            if ((listStudent.get(i).getName().toLowerCase()).contains(part))
                System.out.println(listStudent.get(i));
        }
    }

    private boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    public void addStudent() {
        String newCode, newName;
        float newMark;
        boolean codeDuplicated = false;
        do {
            newCode = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDupplicated(newCode);
            if (codeDuplicated) {
                System.out.println("Code is duplicated!!");
            }
        } while (codeDuplicated == true);

        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10);

        Student st = new Student(newCode, newName, newMark);

        listStudent.add(st);
        System.out.println("Student " + newCode + " has been added.");

    }

    public void searchStudent() {
        if (listStudent.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            String sCode = Inputter.inputStr("Input student code for search: ");
            Student st = this.search(sCode);
            if (st == null) {
                System.out.println("Student " + sCode + " doesn't existed!");
            } else {
                System.out.println("Found!!! \n" + st);
            }
        }
    }

    public void printAll() {
        if (listStudent.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            System.out.println("Student list: ");
            for (Student x : listStudent) {
                System.out.println(x);
            }
            System.out.println("Total: " + listStudent.size() + " student(s).");
        }
    }

    public void removeStudent() {
        if (listStudent.isEmpty()) {
            System.out.println("Empty list. No remove can be performed!");
        } else {
            String rCode = Inputter.inputStr("Input code of removed student: ");
            Student st = this.search(rCode);
            if (st == null) {
                System.out.println("Student " + rCode + " doesn't existed!!");
            } else {
                listStudent.remove(st);
                System.out.println("Student " + rCode + " has been removed.");
            }
        }
    }

    public void updateStudent() {
        if (listStudent.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String uCode = Inputter.inputStr("Input code of updated student: ");
            Student st = this.search(uCode);
            if (st == null) {
                System.out.println("Student " + uCode + " doesn't existed!");
            } else {
                String oldName = st.getName();
                String msg = "Old name: " + oldName + ", new name";
                String newName = Inputter.inputNonBlankStr(msg);
                st.setName(newName);

                float oldMark = st.getMark();
                msg = "Old mark: " + oldMark + ", newmark 0..10:";
                float newMark = Inputter.inputInt(msg, 0, 10);
                st.setMark(newMark);
                System.out.println("Student " + uCode + " has been updated.");
            }
        }
    }
}
