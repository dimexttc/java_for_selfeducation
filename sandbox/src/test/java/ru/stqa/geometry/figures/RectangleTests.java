package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {

    @Test
    void canCalculateArea(){
        Rectangle r =new Rectangle(6.0,4.0);
        var result =r.area();
        Assertions.assertEquals(24,result);
    }

    @Test
    void canCalculatePerimeter() {
        Rectangle r = new Rectangle(6.0,4.0);
        var result=r.perimeter();
        Assertions.assertEquals(20,result);
    }
}
