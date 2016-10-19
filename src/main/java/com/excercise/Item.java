package com.excercise;


import java.math.BigDecimal;

public interface Item {

    BigDecimal accept(CalculateVisitor visitor);

}
