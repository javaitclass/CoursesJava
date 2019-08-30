package com.playtika.javacourse.lytvynenko.triangle;
public class Point {

    private final float x;
    private final float y;

    public Point (float x , float y){
        this.x = Math.round(x*10)/10;
        this.y = Math.round(y*10)/10;
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
        distance = (float)((int)( distance *10f ))/10f;
        return distance;
    }
}
