import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean loopExit = true;

        while(loopExit){
        System.out.println("Please enter a command");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean numMatch = input.matches("[0-9]*");
        if(input.equalsIgnoreCase("stop")){
            loopExit=false;
        }else if (numMatch){
            int num = Integer.parseInt(input);
            System.out.println(num+num);
        }else{
            System.out.println(input);
            }
        }

    }
}