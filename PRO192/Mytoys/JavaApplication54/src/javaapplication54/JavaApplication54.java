
package javaapplication54;


public class JavaApplication54 {


    public static void main(String[] args) {
        //Character
        Character.isDigit(0);       Character.isWhitespace(0);
        Character.isLetter(0);      Character.isUpperCase(0);
        Character.isLowerCase(0);   Character.isUpperCase(0);
        
        //String
        String str = "abc";
        str.codePointAt(0);//ASCII
        str.charAt(0); // 'a'
        str.concat(" cde"); // 'abc cde'
        str.contains("a");
        str.endsWith("c");
        str.startsWith("a");
        String s5 = "a1a2a3";
        //replace
        String s6 = s5.replace('a', 'b');
        System.out.println(s6);
        //
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
     
     public boolean checkPrime(int primeNumber){
         if (primeNumber <= 1)
             return false;
         
         for (int i = 2; i < primeNumber; i++) {
             if (primeNumber % i == 0)
                 return false;
         }
         return true;
     }
    
}
