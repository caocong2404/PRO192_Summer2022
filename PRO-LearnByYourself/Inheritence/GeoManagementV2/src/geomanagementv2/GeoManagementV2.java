package geomanagementv2;

import data.Disk;
import data.Retangle;
import data.Shape;
import data.Square;

public class GeoManagementV2 {

    public static void main(String[] args) {
        sortShapes();
    }

    public static void sortShapes() {
        
        Shape voDanh = new Shape("IDontkNOW", "Luxury", "Black") {
            @Override
            public double getArea() {
                return 10; 
            }
            
            @Override
            public double getPerimeter() {
                return 5;
            }
            
            @Override
            public void paint() {
                System.out.printf("%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n"
                , "SPECIAL", owner, color, borderColor, "", "",  getArea());
            }
        };

        Retangle r1 = new Retangle("TIA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Retangle("TIA", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MA", "PINK", "MAGENTA", ":)", 7.0);
        Retangle s2 = new Square("MA", "MAGENTA", "PINK", ":(", 8.0);
        Shape s3 = new Square("MA", "PINK", "MAGENTA", ":|", 9.0);

        Disk d1 = new Disk("BE NA", "RAINBOW", "RED", ":O", 2.0);
        Shape d2 = new Disk("BE NA", "RED", "RAINBOW", ":3", 2.0);

        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, voDanh};

        System.out.println("The list of shapes(Before sort): ");
        for (Shape x : arr) {
            x.paint();// tinh da hinh
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The list of shapes(After sort): ");
        for (Shape x : arr) {
            x.paint();
        }

    }

}
