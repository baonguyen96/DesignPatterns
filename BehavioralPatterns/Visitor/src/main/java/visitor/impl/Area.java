package visitor.impl;

import shape.impl.Circle;
import shape.impl.Rectangle;
import shape.impl.Square;
import visitor.ShapeVisitor;

public class Area implements ShapeVisitor {
    private double value;

    public Area() {
        this.value = 0;
    }

    @Override
    public void visit(Circle circle) {
        this.value = circle.getRadius() * circle.getRadius() * Math.PI;
    }

    @Override
    public void visit(Square square) {
        this.value = square.getSide() * square.getSide();
    }

    @Override
    public void visit(Rectangle rectangle) {
        this.value = rectangle.getLength() * rectangle.getWidth();
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
