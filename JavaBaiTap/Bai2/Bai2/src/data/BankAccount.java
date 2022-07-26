
package data;

public class BankAccount {
    private int digit;
    private String name;
    private int card;
    private int phoneNumber;
    private int money;

    public BankAccount(int digit, String name, int card, 
                                               int phoneNumber, int money) {
        this.digit = digit;
        this.name = name;
        this.card = card;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }
    
    public void withDraw(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ID: " + digit);
        System.out.println("Name: " + name);
        System.out.println("CMND: " + card);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Your account have " + money + "VND");
    }
    
    public void setMoneyUp(int money){
        this.money += money;
        System.out.println("Get money to your account success");
    }
    
    public void setMoneyDown(int money) {
        if ((this.money - money) < 50000)
        {
            
            System.out.println("Fail");
            System.out.println("The money in account must more than 50 000VND!!");
        }
        else
        {
            this.money -= money;
            System.out.println("Success!");
        }
    }
    
    
}
