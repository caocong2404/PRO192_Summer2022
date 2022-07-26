
package data;

import util.MyToys;


public class Experience extends Candidate {
    //year of experience (ExpInYear), Professional Skill (ProSkill). 
    private int ExpInYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience(int ExpInYear, String ProSkill, String candidateID, 
                String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + ExpInYear + " | " + ProSkill;
    }
    
    @Override
    public void input(int type){
        super.input(0);
        ExpInYear = MyToys.getAnInteger("Input Year of Experience: ", "Must in range 0-100", 0, 100);
        ProSkill = MyToys.getString("Input Professional Skill: ", "EMPTY!!");
    }
    
    

    
    
}
