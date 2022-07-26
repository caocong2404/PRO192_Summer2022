package collectiondemo;

import data.MyArrayList;
import data.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class ArrayListDemo {

    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.add(new Product(1, "Coffee"));
        arr.add(new Product(2, "Milk"));
        arr.add(new Product(3, "Coca"));

        System.out.println("*****Print Product List*****");
        arr.printAllProduct();
        System.out.println();

        System.out.println("*****Get Product by ID*****");
        Product p = arr.getProductByID(1);
        
        System.out.println(p);
        System.out.println();

        System.out.println("***Remove***");
        System.out.println("Remove Product: " + p.getName());
        arr.removeProduct(p);
        System.out.println();

        System.out.println("*****Print Product List*****");
        arr.printAllProduct();

    }

}
