package com.playtika.javacourse.lytvynenko.calculator;

public class Parser {

    private static String[] splitting (String enteredText){
        String splittedStr [] = enteredText.split(" ");
        return splittedStr;
    }

    public static double firstOperandParsing (String enteredText){
        String number = splitting(enteredText)[0];
         double x = Double.parseDouble(number);
        return x;
    }

    public static String operationParsing (String enteredText){
        String operation = splitting(enteredText)[1];
        return operation;
    }

    public static double secondOperandParsing (String enteredText){
        String number = splitting(enteredText)[2];
        double y = Double.parseDouble(number);
        return y;
    }

}
