package day36_inheritence.shapes;

public class Circle extends Shape{

    // instance variable
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
}
