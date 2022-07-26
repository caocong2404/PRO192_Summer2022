package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarList extends ArrayList<Car> {

    private Scanner sc = new Scanner(System.in);
    private BrandList brandList;
    private Menu menu = new Menu();

    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private PrintWriter pw;

    public CarList() {
    }

    public CarList(BrandList bList) {
        brandList = bList;
    }
    
    

    public boolean readFromFile(String fileName) {
        //ID, brand ID, color, frame ID, engine ID
        //C01, B7-2018, red, F12345, E12345

        String carID, color, frameID, engineID;
        Brand brand;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String text = br.readLine();
            
            while (text != null) {
                String arr[] = text.split(",");
                carID = arr[0].trim();
                brand = brandList.get(brandList.searchID(arr[1].trim()));
                color = arr[2].trim();
                frameID = arr[3].trim();
                engineID = arr[4].trim();
                this.add(new Car(carID, brand, color, frameID, engineID));
                text = br.readLine();
            }
            br.close();
            fr.close();
            return true;
        } catch (Exception e) {
            System.out.println("File " + fileName + " not exist!!!");
        }
        return false;
    }

    public boolean SaveToFile(String fileName) {
        try {
            fw = new FileWriter(fileName);
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < this.size(); i++) {
                pw.println(this.get(i));
            }
            pw.close();
            fw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int searchID(String carID) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).carID.equals(carID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchFrame(String fID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).frameID.equals(fID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngine(String eID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).engineID.equals(eID)) {
                return i;
            }
        }
        return -1;
    }

    public void addCar() {

        String carID, color, frameID, engineID;
        int checkCarID, checkFrameID, checkEngineID;

        do {
            System.out.print("Input car ID: ");
            carID = sc.nextLine().toUpperCase().trim();
            checkCarID = searchID(carID);
            if (checkCarID > -1) {
                System.out.println("Car ID is duplicated!!");
            }
        } while (checkCarID != -1);
        
        
        Brand brand = (Brand)menu.ref_getChoice(brandList);

        System.out.print("Input car color: ");
        while (true) {
            color = sc.nextLine().trim();
            if (color.isEmpty()) {
                System.out.println("Color can not be blank. Enter again!!");
            } else {
                break;
            }
        }

        do {
            frameID = Mytoys.getStringbyFormat("Input frame ID: ", "The frame ID must be in format FXXXXX(X is digit)!!!", "^[F|f]\\d{5}$");
            checkFrameID = searchFrame(frameID);
            if (checkFrameID > -1) {
                System.out.println("Frame ID is duplicated!!!");
            }
        } while (checkFrameID != -1);

        do {
            engineID = Mytoys.getStringbyFormat("Input engine ID: ", "The engine ID must be in format EXXXXX(X is digit)!!!", "^[E|e]\\d{5}$");
            checkEngineID = searchEngine(engineID);
            if (checkEngineID > -1) {
                System.out.println("Engine ID is duplicated!!!");
            }
        } while (checkEngineID != -1);

        this.add(new Car(carID, brand, carID, frameID, engineID));
        System.out.println("Add successfully!!\n");
    }

    public boolean removeCar() {
        String removeID, choice;
        System.out.print("Input ID car you want to remove: ");
        removeID = sc.nextLine().toUpperCase().trim();
        int pos = searchID(removeID);

        if (pos < 0) {
            System.out.println("Not found!!\n");
            return false;
        } else {
            System.out.print("Are you sure to remove " + removeID + " (Y/N): ");
            choice = sc.nextLine().trim().toUpperCase();
            if(choice.equals("Y")){
            this.remove(pos);
            System.out.println("Remove " + removeID + " successfully!!\n");
            } else System.out.println("NOT REMOVE\n");
        }
        return true;
    }

    public boolean updateCar() {
        String updateID;
        String updateColor, updateFrameID, updateEngineID;

        System.out.print("Input car ID you want to update: ");
        updateID = sc.nextLine().toUpperCase().trim();
        int pos = searchID(updateID);
        if (pos < 0) {
            System.out.println("Not found!!!");
            return false;
        }
        
        System.out.println("Here the car before you updateL ");
        System.out.println(this.get(pos).toString());

        Brand b = (Brand) menu.ref_getChoice(brandList);

        while (true) {
            System.out.print("Input a car color: ");
            updateColor = sc.nextLine().trim();
            if (updateColor.isEmpty()) {
                System.out.println("Car color can not be blank!!!");
            } else {
                break;
            }
        }

        while (true) {
            updateFrameID = Mytoys.getStringbyFormat("Input frame ID: ", "The frame ID must be in format FXXXXX(X is digit)!!!", "^[F|f]\\d{5}$");
            if ((searchFrame(updateFrameID) > -1)) {
                System.out.println("The frame ID can not be duplicated!!");
            } else {
                break;
            }
        }

        while (true) {
            updateEngineID = Mytoys.getStringbyFormat("Input engine ID: ", "The engine ID must be in format EXXXXX(X is digit)!!!", "[E|e]\\d{5}$");
            if ((searchEngine(updateFrameID)) > -1) {
                System.out.println("The engine ID can not be duplicated!!! ");
            } else {
                break;
            }
        }

        this.add(new Car(updateID, b, updateColor, updateFrameID, updateEngineID));
        System.out.println("Car has updated successfully\n");
        return true;
    }

    public void printBasedBrandName() {
        String aPartOfBrandName;
        int count = 0;
        System.out.print("Input a brand name: ");
        aPartOfBrandName = sc.nextLine().trim().toUpperCase();

        for (int i = 0; i < this.size(); i++) {
            if ((this.get(i).brand.getBrandName().toUpperCase().trim()).contains(aPartOfBrandName)) {
                this.get(i).screenString();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Brand name do not found!!");
        }
    }

    public void listCar() {
        Collections.sort(this);
        System.out.println("=====(List of Cars)=====");
        for (int i = 0; i < this.size(); i++) {
            System.out.println("-----(Car number " + (i + 1) + ")-----");
            System.out.println(this.get(i));
            System.out.println();
        }
    }

}
