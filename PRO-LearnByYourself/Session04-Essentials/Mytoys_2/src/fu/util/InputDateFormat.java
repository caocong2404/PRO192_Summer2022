package fu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputDateFormat {

    private static Scanner sc = new Scanner(System.in);
    
    
    public static Date getDate(String s){
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = formater.parse(s);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }
    
    public static Date inputDate(String inputMsg, String inputError) {
        int day, month, year;
        String dateFormat = "\\d{2}-\\d{2}-\\d{4}";
        Date date = null;
        //input Date
        System.out.print(inputMsg);
        String data = sc.nextLine();

        if (data.matches(dateFormat)) {
            try {
                String arr[] = data.split("-");
                day = Integer.parseInt(arr[0]);
                month = Integer.parseInt(arr[1]);
                year = Integer.parseInt(arr[2]);
                
                if(Validation.checkDayValid(day, month, year) == true)
                 date = getDate(data);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else System.out.println("DateFormat invalid");
        
        return date;
    }
    
    
}
