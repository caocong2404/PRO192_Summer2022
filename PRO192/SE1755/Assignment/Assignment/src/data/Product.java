
package data;

import assignment.Inputter;


public class Product {
    private int productID;
    private String name;
    private int quantity;

    public Product() {
    }

    public Product(int productID, String name, int quantity) {
        this.productID = productID;
        this.name = name.trim();
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("    %-5d | %-8s | %d", productID, name, quantity) ;
    }
    
}
