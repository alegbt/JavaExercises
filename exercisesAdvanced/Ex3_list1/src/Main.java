import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"roma", "milano", "ugonia"};
        final List<String> cityNames = Arrays.asList(arr);
        //cityNames.add("napoli"); xke e' final
        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");
        System.out.println(kingsOfRome);

        //Sbagliato
        //String[] kingsOfRomeArray = new String[0];
        //kingsOfRome.toArray(kingsOfRomeArray);
        //kingsOfRomeArray[6] = "Lucius Tarquinius Supercar"

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));


    }
}