import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

//Write a program that:
//
//write using FileWriter the current date/time with seconds inside a file in src called file.txt
//if the file already exists, alert the user about overwriting it
//if not, alert the user of the new file creation


        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy ss"); //la traccia intendeva SOLO con secondi? altrimenti avrei lasciato HH:mm:ss
        time.format(dtf);
        String path = "./src//newfile.txt";
        Writer wr = new Writer();

        File f = new File("./src//newfile.txt");
        if(f.exists()){
            System.out.println("The file \"newfile\" in the path " +path+ " already existed, it has now been overwritten");
            wr.write(time.format(dtf), path);
        }else{
            System.out.println("newfile has been created in path "+path);
        wr.write(time.format(dtf), path);
        }








    }
}