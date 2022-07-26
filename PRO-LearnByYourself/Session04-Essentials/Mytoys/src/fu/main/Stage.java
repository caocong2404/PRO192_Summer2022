
package fu.main;

import fu.util.Mytoys;


public class Stage {
   
    public static void main(String[] args) {
        System.out.println("PI: " + Mytoys.PI);
        
        int n = Mytoys.getAnInterger();
        System.out.println("n: " + n);
        
        int choice;
        
        choice = Mytoys.getAnInterger("Moi nhap lua chon cua ban (1..7):");
        System.out.println("Lua chon cua ban la: " + choice);
  
    }
}
