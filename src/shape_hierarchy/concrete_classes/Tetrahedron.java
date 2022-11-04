package shape_hierarchy.concrete_classes;

import shape_hierarchy.abstract_classes.ThreeDimensionalShape;

public class Tetrahedron extends ThreeDimensionalShape {

    private double length;

    public Tetrahedron(double length, String shapeDesc){
        super(shapeDesc);
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length;
    }

    @Override
    public double getVolume() {
        return length * length * length / (6 * Math.sqrt(2));
    }
}
