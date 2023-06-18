public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson {

    boolean isGoingToBeAPhD;

    @Override
    public void studyAtHome() {
        System.out.println("the assistant studies at home");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("the assistant can teach to others");
    }


    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.isGoingToBeAPhD=willBeAPhD;
    }
}
