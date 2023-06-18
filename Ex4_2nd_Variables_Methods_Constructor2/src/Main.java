public class Main {
    public static void main(String[] args) {


        Student ale = new Student("Ale");
        Student mario = new Student("Mario");


        Teacher teacher1 = new Teacher("Maria");

        ale.grade = 1;
        mario.grade = 2;

        teacher1.assignGrade(ale,3);
        teacher1.assignGrade(mario,4);

        ale.getStudentDetails();
        mario.getStudentDetails();

    }
}