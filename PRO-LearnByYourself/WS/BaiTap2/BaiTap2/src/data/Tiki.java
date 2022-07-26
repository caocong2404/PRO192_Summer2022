
package data;


public class Tiki {
    private String name;
    private int price;
    private double rate;

    public Tiki(String name, int price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }
    
    public void printInfo(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Tiki store");
        System.out.println("The book name is " + name);
        System.out.println("Price: " + price + "VND");
        System.out.println("Rate: " + rate + " star");
    }
}
