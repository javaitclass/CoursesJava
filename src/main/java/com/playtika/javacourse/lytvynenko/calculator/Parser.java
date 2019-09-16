package com.playtika.javacourse.lytvynenko.calculator;

public class Parser {
    public String[] splitting (String enteredText){
        return enteredText.split(" ");
    }

    public double firstOperandParsing (String enteredText){
        enteredText = splitting(enteredText)[0];
        return Double.parseDouble(enteredText);
    }

    public String operationParsing (String enteredText){
        return splitting(enteredText)[1];
    }

    public double secondOperandParsing (String enteredText){
        enteredText = splitting(enteredText)[2];
        return Double.parseDouble(enteredText);
    }
}
