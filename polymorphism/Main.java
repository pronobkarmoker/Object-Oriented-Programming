package polymorphism;

public class Main {
    public static void main(String[] args) {
       Shapes shape = new Shapes();
       Circle circle= new Circle();
       Square square = new Square();
       Triangle triangle = new Triangle();

       square.area();
       circle.area();
       shape.area();
    }
}
