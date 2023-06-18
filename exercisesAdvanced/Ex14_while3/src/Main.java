public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 0;
        int d = 0;

        while(a<=2){
            System.out.println(a);
            b=b+a;
            System.out.println(b);
            while(d<=34) {
                c = a + b;
                a = c;
                System.out.println(c);
                d = a + b;
                b = d;
                System.out.println(d);
            }
        }


    }
}