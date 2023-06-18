public class String_Handling_4 {
    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        veryLongString = veryLongString.replace("um","HUM");
        //System.out.println(veryLongString);
        //System.out.println(veryLongString.indexOf("aliquip"));
        String sub1 = veryLongString.substring(0,200);
        //System.out.println(veryLongString.length());
        String sub2 = veryLongString.substring(201,448);

        System.out.println(sub1.trim());
        System.out.println(sub2.trim());


        //l'esercizio qui chiede di "printing the result of exclusive or of the 2 searches"
        //non comprendo il significato della frase,ma nella chat di discord leggo che bisogna printare lo xor, sperando di aver capito bene:
        boolean contains1 = sub1.contains("est");
        boolean contains2 = sub2.contains("est");
        boolean result = contains1^contains2;
        System.out.println(result);
    }
}
