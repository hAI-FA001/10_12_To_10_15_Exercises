package shape_hierarchy.abstract_classes;

public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(String shapeDesc){
        super(shapeDesc);
    }
    public abstract double getVolume();
}
