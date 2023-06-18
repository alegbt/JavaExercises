public class Main {
    public static void main(String[] args) {

        boolean a = 2 <= 2 && !true; //true && false = false
        System.out.println(a);

        boolean b = !false && 3>2; //true && true = true
        System.out.println(b);

        boolean t = false;
        boolean f = true;
        boolean tf = (!t || f); // true || true = true
        System.out.println(tf);

        boolean d = 6>6 ^ !(true&&true); // false ^ false = false
        System.out.println(d);
    }
}