
package data;

public class Book {
    private String id, name, author;
    private double price, rate;
    

    public Book(String id, String name, String author,
           double price, double rate) {
        
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.rate = rate;
    }
    
    
    
    public void showProfile(){
        System.out.printf("|ID: %-8s|Name: %s|Author: %s|Price: %.4f|Rate: %.1f|");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getId() {
        return id;
    }
    
}
