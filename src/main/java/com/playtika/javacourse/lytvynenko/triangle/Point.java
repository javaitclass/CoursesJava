package com.playtika.javacourse.lytvynenko.triangle;
public class Point {

    private final float x;
    private final float y;

    public Point (float x , float y){
        this.x = MathOperator.rounding(x);
        this.y = MathOperator.rounding(y);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ";" + getY() + ")";
    }

    public float distance(Point pointTo) {
        float distance = (float) Math.sqrt((float)Math.pow(this.x - pointTo.x, 2) + (float)Math.pow(this.y - pointTo.y, 2));
        distance = MathOperator.rounding(distance);
        return distance;
    }
}
