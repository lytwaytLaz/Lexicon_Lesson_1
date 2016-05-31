import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * What does it do?
 *
 * @param
 * @author László Hágó 2016-05-29.
 * @return
 */
public class BetterBirthday {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Usage: Echo <string>");
            System.exit(1);
        }
        int monthNum = Integer.parseInt(args[0].substring(2, 4));
        int dayNum = Integer.parseInt(args[0].substring(4,6));

        LocalDateTime timePoint = LocalDateTime.now();
        int month = timePoint.getMonthValue();
        int day = timePoint.getDayOfMonth();

        if(monthNum == month & dayNum == day) {
            System.out.println("Happy Birthday!");
        }
    }
}

