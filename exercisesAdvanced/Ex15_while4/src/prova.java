import java.util.Random;
import java.util.Scanner;

public class prova {
    public static void main(String[] args) {



       // boolean match = a.matches("[0-10]");


        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean match = a.matches("[0-9]|(10)");
        System.out.println(match    );



    }
}
