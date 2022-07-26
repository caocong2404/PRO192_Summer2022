package test1;

import data.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test1 {

    public static void main(String[] args) {
        
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("D:\\Dev\\Project\\Java\\PRO192\\Test\\5Test5\\src\\data.txt"));
            String[] arr;
            String line = br.readLine();
            arr = line.split(",");
//            while ((line != null)) {
//                arr = line.split(",");
//                for (String o : arr) {
//                    System.out.println(o);
//                }
//                System.out.println();
//                System.out.println(arr[0].trim());
//                System.out.println(arr[1].trim());
//                System.out.println(arr[2].split(":")[0].trim());
//                System.out.println(Double.parseDouble(arr[2].split(":")[1].trim()));
//
//                line = br.readLine();
//                System.out.println();
//            }
            for (String x : arr) {
                System.out.println(x.trim());
            }
            System.out.println(line);
            line = br.readLine();
            System.out.println(line);
            
            br.close();
        } catch (Exception e) {
            System.out.println("File " + "data.txt" + " not found !");
        }

//        String test = "B7-2018, BMW 730Li (2018), Harman Kardon: 3.749";
//        String[] arr = test.split(",");
//        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i +  "] = " + arr[i].trim());
//        }
//        
//        String[] arrSub = arr[2].split(":");
//        
//        for (int i = 0; i < arrSub.length; i++) {
//            System.out.println("arrSub[" + i +  "] = " + arrSub[i].trim());
//        }
        
    }
}
