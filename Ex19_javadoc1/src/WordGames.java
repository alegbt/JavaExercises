/**
 * This class defines the methods the exercise asks you to do so that you can use them in the main class
 * @author Alessandro Gobetti
 */
public class WordGames {


    /**
     * This method prints "Hello " followed by the String you input as a parameter
     * @param word What will be printed after "Hello "
     * @return The String "Hello " followed by what you input as a parameter
     */
    public String addHelloWord(String word){
        return "Hello "+word;
    }


    /**
     * This method prints the name and surname parameters you input with a space between them
     * @param name Type the name you want to print
     * @param surname Type the surname you want to print
     * @return The name and the surname with a space between them
     */
    public String getFullName(String name,String surname){
       return name+" "+surname;
    }
}
