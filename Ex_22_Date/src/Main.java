import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        int numberDaysToday = today.getDayOfMonth();
        int monthDays = today.getMonth().length(false);
        int sum = monthDays-numberDaysToday;
        System.out.println(sum);

        int daysOfYear = today.getDayOfYear();
        int monthYear = today.lengthOfYear();
        int sum2 = monthYear-daysOfYear;
        System.out.println(sum2);
    }
}