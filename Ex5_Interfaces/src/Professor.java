public class Professor extends CollegePerson implements TeachingPerson {

    String teachingSubject;

    @Override
    public void teachToOtherPeople() {
        System.out.println("the professor can teach");
    }


    public Professor(String name, String surname, int id, String subject){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.teachingSubject=subject;
    }
}
