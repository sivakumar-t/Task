package com.excercise;


import java.math.BigDecimal;

public class CalculateVisitorImpl implements CalculateVisitor {

    public BigDecimal visit(Fruit fruit) {
        return fruit.getPricePerItem();
    }

}
