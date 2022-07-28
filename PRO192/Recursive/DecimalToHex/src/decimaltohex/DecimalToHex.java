
package decimaltohex;

/**
 *
 * @author CONG
 */
public class DecimalToHex {


    public static void main(String[] args) {
        int n = 9892;
        DecimalTHex(n);
        
    }
    
    public static void DecimalTHex(long n){
        if (n <= 15){
            if (n < 10) System.out.print(n);
            else System.out.print((char)(n + 55));
            return;
        } else {
            DecimalTHex(n/16);
            long r = n % 16;
            if (r < 10) System.out.print(r);
            else System.out.print((char)(r + 55));
        }
    }
    
}
