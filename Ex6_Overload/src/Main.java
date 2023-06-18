

public class Main {
    public static void main(String[] args) {


        Shape shape = new Shape();
        String figura = shape.getShapeDetails();
        System.out.println(figura);


        Shape circle = new Shape(2.0);
        String cerchio= circle.getShapeDetails();
        System.out.println(cerchio);


        Shape square = new Shape(4,2.5);
        String quadrato = square.getShapeDetails();
        System.out.println(quadrato);


        Shape rectangle = new Shape(4,5.2,3.4);
        String rettangolo = rectangle.getShapeDetails();
        System.out.println(rettangolo);


        Shape triangle = new Shape(3,1.1,1.2,1.3);
        String triangolo = triangle.getShapeDetails();
        System.out.println(triangolo);
    }
}