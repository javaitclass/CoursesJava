package com.playtika.javacourse.lytvynenko.calculator;

public class Division implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return left / right;
    }
}
