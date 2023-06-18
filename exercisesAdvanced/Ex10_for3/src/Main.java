import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    String[]arr = new String[]{"lun","mar","mer","gio","ven","sab","dom"};

        for (int i = 0; i<=1 ; i++) {
            arr[0] = arr[0].toUpperCase();
            for(int j=2; j<arr.length; j=j+2){
                arr[j]=arr[j].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}