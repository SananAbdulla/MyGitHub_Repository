package day36_inheritence.shapes;

public class Square extends Shape{

    // instance variable
    double side;


    public Square(double side) {
        super("Square");
        this.side = side;
    }
}
