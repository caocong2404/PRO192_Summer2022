
package HashTable;

import data.*;
import java.util.SortedSet;
import java.util.Comparator;
import java.util.Hashtable;


public class HashTable {
    public static void main(String[] args) {
        
        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
        hashTable.put(1, "Basic Java");
        hashTable.put(2, "OOP");
        hashTable.put(3, "Collection");
        
        for (Integer key : hashTable.keySet()) {
            String value = hashTable.get(key);
            System.out.println(key + " = " + value);
        }
        
        
    }
}
