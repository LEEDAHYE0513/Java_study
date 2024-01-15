package collection.app;

import java.util.Arrays;
import java.util.Comparator;

public class DotMain {
    public static void main(String[] args) {
        Dot[] dots = new Dot[3];
        dots[0] = new Dot(1, 4);
        dots[1] = new Dot(1, 1);
        dots[2] = new Dot(2, 2);


        //Arrays.stream(dots).forEach(number -> System.out.println(number.getX() +number.getY()));
        Arrays.stream(dots).forEach(number -> System.out.println(number.getX() + ", " + number.getY()));
    }

}
