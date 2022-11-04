package shape_hierarchy.concrete_classes;

import shape_hierarchy.abstract_classes.TwoDimensionalShape;

public class Square extends TwoDimensionalShape {

    private double length;

    public Square(int length, String shapeDesc){
        super(shapeDesc);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
