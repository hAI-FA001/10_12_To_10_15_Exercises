package shape_hierarchy.concrete_classes;

import shape_hierarchy.abstract_classes.ThreeDimensionalShape;

public class Cube extends ThreeDimensionalShape {

    private double length;

    public Cube(double length, String shapeDesc){
        super(shapeDesc);
        this.length = length;
    }

    @Override
    public double getArea() {
        return 6 * (length * length);
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }
}
