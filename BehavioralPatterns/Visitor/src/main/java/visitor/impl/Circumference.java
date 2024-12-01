package visitor.impl;

import shape.impl.Circle;
import shape.impl.Rectangle;
import shape.impl.Square;
import visitor.ShapeVisitor;

public class Circumference implements ShapeVisitor {
    private double value;

    public Circumference() {
        this.value = 0;
    }

    @Override
    public void visit(Circle circle) {
        this.value = circle.getRadius() * 2 * Math.PI;
    }

    @Override
    public void visit(Square square) {
        this.value = square.getSide() * 4;
    }

    @Override
    public void visit(Rectangle rectangle) {
        this.value = (rectangle.getLength() + rectangle.getWidth()) * 2;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
