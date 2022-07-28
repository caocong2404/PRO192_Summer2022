
package binarysearch;

/**
 *
 * @author CONG
 */
public class BinarySearch {


    public static void main(String[] args) {
       int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
       int n = a.length;
       int x = 2;
        if(binarySearch(a, 0, n - 1, x))
            System.out.println("Found " + x + " in array!" );
        else 
            System.out.println("NOT FOUND!!");
    }
    
    public static boolean binarySearch(int a[], int left, int right, int x){
        if (left > right){
            return false;
        }
        else {
            int mid = (left + right)/2;
            if(a[mid] == x)
                return true;
            else if (a[mid] < x)
                return binarySearch(a, mid + 1, right, x);
            else 
                return binarySearch(a, left, mid - 1, x);
        }
    }
    
}
