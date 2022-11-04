package shape_hierarchy.concrete_classes;

import shape_hierarchy.abstract_classes.ThreeDimensionalShape;

public class Sphere extends ThreeDimensionalShape {

    private double radius;
    private final double PI = 22/7;

    public Sphere(double radius, String shapeDesc){
        super(shapeDesc);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * PI * radius * radius * radius / 3;
    }
}
