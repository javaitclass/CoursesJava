package com.playtika.javacourse.lytvynenko.calculator;

public class Exponent implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left,right);
    }
}
