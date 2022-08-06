
import java.util.*;

class A {

    private String pond;
    private int state;

    public A() {
    }

    public A(String pond, int state) {
        this.pond = pond;
        this.state = state;
    }

    public String getPond() {
        return pond;
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return pond + ", " + state;
    }
}

class MyA implements IA {

}

class MyString implements IString {

    @Override
    public int sum(String s) {
        String arr[] = s.split("\\s+");
        String first = "";
        String last = "";
        for (String x : arr) {
            if (checkNumber(x)) {
                first = x;
                break;
            }
        }

        for (String x : arr) {
            if (checkNumber(x) && x.compareTo(first) != 0) {
                last = x;
            }
        }
        int result = 0;
        for (int i = 0; i < first.length(); i++) {
            result += Integer.parseInt(first.charAt(i) + "");
        }

        for (int i = 0; i < last.length(); i++) {
            result += Integer.parseInt(last.charAt(i) + "");
        }
//        int number1 = Integer.parseInt(first); 
//        int number2 = Integer.parseInt(last);
//        int result = number1 + number2;
        return result;
    }

    public boolean checkNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String palind(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    @Override
    public String getCode(String s) {
        String arr[] = s.split("\\s+");
        String first = "";
        int posF = -1; int posL = -1;
        String last = "";

        for (int i = 0; i < arr.length; i++) {
            if (checkNumber(arr[i])) {
                first = arr[i];
                posF = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (checkNumber(arr[i]) && arr[i].compareTo(first) != 0) {
                last = arr[i];
                posL = i;
            }
        }

        first = palind(first);
        last = palind(last);
        
        if (posF >= 0 && posL >= 0)
        for (int i = 0; i < arr.length; i++) {
            if (i == posF) {
                arr[i] = first;
            } else if (i == posL) {
                arr[i] = last;
            }
        }

        String result =  first+ " " +  last ;

        return result.trim();

    }

}

interface IA {

}

interface IString {

    public int sum(String s);

    public String getCode(String s);
}

public class PracticeFinal2 {

    public static void main(String[] args) {
        String s1 = "1a 123 ab 23 abc 10";
        String s2 = "1a 123 ab 145 cd 201";
        MyString t = new MyString();
        System.out.println(t.sum(s1));
        System.out.println(t.getCode(s2));

    }
}
