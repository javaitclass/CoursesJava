package com.playtika.javacourse.lytvynenko.calculator;

public class BinaryOperationFactory {

    public BinaryOperation getOperationFor(String operator) {
        switch (operator){
            case "*": return new Multiplication();
            case "-": return new Substraction();
            case "+": return new Adition();
            case "/": return new Division();
            case "pov": return new Exponent();
            case "log": return new Logarithm();
            case "sqrt": return new SqrtPow();

            default: throw new OperationExeption("unknown оператор");
        }
    }
}

