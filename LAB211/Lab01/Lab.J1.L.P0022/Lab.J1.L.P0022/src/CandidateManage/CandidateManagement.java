package CandidateManage;

import data.Cabinet;
import data.Candidate;
import data.ExperienceList;
import data.Experience;
import data.Fresher;
import data.FresherList;
import data.Intern;
import data.InternList;
import ui.Menu;
import util.MyToys;

public class CandidateManagement {

    public static void main(String[] args) {

        Menu menu = new Menu("CANDIDATE MANAGEMENT SYSTEM");
        menu.addOption("1. Experience");
        menu.addOption("2. Fresher");
        menu.addOption("3. Intership");
        menu.addOption("4. Searching");
        menu.addOption("5. Exit");
        int choice = 0;

        Cabinet listCandidate = new Cabinet();
        ExperienceList listExperience = new ExperienceList();
        FresherList listFresher = new FresherList();
        InternList listIntern = new InternList();

        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    Candidate ex = new Experience();
                    System.out.println("EXPERIENCE CANDIDATE");
                    ex.input(0);
                    if (listCandidate.addList(ex) && listExperience.addToList((Experience) ex)) {
                        System.out.println("Add Experience succesfully!!");
                    }
                    while (true) {
                        String option = MyToys.getChoose("Do you want to continue (Y/N)?. ", "Y", "N");
                        if (option.equalsIgnoreCase("Y")) {
                            ex = new Experience();
                            System.out.println("EXPERIENCE CANDIDATE");
                            ex.input(0);
                            if (listCandidate.addList(ex) && listExperience.addToList((Experience) ex)) {
                                System.out.println("Add Experience succesfully!!");
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    Candidate fresh = new Fresher();
                    System.out.println("FRESHER CANDIDATE");
                    fresh.input(1);
                    if (listCandidate.addList(fresh) && listFresher.addToList((Fresher) fresh)) {
                        System.out.println("Add Fresh succesfully!!");
                    }
                    while (true) {
                        String option = MyToys.getChoose("Do you want to continue (Y/N)?. ", "Y", "N");
                        if (option.equalsIgnoreCase("Y")) {
                            fresh = new Fresher();
                            System.out.println("FRESHER CANDIDATE");
                            fresh.input(1);
                            if (listCandidate.addList(fresh) && listFresher.addToList((Fresher) fresh)) {
                                System.out.println("Add Fresh succesfully!!");
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                case 3:
                    Candidate intern = new Intern();
                    System.out.println("INTERN CANDIDATE");
                    intern.input(2);
                    if (listIntern.addToList((Intern) intern)) {
                        System.out.println("Add Intern succesfully!!");
                    }
                    String option = MyToys.getChoose("Do you want to continue (Y/N)?. ", "Y", "N");
                    if (option.equalsIgnoreCase("Y")) {
                        intern = new Intern();
                        System.out.println("INTERN CANDIDATE");
                        intern.input(2);
                        if (listIntern.addToList((Intern) intern)) {
                            System.out.println("Add Intern succesfully!!");
                        }
                    } else {
                        break;
                    }
                    break;
                case 4://search
                    listExperience.printExperiece();
                    listFresher.printFresher();
                    listIntern.printIntern();
                    listCandidate.getChoice();
                    break;
                case 5://exit
                    System.out.println("Goodbye!! See you <3");
                    break;
            }

        } while (choice
                != 5);
    }
}
