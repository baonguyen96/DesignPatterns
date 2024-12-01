package shape;

import visitor.ShapeVisitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
