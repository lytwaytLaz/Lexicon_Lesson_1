/**
 * Echos the command line inputs
 *
 * @param
 * @author László Hágó 2016-05-28.
 * @return
 */
public class EchoArguments {
    public static void main(String[] args) {
        if(args.length != 0) {
            for(String x: args) {
                System.out.println(x);
            }
//            for(int i = 0; i < args.length; i++)
//                System.out.println(args[i]);
        }
        else {
            System.out.println("Mata in några värden som ska skrivas ut");
        }
    }
}
