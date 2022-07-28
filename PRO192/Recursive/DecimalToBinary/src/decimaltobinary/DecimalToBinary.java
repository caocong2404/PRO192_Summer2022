
package decimaltobinary;

/**
 *
 * @author CONG
 */
public class DecimalToBinary {


    public static void main(String[] args) {
        int n = 9892;
        DecimalTBinary(n);
        System.out.println();
    }
    
    public static void DecimalTBinary(long n){
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        else {
            DecimalTBinary(n/2);
            System.out.print(n%2);
        }
    }
    
}
