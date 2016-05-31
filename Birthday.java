/**
 * What does it do?
 *
 * @param
 * @author László Hágó 2016-05-29.
 * @return
 */
public class Birthday {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: Echo <string>");
            System.exit(1); // exit to be used with care
        }
//        if(args.length != 0) {
//            for (String x : args) {
//                System.out.println(x);
//            }
//        }
        if(args[0].equals("2016-03-02") & args[1].equals("860302-3332")) {
            System.out.println("Grattis");
        }
    }
}
