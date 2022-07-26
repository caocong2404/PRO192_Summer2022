
package data;


public class Test4 {

    public Test4() {
    }
    
    public int F4(String F4){
        int result = 0;
        int number;
        
        for (int i = 0; i < F4.length(); i++) {
            if(Character.isDigit(F4.charAt(i)))
            {   
                number = Integer.parseInt(F4.charAt(i) + "");
                if(number % 2 != 0)
                    result += number;
            }
            }
        
        return result;
    }
}
