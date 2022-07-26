package basicarray;

import data.Student;

public class BasicArray {

    public static void main(String[] args) {
        //[NOTE]   
        //arr[0]. không xo ra cai gì vì là bien primative
        //arr. 
        //playWithPrimativeArray();
        //playWithPrimativeArrayV2();
        playWithStudentArray();
    }

    public static void playWithStudentArray() {
        //luu hô so 10 ban SV

        Student arr[] = new Student[3];
        arr[0] = new Student("SE161860", "Thai An", 1999, 8.9);
        arr[1] = new Student("SE161861", "Thai Binh", 2000, 9.0);
        arr[2] = new Student("SE161862", "Thai Su", 2002, 7.2);

        System.out.println("Before sort: ");
        for (Student st : arr) {
            st.showProfile();
        }

        Student tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        System.out.println("After sort:");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void playWithPrimativeArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //float* arr = malloc (7 * sizeof(float));
        //bien          new Object();

        double arr[] = new double[365];//default gan het = 0;
        //em mún có 365 bien double, no la cac bien nay nè
        //                             arr[0], arr[1]...
        arr[0] = 123;
        arr[1] = 456;
        arr[2] = 789;
        arr[3] = 234;

        System.out.println("The array has values of (for i)");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " - ");
        }

        System.out.println("\nThe array has values of (for i) + length");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }

        System.out.println("\nThe array v has values of(using of each)");
        for (double x : arr) {
            System.out.print(x + " - ");
        }
    }

    public static void playWithPrimativeArray() {
        //double vol[369]; java cam khai bao kich thuoc mang, so phan tu trong []

        //float v[365] = {0, 1, 2, 3, 4 , 5, 6};
        float v[] = {0, 1, 2, 3, 4, 5, 6};
        //7 bien float
        //7 bien float nam tren HEAP, co new ngam day, co malloc() day

        System.out.println("The aaray has values of (printed by individual)");
        v[0] = 6969;
        System.out.println(v[0] + "; " + v[1] + "; " + v[2] + "; ");

        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + "; ");
        }

        //ta có the xem mang nhu là 1 tap hop cac value trong dau {} giong toán
        //ta có the xài khái niem voi moi de duyet qua toàn bo mang
        System.out.println("\nThe array v has values of(using of each)");
        //voi moi x la 1 con so tu nhien dang muon lay tung phan tu cua phan tu 'v'
        for (float x : v) {
            //dau ':' = thuoc ve
            //x = v[i]
            //voi moi x la bien le, bang tung thang le trong mang si
            //print(v[]) ~~~~~~~~~~~~~ print(x)
            System.out.print(x + "; ");

        }
    }

}
