package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double sideA, double sideB) {
        String text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", sideA, sideB, rectangleArea(sideA, sideB));
        System.out.println(text);
    }

    private static double rectangleArea(double sideA, double sideB) {
        return sideA*sideB;
    }
}
