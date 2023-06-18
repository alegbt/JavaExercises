public class Main {
    public static void main(String[] args) {


Student student = new Student("Ale","Gob",165,1);

Professor professor = new Professor("Mario","Rossi",123,"Letteratura");

Assistant assistant = new Assistant("Maria","Rosa",125,true);

student.goToCollege();
professor.goToCollege();
assistant.goToCollege();

student.studyAtHome();

professor.teachToOtherPeople();

assistant.studyAtHome();
assistant.teachToOtherPeople();
    }
}
