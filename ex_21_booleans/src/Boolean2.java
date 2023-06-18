public class Boolean2 {
    public static void main(String[] args) {


        boolean aa = (55 != 55) && (false^true); //false && true = false
        System.out.println(aa);


        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = 2;
        boolean ab = (!a || !b) || (c == d); //true || true = true
        System.out.println(ab);


        boolean e = false&&true || false && !false; //false || false && !false  >>>  false && !false >>> false
        System.out.println(e);


        boolean f = (false && true) || (false || true); //false || true = true
        System.out.println(f);
    }
}
