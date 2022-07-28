
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getOwner().charAt(1)))
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int max  = t.get(0).getPrice();
        int count = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getPrice() > max)
                max = t.get(i).getPrice();
        }
        
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() == max)
            {
                count++;
                if (count == 2)
                    t.remove(i);
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                return (o1.getOwner().charAt(1) + "").compareToIgnoreCase(o2.getOwner().charAt(1) + "");
            }
        });
    }
    
    
    
    
}
