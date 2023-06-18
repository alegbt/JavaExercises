public class Main {
    public static void main(String[] args) {

        SmartphonePrice sm1 = new SmartphonePrice("Producer Price ",400);
        SmartphonePrice sm2 = new SmartphonePrice("Retail Price ",600);

        SmartphonePrice sm3 = new SmartphonePrice("Producer Price ",500);
        SmartphonePrice sm4 = new SmartphonePrice("Retail Price ",900);

        Smartphone smart1 = new Smartphone("Samsung","s9",300,sm1,sm2);
        Smartphone smart2 = new Smartphone("apple","14",400,sm3,sm4);

        System.out.println("Smartphone 1: "+smart1);
        System.out.println("Smartphone 2: "+smart2);

        boolean compare = smart1.equals(smart2);
        System.out.println("is smartphone 1 equal to smartphone 2? "+compare);



        try {
            Smartphone clonedSmart2 = smart2.clone();
            clonedSmart2.brandName = "apple";
            clonedSmart2.modelName = "14";
            clonedSmart2.batterymAh = 400;
            clonedSmart2.producerPrice = sm3;
            clonedSmart2.retailPrice = sm4;
            System.out.println(clonedSmart2);
            boolean out = sm2.equals(clonedSmart2);
            System.out.println("is smartphone 2 equal to clonedSmart2? "+out);
        }catch(Exception exception){
            exception.printStackTrace();
            System.out.println("Error");
        }

    }
}