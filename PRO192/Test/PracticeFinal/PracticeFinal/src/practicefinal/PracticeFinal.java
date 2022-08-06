
package practicefinal;

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

class MyA implements IA{

    @Override
    public int f1(List<A> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getPond().charAt(1)))
                if (Integer.parseInt(t.get(i).getPond().charAt(1) + "") % 2 == 0)
                    count++;
        }
        return count;
    }

    @Override
    public void f2(List<A> t) {
        for (int i = 0; i < t.size(); i++) {
            if (checkPalindrom(t.get(i).getPond()))
            {    
                t.get(i).setState(99);
                break;
            }
        }
    }
    
    public boolean checkPalindrom(String t) {
        String palind = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            palind += t.charAt(i);
        }
        if (t.equals(palind))
            return true;
        return false;
    }

    @Override
    public void f3(List<A> t) {
        for (int i = t.size()-1; i >= 0; i--) {
            if (t.size() > 5)
                t.remove(i);
        }
        Collections.sort(t, new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                int result = o1.getState() - o2.getState();
                if (result == 0)
                    return (o1.getPond().charAt(1) + "").compareTo(o2.getPond().charAt(1) + "");   
                else return result;
            }
        });
        }
}

class MyString implements IString {

    @Override
    public int f1(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                if(checkPrime(Integer.parseInt(str.charAt(i) + "")))
                    sum += Integer.parseInt(str.charAt(i) + "");
        }
            return sum;
    }
    
    public boolean checkPrime(int number){
        if (number == 2)
            return true;
        for (int i = 3; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    
    public String mostFre1(String str){
        String arr[] = str.split("\\s+");
        List<String> list = Arrays.asList(arr);
        int count = 0;
        int maxCount = 0;
        String repeatWord = "";
        
        for (String x : list) {
            count = 1;
            for (String countingName : list) {
                if (x.equals(countingName))
                    count++;
            }
            
            if (count > maxCount){
                maxCount = count;
                repeatWord = x;
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(repeatWord))
                list.set(i, "T");
        }
        
        String result = "";
        for (String x : list) {
            result += x + " ";
        }
        return result.trim();
    }
    
    public String mostFre(String str)
    {
        String arr[] = str.split("\\s+");
        List<String> list = Arrays.asList(arr);
        int count, maxCount = 0;
        String repeatName = "";
        
        for (String name : list) {
            count = 1;
            
            for (String counting : list) {
                if ((name.trim()).equals(counting.trim()))
                    count++;
            
                if (maxCount < count) {
                    maxCount = count;
                    repeatName = name;
                }
            }
        }
        return repeatName;
    }

    @Override
    public String f2(String str) {
        String check = mostFre(str);       
        return (str.replace(check, "T"));        
    }

    public boolean checkPalind(String str){
        String palind = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palind += str.charAt(i);
        }
        
        if (str.equals(palind))
            return true;
        return false;
    }
    
    public boolean checkFrequen(String str){
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i + 1) - str.charAt(i)) == 1)
                count++;
        }
        if (count == str.length() - 1)
            return true;
        return false;
    }
    
    @Override
    public String f3(String str) {
        String arr[] = str.split("\\s+");
        String result = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (checkPalind(arr[i]) && checkFrequen(arr[i]))
            {
                arr[i] = "AA";
                break;
            }
        }

        
        for (String x : arr) {
            result += x + " ";
        }
        return result.trim();
    }
}


interface IA {
    public int f1(List<A> t);
    public void f2(List<A> t);
    public void f3(List<A> t);
}

interface IString {
    public int f1(String str);
    public String f2(String str);
    public String f3(String str);
}

public class PracticeFinal {

  
    public static void main(String[] args) {
        List<A> t = new ArrayList();
        MyA mya = new MyA();
        
//        t.add(new A("AB", 6));
//        t.add(new A("BCB", 2));
//        t.add(new A("CAC", 4));
//        t.add(new A("DX", 8));
//        t.add(new A("EY", 9));
//        t.add(new A("F", 7));
//          t.add(new A("A2", 6));
//          t.add(new A("BX", 2));
//          t.add(new A("C1", 4));
//          t.add(new A("D2", 8));
//          t.add(new A("E3", 9));
//          t.add(new A("F1", 7));
//            System.out.println(mya.f1(t));
        
//            mya.f2(t);
//            for (A a : t) {
//            System.out.print(a + ",]");
           
//            t.add(new A("A8", 9));
//           t.add(new A("B9", 2));
//           t.add(new A("C7", 8));
//           t.add(new A("D3", 2));
//           t.add(new A("E6", 7));
//           t.add(new A("F5", 6));
//           t.add(new A("G4", 5));
//           t.add(new A("H3", 4));
//           mya.f3(t);
//           for (A a : t) {
//               System.out.println(a);
            
                MyString mystring = new MyString();
//            String s = "a2b35c68";
//            System.out.println(mystring.f1(s));
                
        String s1 = "cd ab xyz ab xyz ab cd";
        String s2 = "cd abcba xyzyz 12321 xyz ab cd";
        System.out.println(mystring.f2(s1));
        System.out.println(mystring.mostFre1(s1));
        System.out.println(mystring.f3(s2));
        
               
        }
}
