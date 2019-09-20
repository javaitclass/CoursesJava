package com.playtika.javacourse.lytvynenko.calculator;

public class Parser {

    private String[] splitting (String enteredText){
        return enteredText.split(" ");
    }

    public Arguments getParsedArguments (String enteredText){
        String [] arr = enteredText.split(" ");
        double firstOpearandParsed = Double.parseDouble(arr[0]);
        double secondOpearandParsed = Double.parseDouble(arr[2]);
        String opearationParsed = arr[1];

        return new Arguments(firstOpearandParsed,secondOpearandParsed,opearationParsed);
    }
}

