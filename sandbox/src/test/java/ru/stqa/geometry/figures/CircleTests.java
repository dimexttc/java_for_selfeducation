package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTests {
    @Test
    void canCalculateArea(){
        Circle c =new Circle(5.0);
        var result =c.area();
        var delta = 0.0001;
        Assertions.assertEquals(78.5398,result,delta);
    }

    @Test
    void canCalculatePerimeter() {
        Circle c = new Circle(5.0);
        var result=c.perimeter();
        var delta=0.0001;
        Assertions.assertEquals(31.4159,result,delta);
    }
    }
