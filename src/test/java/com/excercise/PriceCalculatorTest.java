package com.excercise;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidArgument() {
        Item[] items = null;
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.calculate(items);
    }

    @Test
    public void testCalculate() {
        Item[] items = new Item[] { new Fruit("Banana", new BigDecimal("1.25")), new Fruit("Orange", new BigDecimal("1.50")),
                new Fruit("Apple", new BigDecimal("2.25")), new Fruit("Lemon", new BigDecimal("0.75")),
                new Fruit("Peach", new BigDecimal("1.10")), new Fruit("Apple", new BigDecimal("2.25")) };

        BigDecimal expected = new BigDecimal("9.10");

        PriceCalculator priceCalculator = new PriceCalculator();
        BigDecimal cost = priceCalculator.calculate(items);

        assertEquals(expected, cost);
    }

    @Test
    public void testEmptyItems() {
        Item[] items = new Item[] { null };

        BigDecimal expected = BigDecimal.ZERO;

        PriceCalculator priceCalculator = new PriceCalculator();
        BigDecimal cost = priceCalculator.calculate(items);

        assertEquals(expected, cost);
    }

}
