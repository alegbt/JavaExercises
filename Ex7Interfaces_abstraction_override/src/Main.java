public class Main {
    public static void main(String[] args) {

        Car alfa = new Car(4,2,2000);
        Boat costa = new Boat(100,500);

        alfa.showVehicleDetails();
        alfa.doVehicleSound();

        System.out.println("---------------------------");

        System.out.println(costa.getBoatWeightAndSpeed());
        costa.doVehicleSound();
    }
}