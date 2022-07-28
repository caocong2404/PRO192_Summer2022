
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String arr[] = str.split("\\s+");
        
        for (String x : arr) {
            if(x.trim().endsWith("m") || x.trim().endsWith("n"))
                count++;
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String arr[] = str.split("\\s+");
        int max = arr[0].trim().length();
        for (String x : arr) {
            x = x.trim();
        }
        int pos = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max)
            {
                max = arr[i].length();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max)
            {
                pos = i;
                break;
            }
        }
        
        
        String reverse = "";
        
        for (int i = arr[pos].length() - 1; i >= 0; i--) {
            reverse += arr[pos].charAt(i);
        }
        arr[pos] = reverse;
        String result = "";
        
        for (String x : arr) {
            result += x + " ";
        }
        
        return result;
        
        
    }
    
}
