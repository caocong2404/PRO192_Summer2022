
package main;

import data.Student;


public class Stage {
    public static void main(String[] args) {
        //checkObjectV3();
        Student aihihi = checkObjectV5();
        aihihi.showProfile();
    }
    
    public static void checkObjectV1()
    {
       Student s1 = new Student("SE161860", "Thai An", 1999, 8.9);
       //s1
       //reference var
       //object    var
       //pointer   var
       s1.showProfile();
       //s1 la bien object
       //Student la dac diem cua object (instance variable)

       Student x = s1;
        
       s1 = new Student("SE161860", "Binh", 1997, 4.9);
       x.showProfile();
       s1.showProfile();
    }
    
    public static void checkObjectV2()
    {
        Student s1 = new Student("SE161860", "Thai An", 1999, 8.9);
        s1 =  new Student("SE161861", "Binh", 1995, 9.0);
        s1.showProfile();
        
    }
    
     public static void checkObjectV3()
    {
        Student s1 = new Student("SE161860", "Thai An", 1999, 8.9);
        s1.showProfile();
        
        Student x1, x2, x3, x4;
        x1 = s1; x2 = s1; x3 = s1; x4 = s1;
        
        s1.setName("Aduvip z 3");
        x1.showProfile(); x2.showProfile(); x3.showProfile(); x4.showProfile();
        
        
    }
     
     public static void checkObjectV4(){
         Student x;
         x = new Student("SE161863", "Minh", 1987, 7.9);
         
     }
     
     //ham tra ve toa do cua 1 object nao do
     //vì tra dc toa do nghia la so duoc object
     //            Student x;
     public static Student checkObjectV5(){
         Student x;
         x = new Student("SE161863", "Minh", 1987, 7.9);
         return x;
     }
}
