public class Student extends CollegePerson implements LearningPerson{

    public int academicYear;

    @Override
    public void studyAtHome() {
        System.out.println("the student studies at home");
    }



    public Student(String name, String surname, int id,int year){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.academicYear=year;
    }





}
