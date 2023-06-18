import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy ss"); //la traccia intendeva SOLO con secondi? altrimenti avrei lasciato HH:mm:ss
        time.format(dtf);
        String path = "./src//newfile.txt";
        Writer wr = new Writer();

        File f = new File("./src//newfile.txt");
        if (f.exists()) {

            System.out.println("The file \"newfile\" in the path " + path + " already exists, do you want to overwrite it? \n   1- Yes \n   2- No");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            boolean exit = true;

            while (exit) {
                if (input.equalsIgnoreCase("yes")||input.equals("1")) {
                    wr.write(time.format(dtf), path);
                    System.out.println("File has been overwritten");
                    exit = false;
                } else if (input.equalsIgnoreCase("no")||input.equals("2")) {
                    System.out.println("File has not been overwritten");
                    exit = false;
                }
            }
                }
        else {
                    System.out.println("\"newfile\" has been created in path " + path);
                    wr.write(time.format(dtf), path);
        }
    }
}