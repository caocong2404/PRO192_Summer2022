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

        Child c1 = new Child("NHA PHO", "100 VND", "DU THUYEN");
        c1.showProfile();

        Parent c2 = new Child("CAN HO CAO CAP", "100 DOGECOIN", "MOTOR");
        c2.showProfile(); //OVERRIDE la show

        Child c3 = (Child)c2;
        c3.sayHi();
    }
}
