package it.exercises.classesObjects;

public class TestProgrammers {
    public static void main(String[] args) {

    Programmer myself = new Programmer();
    myself.name = "ale";
    myself.age = 28;
    myself.wearsGlasses = false;

    Programmer marioRossi = new Programmer();
    marioRossi.name = "mario";
    marioRossi.age = 25;
    marioRossi.wearsGlasses = true;

    myself.drinkCoffe();
    myself.printDetails();


    marioRossi.printDetails();
    marioRossi.hasGlasses();

    }

}
