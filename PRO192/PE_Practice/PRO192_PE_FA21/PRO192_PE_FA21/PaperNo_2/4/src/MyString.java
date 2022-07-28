
import java.util.ArrayList;
import java.util.List;


public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                if (str.charAt(i) % 2 != 0)
                    count++;
        }
        return count;
    }
    
    public boolean checkPalind(String s){
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        
        if (s.equals(reverse))
            return true;
        return false;
    }

    @Override
    public String f2(String str) {
        String s[] = str.split("\\s+");
        List<String> a = new ArrayList<>();
        
        for (String x : s) {
            a.add(x.trim());
        }
        int pos;
        
        for (int i = 0; i < a.size(); i++) {
            if(checkPalind(a.get(i)))
            {
                a.set(i, "XX");
                break;
            }
        }
        
        String result = "";
        
        for (int i = 0; i < a.size(); i++) {
            result += a.get(i) + " ";
        }
        return result;
                
        
        
        
                
    }
    
}
