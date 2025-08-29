package Day04;


import java.util.*;

class Circle {
    int radius;
    static double PI;


    static {
        System.out.println("Static Block");
        PI = 3.14;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of Circle " + area);

    }
}

public class program04 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(4);

        c1.calculateArea();
        c2.calculateArea();

//        System.out.println("value of PI - " + Circle.PI);
//        System.out.println("value of radius - " + c1.radius);
//        System.out.println("value of radius - " + c2.radius);



    }
}
