package GUI;

import DTO.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ItemListV4 extends ArrayList<Item> {

    private Scanner sc = new Scanner(System.in);

    public ItemListV4() {
    }
//this mothod add an Item object to the list
//input: a new item that needs to add
//output: return true/false

    public boolean addItem(Item item) {
        if (item == null) {
            return false;
        }
        this.add(item);
        return true;
    }

    //this method prints out information of all items
    public void displayAll() {
        if (this.isEmpty()) {
            System.out.println("The list is empty!!");
        } else {
            for (Item o : this) {
                o.output();
            }
        }
    }
//this method finds the item by its creator
//return the item that is found of the first occurrence.

    public Item findItem(String creator) {
        if (this.isEmpty()) {
            System.out.println("The list is empty!!");
        } else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getCreator().equalsIgnoreCase(creator)) {
                    return this.get(i);
                }
            }
        }
        return null;
    }

    //this method returns the zero_based index of the first occurrence.
    public int findItemIndex(String creator) {
        if (this.isEmpty()) {
            System.out.println("The list is empty!!");
        } else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getCreator().equals(creator)) {
                    return i;
                }
            }
        }
        return -1;
    }
//this method updates the item at the specified position in this list
//input: the index you wish to update

    public boolean updateItem(int index) {
        if (this.isEmpty()) {
            System.out.println("The list is empty!!");
            return false;
        }

        if (index >= 0) {
            this.get(index).input();
            return true;
        }

        return false;
    }

    //this method removes the item at the specified position in this list.
//Shifts any subsequent elements to the left
//input: the index you wish to remove
    public boolean removeItem(int index) {
        if (this.isEmpty()) {
            System.out.println("The list is empty!!");
            return false;
        }

        if (index >= 0) {
            this.remove(index);
            return true;
        }
        return false;
    }

    //this method prints out all items that belong to the given type in the list.
    public void displayItemsByType(String type) {
        if (type.equals("Vase")) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Vase) {
                    this.get(i).output();
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Statue) {
                    this.get(i).output();
                }
            }
        } else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Painting) {
                    this.get(i).output();
                }
            }
        }
    }

    //this method sorts items in ascending order based on their values.
    public void sortItems() {
        //sort by creator
        Collections.sort(this, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getCreator().compareTo(o2.getCreator());
            }
        });
        
        //sort by value
        Collections.sort(this, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getValue() > o2.getValue() ? 1 : -1;
            }
        });
    }
}//end class

