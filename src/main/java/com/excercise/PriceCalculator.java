package com.excercise;


import java.math.BigDecimal;

/**
 * main class which computes the cost of items
 */
public class PriceCalculator {

    /**
     * calculate the total cost of passed in items
     * @param items
     * @return BigDecimal cost of items
     */
    public BigDecimal calculate(Item[] items) {
        if(items == null)
            throw new IllegalArgumentException("items should not be null");

        BigDecimal cost = BigDecimal.ZERO;
        CalculateVisitor visitor = new CalculateVisitorImpl();
        for(Item item : items) {
            if(item != null) {
                cost = cost.add(item.accept(visitor));
            }
        }

        return cost;
    }

    public static void main(String[] args) {

        Item[] items = new Item[] { new Fruit("Banana", new BigDecimal("1.25")), new Fruit("Orange", new BigDecimal("1.50")),
                new Fruit("Apple", new BigDecimal("2.00")), new Fruit("Lemon", new BigDecimal("0.75")),
                new Fruit("Peach", new BigDecimal("1.10")), new Fruit("Apple", new BigDecimal("2.00")) };

        PriceCalculator priceCalculator = new PriceCalculator();
        BigDecimal cost = priceCalculator.calculate(items);
        System.out.println("Total cost : "+cost);

    }

}
