package visitor.impl;

import org.junit.Before;
import org.junit.Test;
import shape.Shape;
import shape.impl.Circle;
import shape.impl.Rectangle;
import shape.impl.Square;
import visitor.ShapeVisitor;

import static org.junit.Assert.*;

public class AreaTest {
    private ShapeVisitor area;
    private final Shape circle = new Circle(1);
    private final Shape square = new Square(1);
    private final Shape rectangle = new Rectangle(1, 2);

    @Before
    public void setup() {
        area = new Area();
    }

    @Test
    public void visitCircle() {
        circle.accept(area);
        assertEquals(Math.PI, area.getValue(), 0L);
    }

    @Test
    public void visitSquare() {
        square.accept(area);
        assertEquals(1, area.getValue(), 0L);
    }

    @Test
    public void visitRectangle() {
        rectangle.accept(area);
        assertEquals(2, area.getValue(), 0L);
    }
}