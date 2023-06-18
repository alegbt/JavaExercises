public class Shape {

    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("shape created");
        this.shapeName= "undefined shape";
    }


    public Shape(double radius){
        System.out.println("circle created");
        this.shapeName="circle";
    }


    public Shape(int edges, double edgeLength){
        System.out.println("square created");
        this.numberOfEdges=4;
        this.shapeName="square";
    }


    public Shape(int edges, double e1, double e2){
        System.out.println("rectangle created");
        this.numberOfEdges=4;
        this.shapeName="rectangle";
    }


    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("triangle created");
        this.numberOfEdges=3;
        this.shapeName="triangle";
    }


    public String  getShapeDetails(){
        return "The shape is a "+shapeName+" and it has "+numberOfEdges+" edges.";
    }

}




