import bridge.color.Blue;
import bridge.color.Red;
import bridge.shape.Shape;
import bridge.shape.Square;
import bridge.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape redSquare = new Square(new Red());
        System.out.println(redSquare.draw());

        Shape blueTriangle = new Triangle(new Blue());
        System.out.println(blueTriangle.draw());
    }
}
