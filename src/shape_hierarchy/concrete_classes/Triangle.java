package shape_hierarchy.concrete_classes;

import shape_hierarchy.abstract_classes.TwoDimensionalShape;

public class Triangle extends TwoDimensionalShape {

    private double base, height;

    public Triangle(double base, double height, String shapeDesc){
        super(shapeDesc);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
