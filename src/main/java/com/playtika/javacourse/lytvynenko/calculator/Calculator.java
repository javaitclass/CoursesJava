package com.playtika.javacourse.lytvynenko.calculator;

import java.util.Scanner;

public class Calculator {
    private BinaryOperation operation;
    private Parser parser;
    private double firstOpearandParsed;
    private double secondOpearandParsed;
    private String opearationParsed;

    public double calculate(String enteredText) throws OperationExeption {
        parser = new Parser();
        firstOpearandParsed = parser.firstOperandParsing(enteredText);
        secondOpearandParsed = parser.secondOperandParsing(enteredText);
        opearationParsed = parser.operationParsing(enteredText);
        operation = new BinaryOperationFactory().getOperationFor(opearationParsed);
        if (operation == null) {
               throw new OperationExeption("unknown operator");
        }
        return operation.resultFor(firstOpearandParsed, secondOpearandParsed);
    }

    public static void main(String[] args) throws OperationExeption {
        System.out.println("Please enter two number and operation with space between");
        System.out.println("Available operators:");
        System.out.println("'*', '-', '+', '/', 'pov', 'log', 'sqrt'");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(enteredText));
    }
}
