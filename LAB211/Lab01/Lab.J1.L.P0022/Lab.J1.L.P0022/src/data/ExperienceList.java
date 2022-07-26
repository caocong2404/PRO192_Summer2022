package data;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceList extends ArrayList<Experience> {

    private Scanner sc = new Scanner(System.in);

    public boolean addToList(Experience e) {
        this.add(e);
        return true;
    }

    public void printExperiece() {
        System.out.println("===========EXPERIENCE CANDIDATE==============");
        for (Candidate x : this) {
            System.out.println(x.firstName + " " + x.lastName);
        }
    }

    public void printStudent() {
        for (Candidate x : this) {
            System.out.println(x);
        }
    }
}
