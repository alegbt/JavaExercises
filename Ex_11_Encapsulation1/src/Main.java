import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        House casa = new House();
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number of floors: ");
        casa.setFloorsNumber(sc.nextInt());
        sc.nextLine();

        System.out.println("Type the address: ");
        casa.setAddress(sc.nextLine());

        System.out.println("Type the name of the residents with a comma in between them: ");
        casa.setResidentNames(sc.nextLine().split(","));

        System.out.println("floor is "+casa.getFloorsNumber());
        System.out.println("address is "+casa.getAddress());
        System.out.println("residents are: "+ Arrays.toString(casa.getResidentNames()));







    }
}