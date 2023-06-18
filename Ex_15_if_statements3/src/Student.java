import java.util.Random;

public class Student {

    public String name;
    public int age;
    Random random = new Random();

    public Student(String studentName, int studentAge){
        this.name=studentName;
        this.age=studentAge;
    }


    public int guessingAge(){
      int randomAge=random.nextInt(35);
        System.out.println("i generated "+randomAge+" for "+name);
        if(randomAge>age){
            System.out.println("the random number is bigger than the student's age");
        }else if(randomAge==age){
            System.out.println("the random number equal to the student's age");
        }else if(randomAge<age){
            System.out.println("the random number is smaller than the student's age");
        }
      return randomAge;
    }

}
