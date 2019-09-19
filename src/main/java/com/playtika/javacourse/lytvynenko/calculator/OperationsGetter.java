package com.playtika.javacourse.lytvynenko.calculator;

public class OperationsGetter {
    private double firstOpearandParsed;
    private double secondOpearandParsed;
    private String opearationParsed;
    private Parser parser = new Parser();

    public OperationsGetter(double firstOpearandParsed, double secondOpearandParsed, String opearationParsed) {
        this.firstOpearandParsed = firstOpearandParsed;
        this.secondOpearandParsed = secondOpearandParsed;
        this.opearationParsed = opearationParsed;

    }

    public OperationsGetter() {

    }

    public double getFirstOpearandParsed() {
        return firstOpearandParsed;
    }

    public double getSecondOpearandParsed() {
        return secondOpearandParsed;
    }

    public String getOpearationParsed() {
        return opearationParsed;
    }

    public OperationsGetter operate(String enteredText){
        firstOpearandParsed = parser.firstOperandParsing(enteredText);
        secondOpearandParsed = parser.secondOperandParsing(enteredText);
        opearationParsed = parser.operationParsing(enteredText);
        return new OperationsGetter(firstOpearandParsed, secondOpearandParsed, opearationParsed);
    }
}
