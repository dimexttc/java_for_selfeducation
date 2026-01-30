public class Geometry {
    public static void main(String[] args) {
        printSquareArea(3.0);
        printRectangleArea(2.0, 3.0);
    }

    private static void printRectangleArea(double sideA, double sideB) {
        System.out.println("Площадь квадрата со сторонами " + sideA + " и " + sideB + " = " + rectangleArea(sideA,sideB));
    }

    private static double rectangleArea(double sideA, double sideB) {
        return sideA*sideB;
    }

    static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));
    }

    private static double squareArea(double side) {
        return side * side;
    }

    ;
}
