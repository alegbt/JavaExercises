public class Car extends Vehicle{

    int numberOfDoors;
    double carPrice;

    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("the car has "+numberOfDoors+" doors");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("car's honk: popi");
    }

    public Car (int wheels, int doors, int price){
        this.type="car";
        this.numberOfWheels=wheels;
        this.numberOfDoors=doors;
        this.carPrice=price;
    }
}
