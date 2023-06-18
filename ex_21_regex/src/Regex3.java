public class Regex3 {

    public static void main(String[] args) {

        String s1 = "are you able to climb, are you able to swim or are you able to fly?";

        System.out.println((s1.replaceAll("\\sare","_xyz")));

    }
}
