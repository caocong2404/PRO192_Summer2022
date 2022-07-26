package data;

import java.util.Scanner;

public class Cabinet {

    private String color;
    private String label;
    private Book sach[] = new Book[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;

    public Cabinet(String color, String label) {
        this.color = color;
        this.label = label;
        ///this.count = 0; //moi mua tu chua co value
    }

    public void addABook() {
        String id, name, author;
        double price, rate;
        
        System.out.println("Input book #" + (count + 1) + "/" + sach.length);
        System.out.print("Input BOOK ID:");
        id = sc.nextLine();

        System.out.print("Input BOOK name:");
        name = sc.nextLine();

        System.out.print("Input BOOK author:");
        author = sc.nextLine();

        System.out.print("\nInput BookShelf price:");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("\nInput BookShelf rate:");
        rate = Double.parseDouble(sc.nextLine());

        sach[count] = new Book(id, name, author, price, rate);
        count++;
    }
    
    public void printBookList(){
        System.out.println("The book list:");
        System.out.println("There is/are " + count + " book(s) in the list");
        for (int i = 0; i < count; i++)
            sach[count].showProfile();
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public void showProfile() {
        System.out.printf("|Color: %-8s |Label: %s|");
    }

}
