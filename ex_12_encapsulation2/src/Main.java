import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

Person person = new Person();
Scanner sc = new Scanner(System.in);



        System.out.println("Type the person's name:  ");
        person.setName(sc.nextLine());

        System.out.println("Type the person's surname: ");
        person.setSurname(sc.nextLine());

        System.out.println("Type the person's age: ");
        person.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Type the exact person's height: ");
        person.setHeight(sc.nextDouble());

        System.out.println("The person's name is: "+person.getName());
        System.out.println("The person's surname is: "+person.getSurname());
        System.out.println("The person's age is: "+person.getAge());
        System.out.println("The person's height is :"+df.format(person.getHeight()));

    }
}