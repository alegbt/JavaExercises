public class Regex2 {
    public static void main(String[] args) {

        String s1 = "tup tuup tuuup tuuuup";
        System.out.println(s1.replaceAll("u{2,3}","X"));

    }
}
