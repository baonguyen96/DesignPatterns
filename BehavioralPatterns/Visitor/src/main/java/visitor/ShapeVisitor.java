package visitor;

import shape.impl.Circle;
import shape.impl.Rectangle;
import shape.impl.Square;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Rectangle rectangle);
    double getValue();
}