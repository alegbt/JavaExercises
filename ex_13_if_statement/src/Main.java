public class Main {
    public static void main(String[] args) {

        String myName="alessandro";

        System.out.println("the name "+myName+" has "+myName.length()+ " letters in it, therefore: ");

        if(myName.length()%2==0){
            System.out.println("the name has an even number of letters");
        }else{
            System.out.println("the name has an odd number of letters");
        }

    }
}