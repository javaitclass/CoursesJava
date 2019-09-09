package com.playtika.javacourse.lytvynenko.calculator;

public class Logarithm implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.log(right)/Math.log(left);
    }
}
