
package main;

import java.util.HashMap;
import java.util.Iterator;


public class UseHashMap {
    
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put("Sau-Tan", "Huynh-Anh-Tuan");
        h.put("Binh-Ga", "Nguyen-Tan-Sau");
        h.put("Ba-Dia", "Tran-Mai-Hoa");
        System.out.println(h);
        h.put("Sau-Tan", "Nguyen-Van-Tuan");
        System.out.println(h);
        h.remove("Binh-Ga");
        System.out.println(h);
        
        Iterator it = h.keySet().iterator();
        while (it.hasNext()) {
            String key = (String)(it.next());
            String value = (String)(h.get(key));
            System.out.println(key + ", " + value);
        }
    }
}
