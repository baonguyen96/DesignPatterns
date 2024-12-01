import shape.Shape;
import shape.impl.*;
import visitor.ShapeVisitor;
import visitor.impl.Area;
import visitor.impl.Circumference;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(10), new Square(10), new Rectangle(10, 2));

        ShapeVisitor area = new Area();
        ShapeVisitor circumference = new Circumference();

        shapes.forEach(shape -> {
            shape.accept(area);
            System.out.printf("Area of %s is %f\n", shape, area.getValue());

            shape.accept(circumference);
            System.out.printf("Circumference of %s is %f\n", shape, circumference.getValue());
        });


    }
}