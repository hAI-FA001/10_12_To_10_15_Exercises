package shape_hierarchy;

import shape_hierarchy.abstract_classes.Shape;
import shape_hierarchy.abstract_classes.ThreeDimensionalShape;
import shape_hierarchy.concrete_classes.*;

public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(2, "Circle");
        shapes[1] = new Square(2, "Square");
        shapes[2] = new Triangle(2,2, "Triangle");

        shapes[3] = new Sphere(2, "Sphere");
        shapes[4] = new Cube(2, "Cube");
        shapes[5] = new Tetrahedron(2, "Tetrahedron");

        for(Shape currentShape : shapes) {
            System.out.println("Processing " + currentShape.getShapeDescription());

            if(currentShape instanceof ThreeDimensionalShape)
                System.out.println("Area: " + currentShape.getArea() +
                        "\nVolume: " + ((ThreeDimensionalShape) currentShape).getVolume());
            else
                System.out.println("Area: " + currentShape.getArea());
            System.out.println();
        }
    }
}
