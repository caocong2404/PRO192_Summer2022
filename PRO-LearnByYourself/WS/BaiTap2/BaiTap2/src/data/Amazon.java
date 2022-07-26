
package data;


public class Amazon {
    private String name;
    private int price;
    private double rate;

    public Amazon(String name, int price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }
    
    public void printInfo(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Amazon store");
        System.out.println("The book name is " + name);
        System.out.println("Price: " + price + "VND");
        System.out.println("Rate: " + rate + " star");
    }
}
