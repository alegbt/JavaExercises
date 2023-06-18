public abstract class Vehicle {

    String type;
    int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("The vehicle is a "+ type +" and it has "+ numberOfWheels +" wheels");
    }

    public abstract void doVehicleSound();

}
