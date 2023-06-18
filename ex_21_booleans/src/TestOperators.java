public class TestOperators {
    public static void main(String[] args) {

        int a = 15;
        a+=5;
        a-=4;

        int b = a;
        b++;

        System.out.println(a);
        System.out.println(b);

        if(b%2!=0){
            System.out.println(b+" is an odd number");
        }else{
            System.out.println(b+" is an even number");
        }


        if((b * b + 1) % 3 == 0){
            System.out.println("the result is a multiple of 3");
        }else{
            System.out.println("the result isn't a multiple of 3");
        }

    }
}
