public class Boolean3 {
    public static void main(String[] args) {

        boolean a =  !(!(!(false ^ false) || (true && true)));
        //!(!(!(false) || true)) >>> !(!(true || true)) >>> !(!(true)) >>>  !(false) >>> true == true
        System.out.println(a);

        int x = 3;
        int y = 2;
        boolean z = !((x * y) <= 6) && (x - y != 1);
        //!((3 * 2) <= 6) && (3 - 2 != 1) >>> !(6 <= 6) && (1 != 1) >>>  !(true) && (false) >>> false && false == false
        System.out.println(z);

    }
}
