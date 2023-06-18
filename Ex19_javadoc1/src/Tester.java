/**
 * This is the Class where we test the WordGames Class
 * @author Alessandro Gobetti
 */
public class Tester {

    /**
     *This is the main class where we test the methods written in WordGames
     * @param args it supplies the arguments in it as an array of String objects
     */
    public static void main(String[] args) {

        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord("alessandro"));
        System.out.println(wordGames.getFullName("ale","gob"));

    }
}
