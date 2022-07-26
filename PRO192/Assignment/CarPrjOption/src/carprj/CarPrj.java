package carprj;

import data.BrandList;
import data.CarList;
import data.Menu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarPrj {

    public static void main(String[] args) {
        Menu menu = new Menu();

        BrandList listBrand = new BrandList();
        CarList listCar = new CarList(listBrand);
        List<String> option = Menu.menuOption();

        listBrand.readFromFile("D:\\Dev\\Project\\Java\\PRO192\\Assignment\\CarPrj\\src\\file\\brands.txt");
        listCar.readFromFile("D:\\Dev\\Project\\Java\\PRO192\\Assignment\\CarPrj\\src\\file\\cars.txt");

        int choice = 0;

        do {

            choice = menu.int_getChoice(option);
            switch (choice) {
                case 1:
                    listBrand.listBrands();
                    break;

                case 2:
                    listBrand.addBrand();
                    break;

                case 3:
                    listBrand.searchID();
                    break;

                case 4:
                    listBrand.updateBrand();
                    break;

                case 5:
                    //luu file
                    if (listBrand.SaveToFile("D:\\Dev\\Project\\Java\\PRO192\\Assignment\\CarPrj\\src\\file\\saveBrands.txt") == true) 
                    {
                        System.out.println("Save successfully!!");
                        System.out.println("Full information: path : D:\\Dev\\Project\\Java\\PRO192\\Assignment\\CarPrj\\src\\file\\saveCars.txt");
                    }
                    break;

                case 6:
                    listCar.listCar();
                    break;

                case 7:
                    listCar.printBasedBrandName();
                    break;

                case 8:
                    listCar.addCar();
                    break;

                case 9:
                    listCar.removeCar();
                    break;

                case 10:
                    listCar.updateCar();
                    break;

                case 11:
                    if (listCar.SaveToFile("D:\\Dev\\Project\\Java\\PRO192\\Assignment\\CarPrj\\src\\file\\saveCars.txt") == true) {
                        System.out.println("Save successfully!!");
                        System.out.println("Full information: path : D:\\Dev\\Project\\Java\\PRO192\\Assignment\\CarPrj\\src\\file\\saveCars.txt");
                    }
                    break;

                default:
                    System.out.println("Goodbye");
                    break;
            }
        } while ((choice > 0) || choice <= 11);
    }

}
