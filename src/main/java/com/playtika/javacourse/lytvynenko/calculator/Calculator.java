package com.playtika.javacourse.lytvynenko.calculator;

import java.util.Scanner;

public class Calculator {

    public double calculate(double val1, double val2, String enteredText) throws OperationExeption {
        BinaryOperation operation = new BinaryOperationFactory().getOperationFor(enteredText);
       if (operation == null) {
               throw new OperationExeption("unknown оператор");
        }
        return operation.resultFor(val1, val2);
    }

    public static void main(String[] args) throws OperationExeption {
        System.out.println("Please enter two number and operation with space between");
        System.out.println("Available operators:");
        System.out.println("'*', '-', '+', '/', 'pov', 'log', 'sqrt'");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        Calculator calculator = new Calculator();
        double result = 0;
        result = calculator.calculate(Parser.firstOperandParsing(enteredText),Parser.secondOperandParsing(enteredText), Parser.operationParsing(enteredText));
        System.out.println(result);
    }
}
