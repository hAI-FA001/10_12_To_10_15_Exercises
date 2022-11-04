package shape_hierarchy.concrete_classes;

import shape_hierarchy.abstract_classes.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape {
    private double radius;
    private final double PI = 22/7;

    public Circle(double radius, String shapeDesc){
        super(shapeDesc);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
