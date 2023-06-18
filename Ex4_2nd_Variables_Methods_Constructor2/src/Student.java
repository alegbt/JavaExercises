public class Student {

    public String name;
    public int grade;

    public Student(String studentName){
        System.out.println("student obj created");
        name = studentName;
    }

    public void getStudentDetails(){
        System.out.println(" student name is "+name+ " student grade is "+grade);
    }

}
