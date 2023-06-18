import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many floors does the house have?");
        house.setFloorNumbers(scan.nextInt());
        scan.nextLine();

        System.out.println("What is the address?");
        house.setAddress(scan.nextLine());

        System.out.println("Type the name of the residents who live in that house; separe one to each other by a comma: ");
        house.setResidentsNames(scan.nextLine().split(","));

        System.out.println("The house has " + house.getFloorNumbers()+" floors");
        System.out.println("The address is " + house.getAddress());
        System.out.println("The names of those who live in that house are: " + Arrays.toString(house.getResidentsNames()));
    }
}