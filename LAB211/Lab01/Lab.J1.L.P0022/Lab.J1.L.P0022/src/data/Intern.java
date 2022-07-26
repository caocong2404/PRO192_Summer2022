
package data;

import util.MyToys;


public class Intern extends Candidate {
    
    private String major, universityName;
    private int semester;

    public Intern() {
    }
    
    public Intern(String major, String universityName, int semester, String candidateID, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.universityName = universityName;
        this.semester = semester;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + major + " | " + universityName + " | " + semester;
    }
    
    
    @Override
    public void input(int type){
        super.input(2);
        major = MyToys.getString("Input student major: ", "EMPTY!!");
        universityName = MyToys.getString("Input university name: ", "EMPTY!!");
        semester = MyToys.getAnInterger("Input semester: ", "EMPTY!!");
//universityName, semester;
    }
    
    
    
}
