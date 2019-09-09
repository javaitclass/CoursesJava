package com.playtika.javacourse.lytvynenko.calculator;

public class SqrtPow implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, 1.0/right);
    }
}
