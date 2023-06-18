import java.util.Random;

public class CustomNumber {

    int number;

    public CustomNumber(){
        Random r = new Random();
        number = r.nextInt(13);
        System.out.println(number);
    }

    public void getMultiplicationTable() {
        for (int i = 12; i > 0; i--) {
            System.out.println(number*i);
        }

    }





}
