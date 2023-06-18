import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        String a = string1.substring(0,2);
        String b = string2.substring(10,12);
        String c = a.concat(b);

        char[]charArray = c.toCharArray();
        for(int i=0; i<charArray.length; i++){
            System.out.println(charArray[i]);
        }

    }
}