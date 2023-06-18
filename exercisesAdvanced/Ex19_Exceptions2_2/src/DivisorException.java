public class DivisorException extends Exception{

    double divisor;

    DivisorException(double divisor){
        this.divisor=divisor;
    }

//    @Override
//    public String getMessage() {
//        return "Exception occurred: it is not possible to divide by 0";
//    }

}
