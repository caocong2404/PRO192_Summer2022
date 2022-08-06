
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;



class A {

    int x = 5;
}

class B {

    int y = 6;

    public void m(A obj) {
        System.out.print(obj.x + this.y);
    }
}

public class SubStringandPool {

    public static void main(String[] args) {
        String a1 = "Hello";
        String a2 = "Hello";
        System.out.println("Hello == Hello " + (a1 == a2));

        String a3 = "Hello";
        String a4 = "HelloYou";
        System.out.println("Hello == HelloYou " + (a3 == a4));

        String a5 = "Hello";
        String a6 = "HellO";
        System.out.println("Hello == HellO " + (a5 == a6));
        
        String a7 = new String("Hello");
        String a8 = new String("Hello");
        System.out.println("String(\"Hello\") == String(\"Hello\") " + (a7 == a8));
        
        //check length after split
        String s = "Chao mung cac ban";
        System.out.println(s.length());
        String arr[] = s.split("\\s+");
        for (String x : arr) {
            System.out.println(x.length());
        }

//        Student s1 = new Student("123", a6, 0, a6);
//        System.out.println(s1.toString());
//        
//        
//        System.out.println(cutString());
//        System.out.println(cutString().length());

            char c = 'A';
            System.out.println(c);


        Object ob1 = new Object();
        Object ob2 = new Object();
        if (ob1.equals(ob2)) {
            System.out.println("ob1 equals ob2");
        }
        if (ob1 == ob2) {
            System.out.println("ob1==ob2");
        }
        else System.out.println("Have a nice day!");
    
        String sa = "so phan da da da da an bai";
        String array[] = sa.split("\\s+");
        List<String> list = new ArrayList<>();
        
        for (String x : array) {
            list.add(x);
        }
        
        System.out.println(list.size());
 
        
        
        for (int i = 0; i < list.size(); i++) 
             if (list.get(i).equals("da"))
             {list.remove(i);
             i--;
             }
        
                             
        
        System.out.println(list.size());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". "+ list.get(i));
        }
        
        
    
    
    
    }
    
    

    public static String cutString() {
        String sdt = "0374722998";
        String result = "";
        try {
            for (int i = 0; i < sdt.length(); i += 3) {
                result = result + sdt.substring(i, i + 3) + "-";
            }

        } catch (Exception e) {
        }
        return result.substring(0, sdt.length() + 1);
    }
}
