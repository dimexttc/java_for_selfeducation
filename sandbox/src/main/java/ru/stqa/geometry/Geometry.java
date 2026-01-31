package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        var s =new Square(3.0);
        s.printSquareArea(s);
        Rectangle.printRectangleArea(new Rectangle(2.5,6.3));

        Triangle t =new Triangle(3.5,8.4,9.5);
        Triangle.printTrianglePerimeter(t);
}
}
