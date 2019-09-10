package com.playtika.javacourse.lytvynenko.calculator;

import java.util.Scanner;

public class Calculator {

    public double calculate(double val1, double val2, String enteredText) {
        BinaryOperation operation = new BinaryOperationFactory().getOperationFor(enteredText);
        if (operation == null) {
            System.out.println("Неизвестный оператор " + enteredText);
            return Double.NaN;
        }
        return operation.resultFor(val1, val2);
    }

    public static void main(String[] args) {
        System.out.println("Please enter two number and operation with space between");
        System.out.println("Available operators:");
        System.out.println("'*', '-', '+', '/', 'pov', 'log', 'sqrt'");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(Parser.firstOperandParsing(enteredText),Parser.secondOperandParsing(enteredText), Parser.operationParsing(enteredText)));

    }
}
