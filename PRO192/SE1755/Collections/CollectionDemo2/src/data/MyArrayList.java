
package data;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList extends ArrayList<Product> implements IProduct {
    
    List<Integer> list = new ArrayList<>();
    
    public void adu(){
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        
        list.iterator();
    }
    
    @Override
    public void printAllProduct() {
        for (Product x : this) {
            System.out.println(x);
        }
    }

    @Override
    public void addProduct(Product p) {
        this.add(p);
    }

    @Override
    public void removeProduct(Product p) {
        this.remove(p);
    }

    @Override
    public Product getProductByID(int id) {
        Product pro = this.stream()
                    .filter(p -> p.getId() == id)
                    .findAny()
                    .orElse(null);
        return pro;
//        for (Product p : this) {
//            if(p.getId() == id)
//                return p;
//        }
//        return null;
    }
    
    
    
    
    
}
