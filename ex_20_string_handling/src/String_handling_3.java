
public class String_handling_3 {
    public static void main(String[] args) {

String[]array1 = {" I want "," to learn "," how to code! " };
String[]array2 ={array1[0].trim(),array1[1].trim(),array1[2].trim()};
int statement1 = array2[0].compareTo("I want");
int statement2 = array2[1].compareTo("to learn");

System.out.println(!(statement1 > statement2));

    }
}
