public class boolean4 {
    public static void main(String[] args) {


        int a = 1;
        int b = 3;
        int c = a*b;
        int d = c;
        boolean e = (d / c + 2) >= b || !(c + b - c / a == 3);
    //(3 / 3 + 2) >= 3 || !(3 + 3 - 3 / 1 == 3)
    //(1 + 2) >= 3 || !(3 + 3 - 3 == 3)
    //3 >= 3 || !(3== 3)
    //true || !(true)
    //true || false
    //true
        System.out.println(e);


        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        boolean z = (x * x - y * y / 2 != 12) || !t && f;
    //(5 * 5 - 6 * 6 / 2 != 12) || !false && true
    //(25 - 36 / 2 != 12) || !false && true
    //(25 - 18 != 12) || !false && true
    //(7 != 12) || !false && true
    //true || !false && true
    //true && true
    //true
        System.out.println(z);
    }
}
