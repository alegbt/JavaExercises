import java.util.Scanner;

public class ScannerInputs {

public void inputDividendDivisorDivision() throws DivisorException{
    System.out.println("input dividend: ");
    Scanner sc = new Scanner(System.in);
    double dividend = sc.nextInt();
    sc.nextLine();
    try {
        System.out.println("input divisor: ");
        double divisor = sc.nextDouble();
        if (divisor == 0) {
            throw new DivisorException(divisor);
        } else {
            sc.nextLine();
        }
        System.out.printf(dividend + " divided by " + divisor + " equals to: %.2f \n", dividend / divisor);
    }catch (DivisorException e){
        System.out.println("Division exception occurred, you divided by 0");
    }
}


}
