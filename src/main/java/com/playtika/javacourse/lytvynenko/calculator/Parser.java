package com.playtika.javacourse.lytvynenko.calculator;

public class Parser {

    private String[] splitting (String enteredText){
        String splittedStr [] = enteredText.split(" ");
        return splittedStr;
    }

    public double firstOperandParsing (String enteredText){
        String number = splitting(enteredText)[0];
         double x = Double.parseDouble(number);
        return x;
    }

    public String operationParsing (String enteredText){
        String operation = splitting(enteredText)[1];
        return operation;
    }

    public double secondOperandParsing (String enteredText){
        String number = splitting(enteredText)[2];
        double y = Double.parseDouble(number);
        return y;
    }

}
