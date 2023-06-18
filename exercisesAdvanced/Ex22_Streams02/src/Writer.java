import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {


    public void write(String ldt, String filePath){
        try(
                FileWriter writer = new FileWriter(filePath);
                BufferedWriter br = new BufferedWriter(writer);
        ){
            br.write(ldt);
        }catch (Exception e){
            e.printStackTrace();
        }
    }











}
