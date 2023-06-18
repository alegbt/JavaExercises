
import java.util.List;

public class Student {

    String studentName;
    String studentSurname;
    double marksAverage;

    public Student(){};

    public Student(String name, String surname, double average){
    this.studentName = name;
    this.studentSurname = surname;
    this.marksAverage = average;
    }


    public static double getAverageMark(List<? extends Number> listOfMarks){
        double sum = 0;

        for (Number x:listOfMarks) {
            sum += x.doubleValue();
        }
          return sum/listOfMarks.size();
    }
    

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }

}
