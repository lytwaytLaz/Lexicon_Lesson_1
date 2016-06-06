/**
 * Prints out a triangle of *.
 * User inputs number of row on command line.
 * Number of * increases by 2 on each line (1,3,5,7...)
 *
 * @param
 * @author László Hágó 2016-05-28.
 * @return
 */
public class EnhancedTriangle {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java EnhancedTriangle <rows>");
            System.exit(1); // exit to be used with care
        }
        int count = 1;
        int rows = Integer.parseInt(args[0]);
        int numChar = rows * 2 - 1; // calculate max number of characters

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < numChar; j++) {
                if(j < (numChar - count) / 2) {
                    System.out.print(" ");
                }
                else
                {
                    if( j < (numChar - count ) / 2 + count) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
            count += 2;
        }
    }
}
