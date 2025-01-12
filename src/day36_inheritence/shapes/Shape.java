package day36_inheritence.shapes;

public class Shape {
    // instance variable
    String name;

    public Shape(String name) {
        this.name = name;

    }

    // mehod called area
    public double area() {

        return 0.0;
    }

    double perimeter () {

        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
