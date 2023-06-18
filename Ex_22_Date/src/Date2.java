import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date2 {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter timeForm = DateTimeFormatter.ofPattern("dd-MMMM-yy-hh-mm");
        System.out.println(time.format(timeForm));

        ZonedDateTime zTime = ZonedDateTime.now();
        System.out.println(zTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
