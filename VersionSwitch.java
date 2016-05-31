/**
 * Prints out version number if user
 * inputs -v or -V on the command line
 *
 * @param
 * @author László Hágó 2016-05-28.
 * @return
 */
public class VersionSwitch {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: Echo <string>");
            System.exit(1); // exit to be used with care
        }
        switch(args[0]) {
            case "-v": System.out.println("Version 1.7");
                break;
            case "-V": System.out.println("Version 1.7");
                break;
            default: System.out.println("Ta en öl till!");
        }
    }
}
