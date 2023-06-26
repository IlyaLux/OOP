package sem6_hw6;

import sem6_hw6.Work3.Greeter;
import sem6_hw6.Work3.GreetingCasual;
import sem6_hw6.work1.Rectangle;
import sem6_hw6.work1.Square;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        // work1
        Square square = new Square();
        square.setSide(5);
        System.out.println("Сторона квадрата: " + square.getSide());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(3);
        System.out.println("Стороны прямоугольника: " + rectangle.getHeight() + " и " + rectangle.getWidth());

        // work3
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());
        greeter.setGreeting(new GreetingCasual());
        System.out.println(greeter.greet());

    }
}