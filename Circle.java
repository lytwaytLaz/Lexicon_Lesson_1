
import static java.lang.Math.*;

/**
 * Calculates the area of a circle
 *
 *
 * @author László Hágó 2016-05-29.
 * @param
 * @return nothing
 */
public class Circle {
    public static void main(String[] args) {

        try {
            double radius = Double.parseDouble(args[0]);
            double area = radius * radius * PI;
            double circ = 2 * radius * PI;
            System.out.printf("Cirkelns area är %f och omkretsen är %f", area, circ);
//            System.out.printf(" och omkretsen är %.2f", circ);
        }
        catch (NumberFormatException|ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: java Circle <number>");
        }

    }
}
