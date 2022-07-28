
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getPlace().charAt(0)) && Character.isLetter(t.get(i).getPlace().charAt(t.get(i).getPlace().length() - 1)))
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Brick> t) {
        int max = t.get(0).getPrice();
        
        for (Brick x : t) {
            if (x.getPrice() > max && x.getPrice() % 2 != 0)
                max = x.getPrice();
        }
        
        for (Brick x : t) {
            if (x.getPrice() == max)
            {x.setPlace("XX");
                break;
            }
        }
    }

    @Override
    public void f3(List<Brick> t) {
        int max = t.get(0).getPrice();
        int pos = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() > max){
                max = t.get(i).getPrice();
                pos = i;
            }
        }
        
        for (int i = 0; i < pos - 1; i++) {
            for (int j = i; j < pos; j++) {
                if (t.get(i).getPrice() > t.get(j).getPrice()){
                    Brick tmp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, tmp);
                }
            }
        }
        
        
    }
    
    
    
}
