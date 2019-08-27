package com.playtika.javacourse.lytvynenko.triangle;
public class Point {

    private float x;
    private float y;

    public Point (float x , float y){
        this.x = x;
        this.y = y;
    }

    public float distance(Point pointTo) {
        return (float) Math.sqrt((this.x * pointTo.x) + (this.y*pointTo.y));
    }



}
