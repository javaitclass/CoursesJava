package com.playtika.javacourse.lytvynenko.calculator;

public class Arguments {
    private double firstOpearandParsed;
    private double secondOpearandParsed;
    private String opearationParsed;

    public Arguments(double firstOpearandParsed, double secondOpearandParsed, String opearationParsed) {
        this.firstOpearandParsed = firstOpearandParsed;
        this.secondOpearandParsed = secondOpearandParsed;
        this.opearationParsed = opearationParsed;
    }

    public double getFirstOpearandParsed() {
        return firstOpearandParsed;
    }

    public double getSecondOpearandParsed() {
        return secondOpearandParsed;
    }

    public String getOpearationParsed() {
        return opearationParsed;
    }

}
