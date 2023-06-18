public class Car {

    public String modelName;
    public int mileage;

    public Car(String modelName, int mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println(modelName+mileage);
    }

    public void getCarDetails(){
        System.out.println(modelName+"\n"+mileage);
    }

}
