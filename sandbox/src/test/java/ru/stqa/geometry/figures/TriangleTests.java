package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea(){
        Triangle t =new Triangle(3.5,8.4,9.5);
        var result =t.area();
        var delta =0.0001;
        Assertions.assertEquals(243.4325,result,delta);
    }

    @Test
    void canCalculatePerimeter(){
        Triangle t =new Triangle(3.5,8.4,9.5);
        var result =t.perimeter();
        var delta =0.0001;
        Assertions.assertEquals(21.4000,result,delta);
    }
}
