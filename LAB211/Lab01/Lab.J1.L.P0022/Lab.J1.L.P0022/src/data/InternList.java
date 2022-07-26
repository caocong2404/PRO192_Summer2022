package data;

import java.util.ArrayList;

public class InternList extends ArrayList<Intern> {

    public InternList() {
    }

    public boolean addToList(Intern e) {
        this.add(e);
        return true;
    }

    public void printIntern() {
        System.out.println("===========INTERN CANDIDATE==============");
        for (Intern x : this) {
            System.out.println(x.firstName + " " + x.lastName);
        }

    }
}
