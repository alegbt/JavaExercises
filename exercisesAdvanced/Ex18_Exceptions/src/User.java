public class User {

    public static void checkScore(double score) throws ArithmeticException{
        if(0<score && score<=50.00){
            System.out.println(score+" Average score");
        }else if(50.00<score && score<=100.00){
            System.out.println(score+" Very good score");
        }else{
            throw new ArithmeticException(score+" Score is out of scale!"); //dove vedo questo?
        }
    }

    public static void main(String[] args) {

        try{
        checkScore(2.15);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("2.15 was an exception");
        }

        try{
            checkScore(50);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("50 was an exception");
        }

        try{
            checkScore(95.02);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("95.02 was an exception");
        }

        checkScore(100.01); // cosi vedo l'errore a riga 9

        try{
            checkScore(100.01);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("100.01 was an exception");
        }

        try{
            checkScore(-2.15);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("-2.15 was an exception");
        }


    }
}