package geomanagementv2;

import data.RightTriangle;
import data.Triangle;
import java.util.Scanner;

public class GeoManagementV2 {

    public static void main(String[] args) {
//        String inputMsg = "Hello123123";
//        System.out.println(inputMsg);
//       
//        int n = Integer.parseInt(sc.nextLine());
//        System.out.println(n);

        //khai cha new cha
        Triangle arrTri[] = new Triangle[3];
        arrTri[0] = new Triangle("TIA", "RED", 4, 2, 5);
        arrTri[1] = new Triangle("MA", "BLUE", 5, 4, 8);
        arrTri[2] = new Triangle("CON", "PINK", 6, 4, 9);
        arrTri[0].paint();;
        
        //khai cha new con
        Triangle arrRTri1[] = new RightTriangle[3];
        arrRTri1[0] = new RightTriangle("BA1", "RED", 3, 4);
        arrRTri1[1] = new RightTriangle("ME1", "BLUE", 1, 3);
        arrRTri1[2] = new RightTriangle("CHILD1", "PINK", 4, 2);
        arrRTri1[0].paint();

        //khai con new con
        RightTriangle arrRTri2[] = new RightTriangle[3];
        arrRTri2[0] = new RightTriangle("BA2", "RED", 5, 6);
        arrRTri2[1] = new RightTriangle("ME2", "BLUE", 2, 4);
        arrRTri2[2] = new RightTriangle("CHILD2", "PINK", 5, 3);
        arrRTri2[0].paint();
    }

//    public static void input(){
//        
//        sc.
//        sc.
//        Triangle x = new Triangle(0, 0, 0);    }
}
