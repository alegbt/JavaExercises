public class GenericsClass <T>{

private T t;

public T getT(){
    return t;
}

public T setT(T valueToSet){
    this.t = valueToSet;
    return valueToSet;
}

public static boolean isEqual(GenericsClass gc1, GenericsClass gc2){
    boolean isEqual = gc1.getT().equals(gc2.getT());
    return isEqual;
}



}
