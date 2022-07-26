package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.MyToys;

public class Cabinet {

    private static Scanner sc = new Scanner(System.in);
    private List<Candidate> listCandidate = new ArrayList();

    public boolean addList(Candidate x) {
        listCandidate.add(x);
        return true;
    }

    public void getChoice() {
        String choiceName;
        int choiceType = 5;
        choiceName = MyToys.getString("Input cadidate name: ", "Empty!!");

        do {
            choiceType = MyToys.getAnInterger("Input type: ", "Error!!");
            System.out.println("Choice in range 0-2");
        } while (choiceType < 0 && choiceType > 2);

        switch (choiceType) {
            case 0:
                int count = 0;
                for (int i = 0; i < listCandidate.size(); i++) {
                    if (listCandidate.get(i).getCandidateType() == 0) {
                        if (listCandidate.get(i).firstName.contains(choiceName)
                                || listCandidate.get(i).lastName.contains(choiceName)
                                && choiceType == 0) {
                            listCandidate.get(i).showProfile();
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("NOT FOUND!!");
                }
                break;

            case 1:
                count = 0;
                for (int i = 0; i < listCandidate.size(); i++) {
                    if (listCandidate.get(i).getCandidateType() == 1) {
                        if (listCandidate.get(i).firstName.contains(choiceName)
                                || listCandidate.get(i).lastName.contains(choiceName)
                                && choiceType == 0) {
                            listCandidate.get(i).showProfile();
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("NOT FOUND!!");
                }

                break;

            case 2:
                count = 0;
                for (int i = 0; i < listCandidate.size(); i++) {
                    if (listCandidate.get(i).getCandidateType() == 2) {
                        if (listCandidate.get(i).firstName.contains(choiceName)
                                || listCandidate.get(i).lastName.contains(choiceName)
                                && choiceType == 0) {
                            listCandidate.get(i).showProfile();
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("NOT FOUND!!");
                }

                break;
        }

    }

}
