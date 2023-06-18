import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        System.out.print("Welcome user, a number from 1 to 10 has been created ");

        boolean cond  = true;
        while (cond){
            Random rand = new Random();
            String number = Integer.toString(rand.nextInt(1, 10+1));  //parse a String per controllare successivamente che gli input siano corretti
            System.out.println("try to guess it!");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            boolean numMatch = input.matches("[0-9]|(10)");    //condizione per controllare che l'user input sia corretto
            if(input.equals(number)){
                    System.out.println("Congratulations! You won! You guessed "+input+" and the correct number was "+number);
                    cond=false;
                }else if (numMatch){    //numMatch controlla che non si scrivano numero al di fuori di 1-10
                System.out.printf("You lost! You guessed "+input+" and the correct number was "+number +"\nAnother number has been created ");
            }else{
                System.out.print("You have to write a number in between 1 to 10, try again! \nAnother number has been created ");
            }
        }

    }
}






