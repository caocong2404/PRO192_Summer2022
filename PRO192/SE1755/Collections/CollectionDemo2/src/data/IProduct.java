
package data;


public interface IProduct {
    
    void printAllProduct();
    void addProduct(Product p);
    void removeProduct(Product p);
    Product getProductByID(int id);
}
