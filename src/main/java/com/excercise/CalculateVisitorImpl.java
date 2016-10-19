package com.excercise;


import java.math.BigDecimal;

/**
 * visitor class - contains the logic for calculating the price
 */
public class CalculateVisitorImpl implements CalculateVisitor {

    public BigDecimal visit(Fruit fruit) {
        //if required more business logic can be added here like discount to be applied
        //or calculate price according to weight of the item
        return fruit.getPricePerItem();
    }

}
