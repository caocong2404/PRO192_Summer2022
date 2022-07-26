
package data;
//Khuon dung de duc ra cac object
//Khuon phai kin, có pheu de rot data, nguyen lieu vao
public class Dog {
    //chua cac dac diem, chi tiet ma cai khon, object tuong lai se co
    //Khuon design ra sao, mai mot object co the
    private String name;    //_________________
    private int yob;        //_________________
    private double weight;  //_________________
    //.....
    //~~ CMND, the ca cuoc, khac value do vao, template
    //Phai co khuôn thì phai co pheu de hung vat lieu di vào
    //Pheu dung de nhn vat lieu duc ra, tao ra, construct cai object
    public Dog(String iName, int iYob, double iWeight){
        name    = iName; 
        yob     = iYob;
        weight  = iWeight;
    }
    
    //ham goi n lan. hanh dong object nào do làm di làm lai
    //hanh dong cu object goi n lan
    public void bark(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println("My name is " + name);
//        System.out.println("My yob is " + yob);
//        System.out.println("My weight is " + weight);
        System.out.printf("%-10s|%4d|%4f\n", name, yob, weight);
    }
    
    public void updateWeight(double upWeight){
        weight = upWeight;
    }
    
    public int getYob(){
        return yob;
    }
    
}
