package GUI;

import DTO.*;
import java.util.Scanner;

public class AntiqueShopV3 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String options[] = {"Add a new vase", "Add a new statue", "Add a new panting", "Display all items", "Find the item by creator", "Find the item by its index", "Remove the tem by its index",
            "Display the list of vase items", "Sort item in ascending order based on their values", "Exit"};
        int choice = 0;
        
        ItemListV3 list = new ItemListV3();
            

        do {
//            System.out.println("\n-------MENU-------");
//            System.out.println("1. Create a Vase");
//            System.out.println("2. Create a Statue");
//            System.out.println("3. Create a Painting");
//            System.out.println("4. Display the Item");
//            System.out.println("Other.  Exit");
//            System.out.print("Input a choice: ");
            System.out.println("-------MENU-------");
            
            choice = Menu.getChocie(options);

            switch (choice) {
                case 1:
                    Item tmp = new Vase();
                    tmp.input();
                    if(list.addItem(tmp)){
                        System.out.println("Added successfully!!");
                    }
                    break;
                case 2:
                    tmp = new Statue();
                    tmp.input();
                    if(list.addItem(tmp))
                        System.out.println("Added successfully!!");
                    break;
                case 3:
                    tmp = new Painting();
                    tmp.input();
                    if(list.addItem(tmp))
                        System.out.println("Added successfully!!");
                    break;
                case 4:
                    list.displayAll();
                    break;

            }
            System.out.println("-------------------------------------\n");
        } while (choice <= 4);
    }
}

//public static int getChocie(Object[] options){
//	for (int i = 0; i < options.length; i++){
//		sout(i+1) + "-" + options[i]);
//	}
//	sout"Choose 1.." + option.length + ": ");
//	Scanner sc = new Scanner (System.in);
//	return Integer.parseInt(sc.nextLine);
//}
//
//public class AntiqueShopV3 {
//public static void main(String[] args){
//String[] options={“ Create a Vase “,”Create a Statue”,” Create a Statue”,” display the item”};
//Item item=null;
//int choice=0;
//do{
//choice=Menu.getChoice(options);
//switch(choice){
//case 1:
//item=new Vase();
//((Vase)item).inputVase();
//break;
//….
//}while(…);
//}
