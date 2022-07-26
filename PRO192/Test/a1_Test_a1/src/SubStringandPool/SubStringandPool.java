package SubStringandPool;

import data.*;
import java.util.*;

class A {

    private final void step() {
        System.out.println("0");
    }

}

class B extends A {

}

public class SubStringandPool extends A {

    public static void main(String[] args) {
//        String owner = "1234567";
//        String newOwner;
//        newOwner = owner.substring(3);
//        newOwner = owner.substring(2, 3);
//        String result = owner.substring(0, 2) + owner.substring(3, 7) + "";
//        System.out.println(result);

//        String s = "abcba";
//        String a = "";
//        System.out.println(s.length());
//        for (int i = s.length() - 1; i >= 0; i--) {
//            a += s.charAt(i); 
//        }
//        
//        System.out.println(a);
        String str = "ab abc abcba 12321 uv";
        String palid = "";

        ArrayList<String> list = new ArrayList<>();
        String arr[] = str.split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i].trim());
        }


        for (int i = 0; i < list.size(); i++) {

            for (int j = list.get(i).length(); j >= 0; j--) {
                palid += str.charAt(j);
            }

            String reverse = palid.trim();

            if (list.get(i).equalsIgnoreCase(reverse)) {
                list.set(i, "YY");
                break;
            }
            System.out.println(reverse);

            palid = "";

        }

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + " ";
        }
        System.out.println(result);
    }

}
