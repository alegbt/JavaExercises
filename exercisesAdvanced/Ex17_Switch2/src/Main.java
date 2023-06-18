import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        while(true){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            switch(str){
                case "size" -> System.out.println(list.size());
                case "clear" -> list.clear();

                //case "print" -> System.out.println(list);                       //print semplice della List
                case "print" -> {for (String x :list) {System.out.println(x);}}   //print di singoli elementi di type facilmente modificabile - credo più utile come codice nel caso non fosse stata una List di primitive (?)

                default -> list.add(str);
            }
        }

    }
}