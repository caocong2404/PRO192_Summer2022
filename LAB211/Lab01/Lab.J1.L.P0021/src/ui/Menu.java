package ui;

import java.util.ArrayList;
import java.util.List;
import util.MyToys;

/*
Việc cần làm của Menu
1. Tạo list option
2. Add option
3. Check duplicate
4. Print menu
5. Get choice
***********************/
public class Menu {

    private String menuTitle;

    List<String> optionList = new ArrayList<>();

    public Menu() {
    }

    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public void addOption(String newOption) {
        //kiem tra xem option co trung hay khong
        if (checkDuplicate(newOption) == true) {
            System.out.println("This option is duplicated!!");
        } else {
            optionList.add(newOption);
        }
    }

    public boolean checkDuplicate(String checkOption) {
        for (int i = 0; i < optionList.size(); i++) {
            if (optionList.get(i).equalsIgnoreCase(checkOption) == true) {
                return true;
            }
        }
        return false;
    }

    public void printMenu() {
        System.out.println();
        if (optionList.isEmpty()) {
            System.out.println("The list is empty!!");
            return;
        }

        System.out.println("===(Welcome to " + menuTitle + ")===");
        for (String x : optionList) {
            System.out.println(x);
        }
    }

    public int getChoice() {
        int maxOption = optionList.size();

        String inputMsg = ("Choose [1.." + maxOption + "]: ");
        String errorMsg = ("You choice should be in range 1.." + maxOption + "!!!");
        return MyToys.getAnInteger(inputMsg, errorMsg, 1, maxOption);
    }

}
