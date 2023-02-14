package Less1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hello {
    //сниппет main:
    public static void main(String[] args) {
        //сниппет sout:
        System.out.println("Hello World");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.YYYY");
        System.out.println(formatter.format(now));
    }
}
