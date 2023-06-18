public class Main {
    public static void main(String[] args) {

        while(true){
            System.out.println("i am in loop");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }

    }
}