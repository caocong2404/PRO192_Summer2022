package data;

import java.util.ArrayList;

public class FresherList extends ArrayList<Fresher> {

    public FresherList() {
    }

    public boolean addToList(Fresher e) {
        this.add(e);
        return true;
    }

    public void printFresher() {
        System.out.println("===========FRESHER CANDIDATE==============");
        for (Fresher x : this) {
            System.out.println(x.firstName + " " + x.lastName);
        }

    }

}
