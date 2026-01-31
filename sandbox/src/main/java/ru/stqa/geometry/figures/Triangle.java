package ru.stqa.geometry.figures;

public record Triangle (double sideA,double sideB,double sideC) {

    public static void printTriangleArea (Triangle t){
        String text = String.format("Площадь треугольника со сторонами %f, %f, %f= %f",t.sideA, t.sideB,t.sideC,t.area());
        System.out.println(text);
    }

    public double area(){
        var semiPerimeter = (this.sideA+this.sideB+this.sideC);
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.sideA) * (semiPerimeter - this.sideB) * (semiPerimeter - this.sideC));
    }

    public double perimeter (){
        return this.sideA+this.sideB+this.sideC;
    }

    public static void printTrianglePerimeter(Triangle t){
        String text =String.format("Периметр треугольника со сторонами %f, %f, %f = %f",t.sideA,t.sideB,t.sideC,t.perimeter());
        System.out.println(text);
    }

}
