package com.excercise;


import java.math.BigDecimal;

/**
 * class that represents the fruit item
 */
public class Fruit implements Item {

    private String name;
    private BigDecimal pricePerItem;

    public Fruit(String name, BigDecimal pricePerItem) {
        if(name == null || pricePerItem == null) {
            throw new IllegalArgumentException("both name and price per item are required");
        }
        this.name = name;
        this.pricePerItem = pricePerItem;
    }

    public BigDecimal getPricePerItem() {
        return pricePerItem;
    }

    public BigDecimal accept(CalculateVisitor visitor) {
        return visitor.visit(this);
    }

}
