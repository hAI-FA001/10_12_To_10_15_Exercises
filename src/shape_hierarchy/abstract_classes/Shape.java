package shape_hierarchy.abstract_classes;

public abstract class Shape {

    private String shapeDescription;

    public Shape(String shapeDescription){
        this.shapeDescription = shapeDescription;
    }

    public abstract double getArea();

    public String getShapeDescription(){
        return shapeDescription;
    }
}
