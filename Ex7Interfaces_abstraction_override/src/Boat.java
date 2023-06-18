public class Boat extends Vehicle{

    double maxKnotsSpeed;
    double boatKilosWeight;


    @Override
    public void doVehicleSound() {
        System.out.println("boats's honk: pooo");
    }


    public Boat(double maxSpeed, double weight){
        this.type="boat";
        this.maxKnotsSpeed=maxSpeed;
        this.boatKilosWeight=weight;
    }


    public String getBoatWeightAndSpeed(){
        return "The boat's knot speed is: "+this.maxKnotsSpeed+" and its weight is: "+this.boatKilosWeight+ " kg";
    }

    @Override
    public String toString() {
        return getBoatWeightAndSpeed();
    }
}
