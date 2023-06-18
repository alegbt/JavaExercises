/**
 * The class where we create the methods for the basic arithmetical operations
 * @author Alessandro Gobetti
 */
public class ArithmeticOperators {

    /**
     * Method to sum two numbers
     * @param num1 the first number you want to sum
     * @param num2 the second number you want to sum
     * @return the sum of num1 and num2
     */
    public int sum(int num1, int num2){
        return num1+num2;
    }

    /**
     * Method to subtract two numbers
     * @param num1 the number you want to subtract from
     * @param num2 the amount you want to subtract from num1
     * @return the subtraction of num1-num2
     */
    public int sub(int num1, int num2){
        return num1-num2;
    }

    /**
     * Method to multiply two numbers
     * @param num1 the base number of the multiplication
     * @param num2 the amount of times you want to multiply num1 to
     * @return the multiplication of num1 by value of num2
     */
    public int mul(int num1, int num2){
        return num1*num2;
    }


    /**
     * Method to divide two numbers
     * @param num1 the base number of the division
     * @param num2 the number you want num1 to be divided for
     * @return the first number divided by the econd
     */
    public int div(int num1, int num2){
        return num1/num2;
    }

}
