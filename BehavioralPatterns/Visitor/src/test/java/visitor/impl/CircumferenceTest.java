package visitor.impl;

import org.junit.Before;
import org.junit.Test;
import shape.Shape;
import shape.impl.Circle;
import shape.impl.Rectangle;
import shape.impl.Square;
import visitor.ShapeVisitor;

import static org.junit.Assert.assertEquals;

public class CircumferenceTest {
    private ShapeVisitor circumference;
    private final Shape circle = new Circle(1);
    private final Shape square = new Square(1);
    private final Shape rectangle = new Rectangle(1, 2);

    @Before
    public void setUp() throws Exception {
        circumference = new Circumference();
    }

    @Test
    public void visitCircle() {
        circle.accept(circumference);
        assertEquals(2 * Math.PI, circumference.getValue(), 0L);
    }

    @Test
    public void visitSquare() {
        square.accept(circumference);
        assertEquals(4, circumference.getValue(), 0L);
    }

    @Test
    public void visitRectangle() {
        rectangle.accept(circumference);
        assertEquals(6, circumference.getValue(), 0L);
    }
}