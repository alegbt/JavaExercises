import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String aliceToDos[] = new String[]{"Coding", "Reading", "Learning"};
        String bobToDos[] = new String[]{"Reading", "Coding", "Learning","Sleeping"};
        String timToDos[] = new String[]{"Reading", "Learning", "Coding"};

        System.out.println("Is Alice's array equal to Bob array? " + aliceToDos.equals(bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + aliceToDos.equals(timToDos));

        System.out.println("Is Alice's array having the same length of Bob's array? " +
                (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " +
                (aliceToDos.length == timToDos.length));

        System.out.println("Is Alice having the same tasks of Bob?1 " +
                Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice having the same tasks of Bob?2 " +
                Arrays.deepEquals(aliceToDos,bobToDos));
        System.out.println("Is Alice having the same tasks of Bob?3 " +
                Arrays.mismatch(aliceToDos,bobToDos));

        System.out.println("Is Alice having the same tasks of Tim?1 " +
                Arrays.equals(aliceToDos, timToDos));
        System.out.println("Is Alice having the same tasks of Tim?2 " +
                Arrays.deepEquals(aliceToDos,timToDos));
        System.out.println("Is Alice having the same tasks of Tim?3 " +
                Arrays.mismatch(aliceToDos,timToDos));

    }
}