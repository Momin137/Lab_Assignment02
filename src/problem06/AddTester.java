package problem06;

import java.awt.*;
public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("Expected x is: 0");
        System.out.println("Expected y is: 0");
        System.out.println("Expected width is: 25");
        System.out.println("Expected Height is: 40");
        System.out.println("Actual x is: "+box.getX());
        System.out.println("Actual y is: "+box.getY());
        System.out.println("Actual width is: "+box.getWidth());
        System.out.println("Actual height is: "+box.getHeight());
    }
}
