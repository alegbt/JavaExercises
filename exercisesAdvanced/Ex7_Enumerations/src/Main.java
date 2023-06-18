import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        enum Month{
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        }


        for (Month x:Month.values()) {
            if (x.name().toLowerCase().endsWith("y")) {
                System.out.println(x+" ends with y");
            }else System.out.println(x+ " does not end with y");
        }

        System.out.println("-------------------------------------------");

//avevo inizialmente fatto questo non rendendomi conto che potevo usare .name con gli enum per trattarli come
//String, suppongo la prima soluzione sia migliore dato che richiede prestazioni
        ArrayList<String> monthArrayList = new ArrayList<>();

        for (Month x:Month.values()) {
            monthArrayList.add(x.toString());
            if(monthArrayList.size()==Month.values().length){
                for (String y:monthArrayList) {
                    if (y.toLowerCase().endsWith("y")) {System.out.println(y+" ends with y");}
                    else System.out.println(y+" does not end with y");
                }
            }
        }

        }
}