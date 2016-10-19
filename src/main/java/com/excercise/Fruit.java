package com.excercise;


import java.math.BigDecimal;

public class Fruit implements Item {

    private String name;
    private BigDecimal pricePerItem;

    public Fruit(String name, BigDecimal pricePerItem) {
        if(name == null || pricePerItem == null) {
            throw new IllegalArgumentException();
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
