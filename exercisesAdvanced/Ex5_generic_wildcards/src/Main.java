import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Double> individualMarksListLisa = new ArrayList<>();
        List <Integer> projectMarksListJeremy = new ArrayList<>();

        individualMarksListLisa.add(7.6);
        individualMarksListLisa.add(9.3);


        projectMarksListJeremy.add(7);
        projectMarksListJeremy.add(5);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Double> listOfStudents = new ArrayList<>();
        listOfStudents.add(lisaAvg);
        listOfStudents.add(jeremyAvg);

        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
    }
}