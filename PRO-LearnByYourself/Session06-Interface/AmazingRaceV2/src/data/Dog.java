
package data;

import java.util.Random;


public class Dog extends Pet {
    
    public static final double MAX_SPEED = 50;
    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|","DOG", name, yob, weight, run());
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    
    
    
    
}
