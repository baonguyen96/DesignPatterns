package bridge.shape;

import bridge.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing " + this.color.applyColor() + " Square";
    }
}
