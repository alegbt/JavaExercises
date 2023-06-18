public class Main {
    public static void main(String[] args) {

        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        int f4 = 0;

        for(int i=0; i<=0;i++){
            System.out.println(f1);
            f2=f2+f1;
            System.out.println(f2);
            for(int j = 0; j<=3; j++) {
                f3 = f1 + f2;
                f1 = f3;
                System.out.println(f3);
                f4 = f1 + f2;
                f2 = f4;
                System.out.println(f4);
            }
            System.out.println(f1+f2); //per printare 1 solo in piu
        }







    }
}