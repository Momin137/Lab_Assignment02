package problem12;

import java.util.Random;
public class RandomPrice {
    public static void main(String[] args) {
        Random generator = new Random();
        int dollars = generator.nextInt(10)+10;
        int cents = generator.nextInt(96)+5;
        System.out.println("The random price is: "+dollars);
    }
}
