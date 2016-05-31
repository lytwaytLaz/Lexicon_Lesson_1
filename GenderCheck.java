/**
 * What does it do?
 *
 * @param
 * @author László Hágó 2016-05-29.
 * @return
 */
public class GenderCheck {
    public static void main(String[] args) {
        int sexNumber = Character.getNumericValue(args[0].charAt(args[0].length() - 2));
        if(sexNumber % 2 == 0) {
            System.out.println("Du är kvinna");
        }
        else
        {
            System.out.println("Du är man");
        }
    }
}
