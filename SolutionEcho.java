/**
 * Echos the command line input
 *
 * @param
 * @author Daniel Eriksson
 * @return
 */
public class SolutionEcho {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage: Echo <string>");
            System.exit(1); // exit to be used with care
        }
        System.out.println(args[0]);
    }
}
