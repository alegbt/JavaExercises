public class Main {
    public static void main(String[] args) {


        GenericsClass<Integer> firstElement = new GenericsClass<>();
        GenericsClass<Integer> secondElement = new GenericsClass<>();

        GenericsClass<String> thirdElement = new GenericsClass<>();
        GenericsClass<String> fourthElement = new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);

        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        System.out.println("Is the first element equal to the second? "+GenericsClass.isEqual(firstElement,secondElement));
        System.out.println("Is the third element equal to the fourth? "+GenericsClass.isEqual(thirdElement,fourthElement));

    }
}