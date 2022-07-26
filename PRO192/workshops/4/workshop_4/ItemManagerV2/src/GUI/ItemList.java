package GUI;

import DTO.Item;
import java.util.Scanner;

public class ItemList {

    private Scanner sc = new Scanner(System.in);
    public static final int MAX = 100;
    private static int count = 0;
    public Item list[] = new Item[MAX];

    public ItemList() {
    }

    public boolean addItem(Item item) {
        if (item == null || count >= MAX) {
            return false;
        }

        list[count] = item;
        count++;
        return true;
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            list[i].output();
        }
    }

    public void findItemC() {
        String creator;
        System.out.print("Input creator you want to search: ");
        creator = sc.nextLine();
        int pos = findItemC(creator);
        if (pos < 0) {
            System.out.println("NOT FOUND!!");
        } else {
            list[pos].output();
        }
    }

    public int findItemC(String creator) {

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (creator.equalsIgnoreCase(list[i].getCreator())) {
                    return i;
                }
            }
        } else {
            System.out.println("The list is empty!!!");
        }
        return -1;
    }

    public boolean updateItem(int index) {
        int updateValue;

        System.out.print("Input value you want to update: ");
        updateValue = sc.nextInt();

        list[index].setValue(updateValue);
        return true;
    }

    public boolean removeItem(int index) {
        if (index <= 0 && index > count) {
            return false;
        } else {
            for (int i = index; i < count; i++) {
                list[i] = list[i + 1];
            }
            count--;
            return true;
        }
    }
    
    public void sortItem(){
        for (int i = 0; i < count - 1; i++) {
            for (int j = i; j < count; j++) {
                if (list[j].getValue() > list[j + 1].getValue()){
                    Item tmp = list[j];
                    list[j] = list[j + 1];
                    tmp = list[j + 1];
                }
            }
        }
        System.out.println("Successfully!!!");
    }
    
    

}
