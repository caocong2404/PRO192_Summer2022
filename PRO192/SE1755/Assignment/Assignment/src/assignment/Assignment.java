package assignment;

import data.Product;
import data.ProductManagement;

public class Assignment {

    public static void main(String[] args) {
        Menu menu = new Menu("PRODUCT MANAGEMENT");
        menu.addOption("1. Print product list");
        menu.addOption("2. Add new Product");
        menu.addOption("3. Update a Product");
        menu.addOption("4. Exit");
        
        ProductManagement listProduct = new ProductManagement();
        
        int choice = 0;
        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("---===PRODUCT LIST===---");
                    listProduct.printProductList();
                    break;
                case 2:
                    Product product = listProduct.addProduct();
                    listProduct.addProduct(product);
                    break;
                case 3:
                    listProduct.printProductList();
                    listProduct.updateProduct();
                    break;
                case 4:
                    System.out.println("Goodbye!!");
                    break;
            }
        } while (choice != 4);
    }
    
    

}
