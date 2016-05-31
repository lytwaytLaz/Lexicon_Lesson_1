/**
 * Reverses the command line integer input
 *
 * @param
 * @author László Hágó 2016-05-28.
 * @return
 */
public class ReverseOrder {
    public static void main(String[] args) {
//        // only works if no numbers == 0
//        if (args.length != 1) {
//            System.err.println("Usage: Echo <string>");
//            System.exit(1); // exit to be used with care
//        }
//        int number = Integer.parseInt(args[0]);
//        int newNum = 0;
//
//        while(number > 0) {
//            newNum = newNum * 10 + number % 10;
//            number = number / 10;
//        }
//        System.out.println(newNum);

        // the most javaesque way
        StringBuilder number = new StringBuilder(args[0]);
        System.out.println(number.reverse());


    }
}