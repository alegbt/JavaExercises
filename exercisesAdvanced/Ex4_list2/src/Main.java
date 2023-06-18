import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.size());

        randomNumbers.stream().filter(i -> Collections.frequency(randomNumbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);

        //randomNumbers.remove(10);
        randomNumbers.remove(0);
        randomNumbers.remove(2);
        System.out.println(randomNumbers);


        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println(randomNumbers);













   /*     int a = randomNumbers.get(0);
        for(int i=0;i<randomNumbers.size();i++){
            for(int j=0; j<randomNumbers.size();j++){
                if(randomNumbers.get(j)==a){
                    System.out.println("duplicate found in position "+ j);
                }else{}
                a=randomNumbers.get(i);
            }
        }
*/

    }
}