/**
 * Echos the command line input
 *
 * @param
 * @author László Hágó 2016-05-28.
 * @return
 */

public class Echo {
    public static void main(String[] args) {
        if(args.length != 0) {
            System.out.println(args[0]);;
        }
        else {
            System.out.println("Mata in Hej");
            System.out.print("Sir");

        }
    }
}