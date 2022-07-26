package data;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BrandList extends ArrayList<Brand> {

    private static Scanner sc = new Scanner(System.in);
    
    private FileReader fr;
    private BufferedReader br;
    
    private FileWriter fw;
    private PrintWriter pw;
    
    

    public BrandList() {
    }

    public boolean readFromFile(String fileName) {
        String brandID, brandName, soundBrand;
        double price;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String[] arr;
            String text = br.readLine();
            while (text != null) {
                arr = text.split(",");
                brandID = arr[0].trim();
                brandName = arr[1].trim();
                soundBrand = arr[2].split(":")[0].trim();
                price = Double.parseDouble(arr[2].split(":")[1]);
                this.add(new Brand(brandID, brandName, soundBrand, price));
                text = br.readLine();

            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("File " + fileName + " not exist!!");
        }

        return false;
    }
    
    public boolean SaveToFile(String fileName){
        try {
            fw = new FileWriter(fileName);
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < this.size(); i++) {
                pw.println(this.get(i));
                System.out.println();
            }
            pw.close();
            fw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void searchID() {
        System.out.print("Input brand ID you want to search: ");
        String sID = sc.nextLine();
        int pos = this.searchID(sID);
        if (pos == -1) {
            System.out.println("Not found!!\n");
        } else {
            System.out.println("FOUND. Here are your brand!!");
            System.out.println(this.get(pos).toString());
            System.out.println();
        }
    }

    public int searchID(String brandID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBrandID().equalsIgnoreCase(brandID)) {
                return i;
            }
        }
        return -1;
    }

    public Brand getUserChoice() {
        Menu menu = new Menu();
        return (Brand)menu.ref_getChoice(this);
    }

    public void addBrand() {
        String brandID, brandName, soundBrand;
        double price;
        int pos;

        //input ID
        do {
            while (true) {
                System.out.print("Input a ID: ");
                brandID = sc.nextLine().trim().toUpperCase();
                if (brandID.isEmpty()) {
                    System.out.println("The ID is not empty!!");
                } else {
                    break;
                }
            }
            pos = searchID(brandID);
            if (pos >= 0) {
                System.out.println("This ID is already existed");
            }
        } while (pos != -1);

        //input brand name 
        while (true) {
            System.out.print("Input a brand name: ");
            brandName = sc.nextLine().trim();

            if (brandName.isEmpty() || brandName.length() == 0) {
                System.out.println("The brand name is not empty!!");
            } else {
                break;
            }
        }

        //input sound brand name 
        while (true) {
            System.out.print("Input a sound brand: ");
            soundBrand = sc.nextLine().trim();

            if (soundBrand.isEmpty() || soundBrand.length() == 0) {
                System.out.println("The sound brand is not empty!!");
            } else {
                break;
            }
        }

        //input price
        while (true) {
            try {
                System.out.print("Input the price: ");
                price = Double.parseDouble(sc.nextLine());
                if (price <= 0) {
                    System.out.println("Price must positive number");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Price must positive number");
            }
        }

        this.add(new Brand(brandID, brandName, soundBrand, price));
        System.out.println("Brand has added successfully!!\n");

    }

    public void updateBrand() {
        String newBrandID, newBrandName, newBrandSound;
        double newBrandPrice;
        int pos = -1;

        do {
            while (true) {
                System.out.print("Input a ID you want to update: ");
                newBrandID = sc.nextLine().trim();
                if (newBrandID.isEmpty()) {
                    System.out.println("The ID can not be blank!!");
                } else {
                    break;
                }
            }
            pos = searchID(newBrandID);
            if (pos >= 0) {
                System.out.println("Found!!! This is brand you want you update:\n" + this.get(pos).toString());
            } else {
                System.out.println("ID not found. Enter again");
            }
        } while (pos < 0);

        //input brand name 
        while (true) {
            System.out.print("Input a brand name: ");
            newBrandName = sc.nextLine().trim();

            if (newBrandName.isEmpty() || newBrandName.length() == 0) {
                System.out.println("The brand name is not empty!!");
            } else {
                break;
            }
        }

        //input sound brand name 
        while (true) {
            System.out.print("Input a sound brand: ");
            newBrandSound = sc.nextLine().trim();

            if (newBrandSound.isEmpty() || newBrandSound.length() == 0) {
                System.out.println("The sound brand is not empty!!");
            } else {
                break;
            }
        }

        //input price
        while (true) {
            try {
                System.out.print("Input the price: ");
                newBrandPrice = Double.parseDouble(sc.nextLine());
                if (newBrandPrice <= 0) {
                    System.out.println("Price must positive number");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Price must positive number");
            }
        }
        this.get(pos).setBrandID(newBrandID);
        this.get(pos).setBrandName(newBrandName);
        this.get(pos).setSoundBrand(newBrandSound);
        this.get(pos).setPrice(newBrandPrice);
        
        System.out.println("Update successfully!!\n");
    }

    public void listBrands() {
        if (this.isEmpty()) {
            System.out.println("The list is empty!!\n");
        } else {
            for (int i = 0; i < this.size(); i++) {
                System.out.println(this.get(i) + "\n");
            }
        }
    }

}
