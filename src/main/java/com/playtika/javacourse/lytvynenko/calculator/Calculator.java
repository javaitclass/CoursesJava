package com.playtika.javacourse.lytvynenko.calculator;

import java.util.Scanner;

public class Calculator {
    private BinaryOperationFactory operationFactory = new BinaryOperationFactory();

    public double calculate(Arguments operators) throws OperationExeption {
        BinaryOperation operation = operationFactory.getOperationFor(operators.getOpearationParsed());
        if (operation == null) {
            throw new OperationExeption("unknown operator");
        }
        return operation.resultFor(operators.getFirstOpearandParsed(), operators.getSecondOpearandParsed());
    }

    public static void main(String[] args) throws OperationExeption {
        System.out.println("Please enter two number and operation with space between");
        System.out.println("Available operators:");
        System.out.println("'*', '-', '+', '/', 'pov', 'log', 'sqrt'");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        Arguments arguments = new Parser().getParsedArguments(enteredText);
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(arguments));
    }
}
