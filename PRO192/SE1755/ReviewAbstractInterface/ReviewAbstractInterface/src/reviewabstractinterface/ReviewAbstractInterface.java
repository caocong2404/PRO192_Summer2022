package reviewabstractinterface;

import data.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ReviewAbstractInterface {

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

        Socola s1 = new Socola("PINK", "THUNNG", "PROVIP", "SOCOLAVIP1", 12000, 4);
        s1.XemChiTiet();
        try {
            Milk m1 = new Milk(date.parse("12-12-2019"), date.parse("12-12-2022"), "THUNGBU", "MILK", "VINAMILK", 25000, 2);
            m1.XemChiTiet();
        } catch (ParseException e) {
        }
        
    }

}
