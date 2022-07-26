
package baitap2;

import data.Amazon;
import data.Tiki;


public class BaiTap2 {


    public static void main(String[] args) {
        Amazon book1 = new Amazon("Where the Crawdads Sing", 611_620, 4.9);
        book1.printInfo();
        Tiki book2 = new Tiki("Tam li hoc hanh vi", 73_500, 5.0);
        book2.printInfo();
    }
    
}
