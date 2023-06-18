public class Main {
    public static void main(String[] args) {

        House house1 = new House();
        house1.address = "Via Colombo";
        house1.numberOfFloors = 3;

        house1.House();

        House house2 = new House();
        house2.address = "Via Trastevere";
        house2.numberOfFloors = 4;

        house2.House();
    }
}