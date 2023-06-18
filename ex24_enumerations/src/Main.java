enum Months {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

public class Main {
    public static void main(String[] args) {

        for (Months months : Months.values()) {
            if (months.name().endsWith("y")) {
                System.out.println(months + " ends with y");
            } else {
                System.out.println(months+ " doesn't end with y " );
            }
        }
    }
}