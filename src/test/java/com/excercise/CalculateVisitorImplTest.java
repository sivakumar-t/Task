package com.excercise;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculateVisitorImplTest {

    @Test
    public void testVisit() {
        Fruit apple = new Fruit("Apple", new BigDecimal("2.25"));

        BigDecimal expected = new BigDecimal("2.25");

        CalculateVisitor visitor = new CalculateVisitorImpl();
        BigDecimal actual =  visitor.visit(apple);

        assertEquals(expected, actual);
    }

}
