package ru.stqa.geometry.figures;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

    public double perimeter(){
        return 2*Math.PI*this.radius;
    }

    public static void printCircleArea(Circle c){
        String text=String.format("Площадь круга с радиусом %f = %f",c.radius,c.area());
        System.out.println(text);
    }

    public static void printCirclePerimeter(Circle c){
        String text = String.format("Периметр круга с радиусом %f = %f",c.radius,c.perimeter());
        System.out.println(text);
    }
}
