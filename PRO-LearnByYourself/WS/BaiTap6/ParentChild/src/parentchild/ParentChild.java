package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {

    public static void main(String[] args) {
        playwithParentNChild();
    }

    public static void playwithParentNChild() {
        Parent p = new Parent("BIET THU", "100 DOLA");
        p.showProfile();
        
        Child c1 = new Child("NHA PHO", "100 VND");
        c1.showProfile();
    }

}
