public class Animal {

    String animalName;


    public Animal(){
        String name = animalName;
    }


public void animalSound(){
    System.out.println("Roarr!");
}


    public void animalSound(String intensity){
        if(intensity=="high"){
            System.out.println("Roarrrrrrrr!");
        }else if(intensity=="low"){
            System.out.println("Roar");
        }else{
            System.out.println("Cannot reproduce properly");
        }
    }
}
