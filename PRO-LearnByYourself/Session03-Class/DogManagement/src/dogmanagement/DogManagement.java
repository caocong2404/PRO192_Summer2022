
package dogmanagement;

import data.Dog;


public class DogManagement {

    public static void main(String[] args) {
        // TODO code application logic here
        //lay khuôn Dog ra de bat dau do info
        //y chang viec lam the can cuoc
        //cac chu CA can thông tin de in lên the
        //sau khi chò khô, ta dc object thuoc nhom vua duc
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
    //  bien/ten tat      object
    //  co object thi object se biet lam gi do 
        chiHu.bark();
    
        Dog ngaoDa = new Dog("NGAO DA", 2020, 2.0);
        ngaoDa.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB is " + chYob);
        
        System.out.println("NÐ YOB is " + ngaoDa.getYob());
        
    }
    
}
