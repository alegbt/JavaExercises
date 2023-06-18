public class String_handling_2 {
    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0,7);
        String sub2 = string1.substring(6,14);

        String concat1 = sub1.concat(string2.concat(sub2)).toUpperCase();

        char[]charArray = concat1.toCharArray();
        for(int i=0; i<charArray.length; i++){
            System.out.print(charArray[i]);
        }
    }
}
