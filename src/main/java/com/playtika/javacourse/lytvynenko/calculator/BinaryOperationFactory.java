package com.playtika.javacourse.lytvynenko.calculator;

public class BinaryOperationFactory {

    public BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)){
            return new Substraction();
        }else if ("+".equals(operator)){
            return new Adition();
        }else if ("/".equals(operator)){
            return new Division();
        }else if ("pov".equals(operator)){
            return new Exponent();
        }else if ("log".equals(operator)){
            return new Logarithm();
        }else if ("sqrt".equals(operator)){
            return new SqrtPow();
        }
        return null;
    }
}

