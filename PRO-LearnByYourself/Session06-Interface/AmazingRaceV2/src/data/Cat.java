
package data;

import static data.Pet.MAX_SPEED;
import java.util.Random;

/**
 *
 * @author CONG
 */
public class Cat extends Pet {
    
    public static final double MAX_SPEED = 30;
    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|","CAT", name, yob, weight, run());
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
}
