package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyToyDate {

    private static Scanner sc = new Scanner(System.in);
    
    
    public static Date inputDate(String s){
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = formater.parse(s);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }
    
    public static Date getDate(String inputMsg, String inputError) {
        int day, month, year;
        String dateFormat = "\\d{2}-\\d{2}-\\d{4}";
        Date date = null;
        //input Date
        System.out.print(inputMsg);
        String data = sc.nextLine();

        while (true) {            
            if (data.matches(dateFormat)) {
            try {
                String arr[] = data.split("-");
                day = Integer.parseInt(arr[0]);
                month = Integer.parseInt(arr[1]);
                year = Integer.parseInt(arr[2]);
                
                if(MyToyValid.checkDayValid(day, month, year) == true)
                date = inputDate(data);
                return date;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else System.out.println("DateFormat invalid");
        }
    }
    
    public static String getYear(String inputMsg, String errorMsg){
        String year;
        String pattern = "\\d{4}";
        while (true) {            
           System.out.print(inputMsg);
            year = sc.nextLine();
            if (year.matches(pattern) && MyToyValid.checkYearValid(Integer.parseInt(year)))
                return year;
            else 
                System.out.println(errorMsg);
        }
    }
    
    
}
