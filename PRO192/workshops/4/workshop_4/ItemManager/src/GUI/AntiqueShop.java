package GUI;

import DTO.*;
import java.util.Scanner;

public class AntiqueShop {

    public static void main(String[] args) {
        String options[] = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the item"};
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

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
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object\n");
                    }

                    break;
            }
            System.out.println("-------------------------------------\n");
        } while (choice
                <= 4);
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
//public class AntiqueShop {
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
