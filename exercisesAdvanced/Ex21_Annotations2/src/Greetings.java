public class Greetings {

    @DevAnnotation(DevName = "John", DevSurname = "Walker")
    void sayWelcome(){
        System.out.println("welcome");
    }

    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    void sayGoodbye(){
        System.out.println("goodbye");
    }

}
