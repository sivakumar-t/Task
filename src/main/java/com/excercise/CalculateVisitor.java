package com.excercise;


import java.math.BigDecimal;

public interface CalculateVisitor {

    BigDecimal visit(Fruit fruit);

}
