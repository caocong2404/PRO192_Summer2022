
package data;

import assignment.Inputter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductManagement implements IProduct {
    
    private static Scanner sc = new Scanner(System.in);
    List<Product> listProduct = new ArrayList<>();
    
    @Override
    public void addProduct(Product newProduct) {
        listProduct.add(newProduct);
        System.out.println("Add successfully");
    }
    
    public Product addProduct(){
        int id, quantity;
        int check = 0;
        String name;
        
        id = Inputter.getAnInterger("Input product ID: ", "MUST A NUMBER");
        while (check == 0) {
            id = Inputter.getAnInterger("Input product ID: ", "MUST A NUMBER");
            check = checkDuplicated(id);
            if (check == 0) System.out.println("DUPLICATED!!");
        }
        
        name = Inputter.getString("Input product name: ", "NOT EMPTY");
        quantity = Inputter.getAnInterger("Input product quantity: ", "MUST A NUMBER");
        Product product = new Product(id, name, quantity);
        return product;
    }
    
    public void updateProduct(){
       int updateID;
       if (listProduct.isEmpty()) return;
       else
       System.out.print("Input ID product you want to update: ");
       updateID = Integer.parseInt(sc.nextLine());
       Product updateProduct = searchID(updateID);
       int pos = seachPos(updateID);
       if (pos > -1){
           listProduct.set(pos, updateProduct(updateProduct));
           System.out.println("Update succesfully");
       } else System.out.println("NOT FOUND");
       
    }
    
    @Override
    public Product updateProduct(Product updateProduct) {
        String updateName;
        int updateQuatity;
        System.out.print("Old name " + "'" + updateProduct.getName() + "'" + " --> ");
        updateName = Inputter.getString("New name: ", "NOT EMPTY!");
        System.out.print("Old quantity " + "'" + updateProduct.getName() + "'" + " --> ");
        updateQuatity = Inputter.getAnInterger("New quantity: ", "MUST A NUMBER!!");
        updateProduct = new Product(updateProduct.getProductID(), updateName, updateQuatity);
        return updateProduct; 
    }

    @Override
    public void printProductList() {
        if (listProduct.isEmpty()) System.out.println("The list is empty!!!");
        else 
        for (Product x : listProduct) {
            System.out.println(x);
        }
    }
    
    public Product searchID(int id){
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductID() == id)
                return listProduct.get(i);
        }
        return null;
    }
    
    public int seachPos(int id){
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductID() == id)
                return i;
        }
        return -1;
    }
    
    public int checkDuplicated(int id){
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getProductID())
                return 0;
        }
        return 1;
    }
}
    
