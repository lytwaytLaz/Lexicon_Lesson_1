import java.io.IOException;

/**
 * What does it do?
 *
 * @param
 * @author László Hágó 2016-05-29.
 * @return
 */
public class Wait {
    public static void main(String[] args) throws IOException {
        int ch = 0;
        while (ch != 'Q' && ch != 'q')
        {
            System.out.println("Press Q or q to quit.");
            ch = System.in.read();
        }
    }
}
